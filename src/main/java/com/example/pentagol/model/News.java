package com.example.pentagol.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class News {
    @Id
    @GeneratedValue(generator = "newsIdSeq")
    @SequenceGenerator(name = "newsIdSeq", sequenceName = "news_id_seq", allocationSize = 1)
    private Integer id;
    private String description;
    private String imageUrl;
    private Date date;
}
