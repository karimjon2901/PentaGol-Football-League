package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.GameDto;
import com.example.pentagol.model.Game;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class GameMapper implements CommonMapper<Game, GameDto>{
    @Override
    public abstract Game toEntity(GameDto gameDto);

    @Override
    @Mapping(target = "teamA", expression = "java(teamMapper.toDto(game.getTeamA()))")
    @Mapping(target = "teamB", expression = "java(teamMapper.toDto(game.getTeamB()))")
    public abstract GameDto toDto(Game game);
}
