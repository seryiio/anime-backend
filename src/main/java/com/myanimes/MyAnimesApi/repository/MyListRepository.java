package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.MyList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MyListRepository extends JpaRepository<MyList, Integer> {
}
