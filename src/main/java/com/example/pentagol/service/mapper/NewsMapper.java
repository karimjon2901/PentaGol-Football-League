package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.NewsDto;
import com.example.pentagol.model.News;
import com.example.pentagol.service.ImageService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@Mapper(componentModel = "spring")
public abstract class NewsMapper implements CommonMapper<News, NewsDto>{
    @Autowired
    protected ImageService imageService;

    @Override
    @Mapping(target = "imageUrl", expression = "java(imageService.saveFile(newsDto.getImage()))")
    public abstract News toEntity(NewsDto newsDto);

    @Override
    @Mapping(target = "image",expression = "java(imageService.getImage(news.getImageUrl()))")
    public abstract NewsDto toDto(News news) throws IOException;
}
