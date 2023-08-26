package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface SeasonRepository extends JpaRepository<Season, Integer> {
    @Query("SELECT a FROM Season a WHERE a.status = true")
    List<Season> findActiveSeason();

    List<Season> findByAnimeId(Integer id);
}
