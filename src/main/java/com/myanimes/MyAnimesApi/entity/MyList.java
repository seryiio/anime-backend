package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "my_lists")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;
}
