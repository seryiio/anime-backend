package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@Entity
@Table(name = "comments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private LocalDate date;
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "episodes_id")
    private Episode episode;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;
}
