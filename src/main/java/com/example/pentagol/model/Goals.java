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
public class Goals {
    @Id
    @GeneratedValue(generator = "goalsIdSeq")
    @SequenceGenerator(name = "goalsIdSeq", sequenceName = "goals_id_seq")
    private Integer id;
    @OneToOne
    private Team teamDto;
    private String ligaName;
    private int count;
}
