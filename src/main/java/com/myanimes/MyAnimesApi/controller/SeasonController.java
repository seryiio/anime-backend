package com.myanimes.MyAnimesApi.controller;

import com.myanimes.MyAnimesApi.entity.Season;
import com.myanimes.MyAnimesApi.repository.SeasonRepository;
import com.myanimes.MyAnimesApi.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins = "*")
public class SeasonController {
    @Autowired
    private SeasonService seasonService;

    @GetMapping("/seasons")
    public List<Season> getAllSeasons() {
        return seasonService.getAllSeasons();
    }
    @GetMapping("/seasons/active")
    public List<Season> getActiveAnimes() {
        return seasonService.getActiveSeasons();
    }
}
