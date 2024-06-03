package com.example.tstasa.dtos;

import com.example.tstasa.entities.user.Role;
import lombok.*;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private long id;
    private String firstName;
    private String secondName;
    private Set<Role> role;
    private String phoneNumber;
    private String email;

}
