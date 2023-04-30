package com.example.pentagol.service.mapper;

import com.example.pentagol.dto.NewsDto;
import com.example.pentagol.model.News;
import com.example.pentagol.service.ImageService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class NewsMapper implements CommonMapper<News, NewsDto>{
    @Autowired
    protected ImageService imageService;

    @Override
    @Mapping(target = "imageUrl", expression = "java(imageService.saveFile(newsDto.saveFile()))")
    public abstract News toEntity(NewsDto newsDto);

    @Override
    @Mapping(target = "image",expression = "java(imageService.getImage(news.getIMageUrl()))")
    public abstract NewsDto toDto(News news);
}
