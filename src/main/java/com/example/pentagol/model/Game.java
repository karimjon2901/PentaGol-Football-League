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
    @GeneratedValue(generator = "gameIdSeq")
    @SequenceGenerator(name = "gameIdSeq", sequenceName = "game_id_seq", allocationSize = 1)
    private Integer id;
    private String ligaName;
    @ManyToOne
    private Team teamA;
    @ManyToOne
    private Team teamB;
    private Date date;
    private int resultA;
    private int resultB;
    private boolean finished;
}
