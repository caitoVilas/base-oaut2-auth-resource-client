package com.caito.clientapp.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
public class ClientController {

    @GetMapping("/authorized")
    public Map<String,String> authorize(@RequestParam String code) {
        return Collections.singletonMap("code", code);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, World!");
    }
}
