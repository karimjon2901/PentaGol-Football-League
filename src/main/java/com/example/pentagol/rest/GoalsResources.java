package com.example.pentagol.rest;

import com.example.pentagol.service.GoalsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GoalsResources {
    private final GoalsService goalsService;
}
