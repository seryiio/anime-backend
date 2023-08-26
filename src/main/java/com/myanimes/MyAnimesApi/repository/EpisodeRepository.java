package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EpisodeRepository extends JpaRepository<Episode, Integer> {
}
