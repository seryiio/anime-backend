package com.myanimes.MyAnimesApi.controller;

import com.myanimes.MyAnimesApi.entity.Anime;
import com.myanimes.MyAnimesApi.service.AnimeService;
import com.myanimes.MyAnimesApi.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "https://myanime-frontend.web.app")
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
    @GetMapping("/animes/active")
    public List<Anime> getActiveAnimes() {
        return animeService.getActiveAnimes();
    }

}
