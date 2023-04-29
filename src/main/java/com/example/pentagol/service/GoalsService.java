package com.example.pentagol.service;

import com.example.pentagol.repository.GoalsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoalsService {
    private final GoalsRepository goalsRepository;
}
