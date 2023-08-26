package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@Table(name = "episodes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private Integer number;
    private LocalTime duration;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;
}
