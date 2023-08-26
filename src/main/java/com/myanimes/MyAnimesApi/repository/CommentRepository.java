package com.myanimes.MyAnimesApi.repository;

import com.myanimes.MyAnimesApi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
