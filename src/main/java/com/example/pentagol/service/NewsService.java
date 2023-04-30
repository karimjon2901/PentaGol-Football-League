package com.example.pentagol.service;

import com.example.pentagol.dto.NewsDto;
import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.model.News;
import com.example.pentagol.repository.NewsRepository;
import com.example.pentagol.service.mapper.NewsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.example.pentagol.service.AppStatus.AppStatusCodes.*;
import static com.example.pentagol.service.AppStatus.AppStatusMessages.*;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;
    private final ImageService imageService;

    public ResponseDto<List<NewsDto>> getAll() {
        List<News> news = newsRepository.findAll();

        return ResponseDto.<List<NewsDto>>builder()
                .message(OK)
                .success(true)
                .code(OK_CODE)
                .data(news.stream().map(newsMapper::toDto).toList())
                .build();
    }

    public ResponseDto<NewsDto> getById(Integer id) {
        Optional<News> newsOptional = newsRepository.findById(id);

        if (newsOptional.isEmpty()) {
            return ResponseDto.<NewsDto>builder()
                    .code(NOT_FOUND_ERROR_CODE)
                    .message(NOT_FOUND)
                    .build();
        }
        NewsDto newsDto = newsMapper.toDto(newsOptional.get());
        return ResponseDto.<NewsDto>builder()
                .success(true)
                .code(OK_CODE)
                .message(OK)
                .data(newsDto)
                .build();
    }

    public ResponseDto<NewsDto> delete(Integer id) {
        Optional<News> newsOptional = newsRepository.findById(id);
        if (newsOptional.isEmpty()) {
            return ResponseDto.<NewsDto>builder()
                    .code(NOT_FOUND_ERROR_CODE)
                    .message(NOT_FOUND)
                    .build();
        }
        NewsDto newsDto = newsMapper.toDto(newsOptional.get());
        newsRepository.delete(newsOptional.get());
        return ResponseDto.<NewsDto>builder()
                .message(OK)
                .success(true)
                .code(OK_CODE)
                .data(newsDto)
                .build();
    }

    public ResponseDto<NewsDto> addNews(NewsDto newsDto) {

        News entity = newsMapper.toEntity(newsDto);

        newsRepository.save(entity);

        return ResponseDto.<NewsDto>builder()
                .message(OK)
                .success(true)
                .data(newsDto)
                .code(OK_CODE)
                .build();
    }

}
