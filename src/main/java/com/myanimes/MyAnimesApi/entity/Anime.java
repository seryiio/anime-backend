package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "animes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String type;
    private String description;
    private LocalDate year;
    private String image;

    @Column(name = "cover_image")
    private String coverImage;

    private String url;

    @Column(name = "url_trailer")
    private String urlTrailer;

    private boolean status;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Season> seasons;
}
