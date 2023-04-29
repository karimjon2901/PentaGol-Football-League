package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.TeamDto;
import com.example.pentagol.model.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TeamMapper implements CommonMapper<Team, TeamDto>{
    @Override
    public abstract Team toEntity(TeamDto teamDto);

    @Override
    public abstract TeamDto toDto(Team team);
}
