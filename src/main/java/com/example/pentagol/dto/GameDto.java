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
public class GameDto {
    private Integer id;
    private String ligaName;
    private TeamDto teamA;
    private TeamDto teamB;
    private Date date;
    private int resultA;
    private int resultB;
    private boolean finished;
}
