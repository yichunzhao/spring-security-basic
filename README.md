# spring-security-basic

http://localhost:8080/apis/customers

Spring Security’s HTTP Basic Authentication support in is enabled by default. However, as soon as any servlet based configuration is provided, HTTP Basic must be explicitly provided.

A minimal, explicit configuration can be found below:
````
protected void configure(HttpSecurity http) {
    http
        // ...
        .httpBasic(withDefaults());
}
````
