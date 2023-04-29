package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.PointDto;
import com.example.pentagol.model.Point;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PointMapper implements CommonMapper<Point, PointDto>{
    @Override
    public abstract Point toEntity(PointDto pointDto);

    @Override
    public abstract PointDto toDto(Point point);
}
