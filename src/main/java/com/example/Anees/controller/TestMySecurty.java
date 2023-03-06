package com.example.Anees.controller;

import com.example.Anees.DTO.AuthRequste;
import com.example.Anees.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@RequiredArgsConstructor
public class TestMySecurty {

    private final AuthService authService;

    @GetMapping("tset")
    public ResponseEntity<String> getUsers(@RequestBody AuthRequste authRequste){
        return ResponseEntity.status(200).body(authService.getUsers(authRequste));
    }
}
