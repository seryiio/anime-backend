package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RatingRepository extends JpaRepository<Rating, Integer> {
}
