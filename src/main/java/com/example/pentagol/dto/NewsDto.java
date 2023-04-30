package com.example.pentagol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.io.File;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsDto {
    private Integer id;
    private String description;
    private File image;
    private Date date;
}
