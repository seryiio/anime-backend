package com.myanimes.MyAnimesApi.controller;

import com.myanimes.MyAnimesApi.entity.Anime;
import com.myanimes.MyAnimesApi.entity.Genre;
import com.myanimes.MyAnimesApi.entity.Season;
import com.myanimes.MyAnimesApi.service.AnimeService;
import com.myanimes.MyAnimesApi.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @Autowired
    private SeasonService seasonService;

    @GetMapping("/animes")
    public List<Anime> getAllAnimes() {
        return animeService.listAnimes();
    }

    @GetMapping("/animes/{id}")
    public Optional<Anime> getAnimeById(@PathVariable("id") Integer id) {
        return animeService.findAnime(id);
    }

    @GetMapping("/animes/{id}/seasons")
    public ResponseEntity<List<Season>> getSeasonsByAnimeId(@PathVariable("id") Integer id) {
        List<Season> seasons = animeService.getSeasonsByAnimeId(id);
        return new ResponseEntity<>(seasons, HttpStatus.OK);
    }

    @GetMapping("/animes/active")
    public List<Anime> getActiveAnimes() {
        return animeService.getActiveAnimes();
    }

}
