package com.example.myapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("Hello, World!");
    }

    @PostMapping("/submit")
    public String submitData(@RequestBody String data) {
        return "Data received: " + data;
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Long id) {
        return "User ID: " + id;
    }

    @GetMapping("/search")
    public String search(@RequestParam(name = "query", defaultValue = "") String query) {
        return "Search results for: " + query;
    }
}