package com.myanimes.MyAnimesApi.controller;

import com.myanimes.MyAnimesApi.entity.Genre;
import com.myanimes.MyAnimesApi.entity.Genre_Anime;
import com.myanimes.MyAnimesApi.service.GenreService;
import com.myanimes.MyAnimesApi.service.Genre_AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myanime-frontend.web.app")
public class Genre_AnimeController {

    @Autowired
    private GenreService genreService;
    @Autowired
    private Genre_AnimeService genreAnimeService;

    @GetMapping("/genre/{genreId}")
    public List<Genre_Anime> getAnimesByGenre(@PathVariable Integer genreId) {
        // Obtener el género por su ID (genreId) desde tu servicio de género
        Optional<Genre> genre = genreService.findGenre(genreId);

        if (genre != null) {
            return genreAnimeService.getAnimesByGenre(genre);
        } else {
            // Manejar el caso si el género no existe
            return null;
        }
    }
}
