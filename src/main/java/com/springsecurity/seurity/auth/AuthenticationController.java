package com.springsecurity.seurity.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private  final AuthenticationService service;
 
    @PostMapping("/register")
        public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest register){
                return ResponseEntity.ok(service.register(register));

            }

 @PostMapping("/authenticate")
        public ResponseEntity<AuthenticationResponse> register(
            @RequestBody AuthenticationRequest register){
                  return ResponseEntity.ok(service.authenticate(register));

                
            }

   
    


}
