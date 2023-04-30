package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.GameDto;
import com.example.pentagol.model.Game;
import com.example.pentagol.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
//@RequiredArgsConstructor
public abstract class GameMapper implements CommonMapper<Game, GameDto>{
    @Autowired
    protected GameRepository gameRepository;
    @Autowired
    protected TeamMapper teamMapper;
    @Override
//    @Mapping(target = "teamA", expression = "java(gameRepository.findById(gameDto.getTeamA()))")
//    @Mapping(target = "teamB", expression = "java(gameRepository.findById(gameDto.getTeamB()))")
    public abstract Game toEntity(GameDto gameDto);

    @Override
    @Mapping(target = "teamA", expression = "java(teamMapper.toDto(game.getTeamA()))")
    @Mapping(target = "teamB", expression = "java(teamMapper.toDto(game.getTeamB()))")
    public abstract GameDto toDto(Game game);
}
