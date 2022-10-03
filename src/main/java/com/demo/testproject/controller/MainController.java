package com.demo.testproject.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {

    @GetMapping(value = "/")
    public ResponseEntity<String> defaultCall() {
        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }

    @GetMapping(value = "/health")
    public ResponseEntity<String> testApiCall() {
        return new ResponseEntity<String>("{\"status\": \"HealthCheck Success\"}", HttpStatus.OK);
    }
}
