package com.example.rest_service.mappers;

import com.example.rest_service.dtos.UserDto;
import com.example.rest_service.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
