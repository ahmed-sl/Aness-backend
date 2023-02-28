package com.example.Anees.service;


import com.example.Anees.model.MyUser;
import com.example.Anees.repository.UserRepository;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public List<MyUser> getUsers(){
        return userRepository.findAll();
    }

    public void register(MyUser myUser){
//        String hashedPassword= new BCryptPasswordEncoder().encode(myUser.getPassword());
//        myUser.setPassword(hashedPassword);
        myUser.setRole("User");
        System.out.println(myUser.getId());
        System.out.println(myUser.getUsername());
        System.out.println(myUser.getPassword());
        System.out.println(myUser.getEmail());
        System.out.println(myUser.getRole());
        userRepository.save(myUser);
    }
}
