package com.myanimes.MyAnimesApi.service.impl;

import com.myanimes.MyAnimesApi.entity.Genre;
import com.myanimes.MyAnimesApi.entity.Genre_Anime;
import com.myanimes.MyAnimesApi.repository.Genre_AnimeRepository;
import com.myanimes.MyAnimesApi.service.Genre_AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreAnimeServiceImpl implements Genre_AnimeService {

    @Autowired
    private Genre_AnimeRepository genreAnimeRepository;
    @Override
    public List<Genre_Anime> getAnimesByGenre(Optional<Genre> genre) {
        return genreAnimeRepository.findByGenre(genre);
    }
}
