package com.example.pentagol.rest;

import com.example.pentagol.dto.NewsDto;
import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsResources {
    private final NewsService newsService;
    @GetMapping
    public ResponseDto<List<NewsDto>> getAll(){
        return newsService.getAll();
    }
    @PostMapping
    @CrossOrigin(origins = "http://10.10.3.34:5173")
    public ResponseDto<NewsDto> addNews(@RequestBody NewsDto newsDto){
        return newsService.addNews(newsDto);
    }
}
