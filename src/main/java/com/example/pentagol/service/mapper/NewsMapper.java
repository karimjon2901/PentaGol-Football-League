package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.NewsDto;
import com.example.pentagol.model.News;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class NewsMapper implements CommonMapper<News, NewsDto>{

    @Override
    public abstract News toEntity(NewsDto newsDto);

    @Override
    public abstract NewsDto toDto(News news);
}
