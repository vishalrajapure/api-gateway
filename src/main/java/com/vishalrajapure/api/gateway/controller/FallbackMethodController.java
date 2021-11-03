package com.vishalrajapure.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallbackMethod() {
        return "User service is taking longer than expected time. Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallbackMethod() {
        return "Department service is taking longer than expected time. Please try again later";
    }

}
