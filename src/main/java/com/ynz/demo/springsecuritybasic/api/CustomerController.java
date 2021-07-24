package com.ynz.demo.springsecuritybasic.api;

import com.ynz.demo.springsecuritybasic.domain.Customer;
import com.ynz.demo.springsecuritybasic.domain.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("apis/customers")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping
    public Iterable<Customer> getAllCustomers(Principal principal) {
        log.info("login user: {}", principal.getName());
        return customerRepository.findAll();
    }

}
