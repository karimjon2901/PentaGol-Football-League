package com.example.pentagol.rest;

import com.example.pentagol.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsResources {
    private final NewsService newsService;

}
