package com.example.pentagol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamDto {
//    private Integer id;
    private String name;
    private String logoUrl;
    private String ligaName;
    private boolean status;
    private int goals;
    private int point;
    private int referencesBetween;
}
