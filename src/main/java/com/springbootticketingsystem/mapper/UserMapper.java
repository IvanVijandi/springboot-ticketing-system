package com.springbootticketingsystem.mapper;

import com.springbootticketingsystem.dto.user.UserRequestDTO;
import com.springbootticketingsystem.dto.user.UserResponseDTO;
import com.springbootticketingsystem.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDTO toDto(User user);
    User toEntity(UserRequestDTO dto);
}
