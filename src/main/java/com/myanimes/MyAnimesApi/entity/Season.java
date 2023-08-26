package com.myanimes.MyAnimesApi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "seasons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer number;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    private String description;

    private boolean status;

    @ManyToOne
    @JoinColumn(name = "anime_id", nullable = false )
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Anime anime;
}
