package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.GoalsDto;
import com.example.pentagol.model.Goals;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class GoalsMapper implements CommonMapper<Goals, GoalsDto>{
    @Override
    public abstract Goals toEntity(GoalsDto goalsDto);

    @Override
    public abstract GoalsDto toDto(Goals goals);
}
