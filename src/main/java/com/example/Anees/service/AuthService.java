package com.example.Anees.service;


import com.example.Anees.DTO.AuthRequste;
import com.example.Anees.config.JwtService;
import com.example.Anees.model.MyUser;
import com.example.Anees.model.Role;
import com.example.Anees.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public String getUsers(AuthRequste authRequste){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authRequste.getUsername(),
                        authRequste.getPassword()
                )
        );
        var user = userRepository.findMyUserByUsername(authRequste.getUsername())
                .orElseThrow();
        return jwtService.generateToken(user);
    }

    public String addUser(MyUser myUser) {
        String hashedPassword= new BCryptPasswordEncoder().encode(myUser.getPassword());
        myUser.setPassword(hashedPassword);
//        System.out.println(myUser.getId());
//        System.out.println(myUser.getUsername());
//        System.out.println(myUser.getPassword());
//        System.out.println(myUser.getEmail());
//        System.out.println(myUser.getRole());
        myUser.setRole(Role.USER);
        userRepository.save(myUser);
        return jwtService.generateToken(myUser);
    }
}
