package com.example.pentagol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameInputDto {
    private Integer id;
    private String ligaName;
    private String teamA;
    private String teamB;
    private Date date;
    private int resultA;
    private int resultB;
    private boolean finished;
}
