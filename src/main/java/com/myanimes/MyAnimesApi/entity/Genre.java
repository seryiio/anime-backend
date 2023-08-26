package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "genres")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "genre_name")
    private String genreName;
}
