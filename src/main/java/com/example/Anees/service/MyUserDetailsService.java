package com.example.Anees.service;

import com.example.Anees.model.MyUser;
import com.example.Anees.repository.UserRepository;
import lombok.AllArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class MyUserDetailsService  {
    //implements UserDetailsService

    private final UserRepository userRepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<MyUser> optionalMyUser=userRepository.findMyUserByUsername(username);
//        if(optionalMyUser.isEmpty()){
//            throw new UsernameNotFoundException("Username not found");
//        }
//        return optionalMyUser.get();
//    }
}
