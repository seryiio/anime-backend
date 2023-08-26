package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Integer> {
}
