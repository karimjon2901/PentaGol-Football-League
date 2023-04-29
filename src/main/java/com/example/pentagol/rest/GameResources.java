package com.example.pentagol.rest;

import com.example.pentagol.dto.GameDto;
import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.service.GameService;
import com.example.pentagol.service.mapper.GameMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameResources {
    private final GameService gameService;
    private final GameMapper gameMapper;

    @GetMapping
    public ResponseDto<List<GameDto>> getAll(){
        return gameService.getAll();
    }

    @PostMapping
    public ResponseDto<GameDto> addGame(@RequestBody GameDto gameDto){
        return gameService.addGame(gameDto);
    }
}
