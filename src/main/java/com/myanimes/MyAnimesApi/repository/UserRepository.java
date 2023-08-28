package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
