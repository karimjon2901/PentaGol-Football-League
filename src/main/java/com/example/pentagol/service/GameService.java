package com.example.pentagol.service;

import com.example.pentagol.dto.GameDto;
import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.model.Game;
import com.example.pentagol.repository.GameRepository;
import com.example.pentagol.service.mapper.GameMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pentagol.service.AppStatus.AppStatusCodes.*;
import static com.example.pentagol.service.AppStatus.AppStatusMessages.*;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    public ResponseDto<List<GameDto>> getAll() {
        List<Game> games = gameRepository.findAll();

        return ResponseDto.<List<GameDto>>builder()
                .message(OK)
                .code(OK_CODE)
                .success(true)
                .data(games.stream().map(gameMapper::toDto).toList())
                .build();
    }

    public ResponseDto<GameDto> addGame(GameDto gameDto) {
        gameRepository.save(gameMapper.toEntity(gameDto));

        return ResponseDto.<GameDto>builder()
                .message(OK)
                .code(OK_CODE)
                .success(true)
                .data(gameDto)
                .build();
    }
}
