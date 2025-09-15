package com.springbootticketingsystem.mapper;
import com.springbootticketingsystem.dto.user.UserRequestDTO;
import com.springbootticketingsystem.dto.user.UserResponseDTO;
import com.springbootticketingsystem.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponseDTO toResponseDto(User user) {
        UserResponseDTO userDTO = new UserResponseDTO();
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setSurname(user.getSurname());
        userDTO.setRol(user.getRol());
        return userDTO;

    }


    public User toEntity(UserRequestDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setSurname(userDTO.getSurname());
        user.setRol(userDTO.getRol());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}
