package com.example.pentagol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoalsDto {
    private Integer id;
    private TeamDto teamDto;
    private String ligaName;
    private int count;
}
