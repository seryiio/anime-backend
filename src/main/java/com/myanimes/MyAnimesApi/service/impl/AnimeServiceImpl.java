package com.myanimes.MyAnimesApi.service.impl;

import com.myanimes.MyAnimesApi.entity.Anime;
import com.myanimes.MyAnimesApi.entity.Genre;
import com.myanimes.MyAnimesApi.entity.Genre_Anime;
import com.myanimes.MyAnimesApi.entity.Season;
import com.myanimes.MyAnimesApi.repository.AnimeRepository;
import com.myanimes.MyAnimesApi.service.AnimeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimeServiceImpl implements AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    @Override
    public List<Anime> listAnimes() {
        return animeRepository.findAll();
    }

    @Override
    public Optional<Anime> findAnime(Integer id) {
        return animeRepository.findById(id);
    }

    @Override
    public List<Anime> getActiveAnimes() {
        return animeRepository.findActiveAnime();
    }

    @Override
    public List<Season> getSeasonsByAnimeId(Integer id) {
        Optional<Anime> animeOptional = animeRepository.findById(id);

        if (animeOptional.isPresent()) {
            Anime anime = animeOptional.get();
            return anime.getSeasons();
        } else {
            throw new EntityNotFoundException("Anime with ID " + id + " not found");
        }
    }

}
