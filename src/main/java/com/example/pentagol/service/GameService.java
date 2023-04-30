package com.example.pentagol.service;

import com.example.pentagol.dto.GameDto;
import com.example.pentagol.dto.GameInputDto;
import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.model.Game;
import com.example.pentagol.repository.GameRepository;
import com.example.pentagol.repository.TeamRepository;
import com.example.pentagol.service.mapper.GameMapper;
import com.example.pentagol.service.mapper.TeamMapper;
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
    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public ResponseDto<List<GameDto>> getAll() {
        List<Game> games = gameRepository.findAll();

        return ResponseDto.<List<GameDto>>builder()
                .message(OK)
                .code(OK_CODE)
                .success(true)
                .data(games.stream().map(gameMapper::toDto).toList())
                .build();
    }

    public ResponseDto<GameDto> addGame(GameInputDto gameInputDto) {
        GameDto gameDto1 = new GameDto();
        gameDto1.setLigaName(gameInputDto.getLigaName());
        gameDto1.setResultA(gameInputDto.getResultA());
        gameDto1.setResultB(gameInputDto.getResultB());
        gameDto1.setTeamA(teamMapper.toDto(teamRepository.findByName(gameInputDto.getTeamA())));
        gameDto1.setTeamB(teamMapper.toDto(teamRepository.findByName(gameInputDto.getTeamB())));
        System.out.println(gameDto1.getTeamA().getName());

        gameRepository.save(gameMapper.toEntity(gameDto1));

        return ResponseDto.<GameDto>builder()
                .message(OK)
                .code(OK_CODE)
                .success(true)
                .data(gameDto1)
                .build();
    }

}
