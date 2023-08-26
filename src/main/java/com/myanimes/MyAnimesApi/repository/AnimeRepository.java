package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.Anime;
import com.myanimes.MyAnimesApi.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AnimeRepository extends JpaRepository<Anime, Integer> {

    List<Anime> findByTitle(String title);

    @Query("SELECT a FROM Anime a WHERE a.status = true")
    List<Anime> findActiveAnime();

    @Query("SELECT a.id, s.number, s.status FROM Anime a JOIN a.seasons s")
    List<Object[]> getSeasonStatusForAllAnime();
}
