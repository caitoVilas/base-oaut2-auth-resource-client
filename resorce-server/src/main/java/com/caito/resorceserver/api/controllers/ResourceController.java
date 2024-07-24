package com.caito.resorceserver.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @GetMapping("/user")
    public ResponseEntity<String> read_use(Authentication authentication){
        return ResponseEntity.ok("User can be read, " + authentication.getAuthorities());
    }

    @PostMapping("/user")
    public ResponseEntity<String> write_user(Authentication authentication){
        return ResponseEntity.ok("User can be written, " + authentication.getAuthorities());
    }
}
