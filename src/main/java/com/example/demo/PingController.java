package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PingController {

    // Simple GET endpoint
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    // DTO class to receive input
    public static class AddRequest {
        public int num1;
        public int num2;
    }

    // POST endpoint to add two numbers
    @PostMapping("/add")
    public int addNumbers(@RequestBody AddRequest request) {
        return request.num1 + request.num2;
    }
}
