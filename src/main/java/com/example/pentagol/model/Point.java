package com.example.pentagol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Point {
    @Id
    @GeneratedValue(generator = "pointIdSeq")
    @SequenceGenerator(name = "pointIdSeq", sequenceName = "point_id_seq", allocationSize = 1)
    private Integer id;
    @OneToOne
    private Team team;
    private int score;
}
