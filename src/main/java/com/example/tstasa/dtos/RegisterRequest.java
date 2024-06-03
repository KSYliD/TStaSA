package com.example.busstationgfl.dtos.requests;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    @NotNull(message = "Password should not be null")
    @NotEmpty(message = "Password should not be empty")
    @Size(min = 8, message = "Password should be at least 8 characters")
    private String password;
    @NotNull(message = "Phone number should not be null")
    @NotEmpty(message = "Phone number should not be empty")
    private String phoneNumber;
    @NotNull(message = "Name should not be null")
    @NotEmpty(message = "Name should not be empty")
    private String firstName;
    @NotNull(message = "Surname should not be null")
    @NotEmpty(message = "Surname should not be empty")
    private String secondName;
    @Email(message = "Email should be valid")
    private String email;
}
