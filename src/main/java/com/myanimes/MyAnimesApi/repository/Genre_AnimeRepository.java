package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.Anime;
import com.myanimes.MyAnimesApi.entity.Genre;
import com.myanimes.MyAnimesApi.entity.Genre_Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface Genre_AnimeRepository extends JpaRepository<Genre_Anime, Integer> {
    List<Genre_Anime> findByGenre(Optional<Genre> genre);

    List<Genre_Anime> findByAnime(Optional<Anime> anime);
}
