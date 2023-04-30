package com.example.pentagol.rest;

import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.dto.UsersDto;
import com.example.pentagol.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersResources{
    private final UsersService usersService;
//    @PostMapping
//    public ResponseDto<UsersDto> addUser(@RequestBody UsersDto usersDto){
//        return usersService.addUser(usersDto);
//    }
}
