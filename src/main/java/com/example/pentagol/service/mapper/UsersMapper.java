package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.UsersDto;
import com.example.pentagol.model.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UsersMapper implements CommonMapper<Users, UsersDto>{
    @Override
    public abstract Users toEntity(UsersDto usersDto);

    @Override
    public abstract UsersDto toDto(Users users);
}
