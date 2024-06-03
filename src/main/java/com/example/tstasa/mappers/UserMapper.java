package com.example.tstasa.mappers;


import com.example.tstasa.dtos.RegisterRequest;
import com.example.tstasa.dtos.UserDto;
import com.example.tstasa.entities.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User registerRequestToUser(RegisterRequest registerRequest);

    UserDto userToUserDto(User user);
}
