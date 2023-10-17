package com.springsecurity.seurity.Demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class Demo {

    @GetMapping
    public ResponseEntity<String>sayHello(){
        return ResponseEntity.ok("hello from secured endpont");
    }
    
}
