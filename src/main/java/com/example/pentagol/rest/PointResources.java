package com.example.pentagol.rest;

import com.example.pentagol.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/point")
@RequiredArgsConstructor
public class PointResources {
    private final PointService pointService;
}
