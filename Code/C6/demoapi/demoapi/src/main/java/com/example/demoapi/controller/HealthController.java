package com.example.demoapi.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {
/****************** Windsuft Command **********************************/
/****************** 21500c81-b9ef-4446-9d1c-7a8e9b8d4b8e ****************/
    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        return Map.of(
        "status", "OK",
        "message", "Demo API is healthy");
    }
}
