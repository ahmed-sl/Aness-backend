package com.example.Anees.controller;


import com.example.Anees.model.MyUser;
import com.example.Anees.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthController {


    private final AuthService authService;
//
    @PostMapping("register")
    public ResponseEntity<String> addUser(@RequestBody @Valid MyUser myUser, Errors errors){
        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(errors.getFieldError().getDefaultMessage());
        }
        String message = authService.addUser(myUser);
        return ResponseEntity.status(201).body(message);
    }

}
