package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "genre_animes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(Genre_Anime.class)
public class Genre_Anime {
    @Id
    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;

    @Id
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
}
