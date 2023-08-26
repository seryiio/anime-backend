package com.myanimes.MyAnimesApi.service;

import com.myanimes.MyAnimesApi.entity.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService{
    public List<Genre> listGenres();
    public Optional<Genre> findGenre(Integer id);
}
