package com.example.vuetest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("홈페이지");
    }
}
