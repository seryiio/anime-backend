package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer value;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;
}
