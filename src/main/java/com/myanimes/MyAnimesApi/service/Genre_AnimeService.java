package com.myanimes.MyAnimesApi.service;

import com.myanimes.MyAnimesApi.entity.Anime;
import com.myanimes.MyAnimesApi.entity.Genre;
import com.myanimes.MyAnimesApi.entity.Genre_Anime;
import com.myanimes.MyAnimesApi.entity.Season;

import java.util.List;
import java.util.Optional;

public interface Genre_AnimeService {
    List<Genre_Anime> getAnimesByGenre(Optional<Genre> genre);
    List<Genre_Anime> getGenreByAnime(Optional<Anime> anime);
}
