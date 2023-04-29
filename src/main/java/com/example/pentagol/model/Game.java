package com.example.pentagol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Game {
    @Id
    private Integer id;
    private String ligaName;
    @OneToOne
    private Team teamA;
    @OneToOne
    private Team teamB;
    private Date date;
    private int resultA;
    private int resultB;
    private boolean finished;
}
