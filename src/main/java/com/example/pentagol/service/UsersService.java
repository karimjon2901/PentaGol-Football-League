package com.example.pentagol.service;

import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.dto.UsersDto;
import com.example.pentagol.repository.UsersRepository;
import com.example.pentagol.service.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;
    private final UsersMapper usersMapper;

//    public ResponseDto<UsersDto> addUser(UsersDto usersDto) {
//    }
}
