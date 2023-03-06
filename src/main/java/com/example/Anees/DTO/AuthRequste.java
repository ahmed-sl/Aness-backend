package com.example.Anees.DTO;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class AuthRequste {
    private String username;
    private String password;
}
