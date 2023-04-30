package com.example.pentagol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(generator = "teamIdSeq")
    @SequenceGenerator(name = "teamIdSeq", sequenceName = "team_id_seq", allocationSize = 1)
    private Integer id;
    private String name;
    private String logoUrl;
    private String ligaName;
    private int goals;
    private int point;
    private int referencesBetween;
//    private boolean status;
}
