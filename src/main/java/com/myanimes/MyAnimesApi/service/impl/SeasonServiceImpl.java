package com.myanimes.MyAnimesApi.service.impl;

import com.myanimes.MyAnimesApi.entity.Season;
import com.myanimes.MyAnimesApi.repository.SeasonRepository;
import com.myanimes.MyAnimesApi.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonServiceImpl implements SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;

    @Override
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }

    @Override
    public List<Season> getActiveSeasons() {
        return seasonRepository.findActiveSeason();
    }

    @Override
    public List<Season> getSeasonsforAnimes(Integer id) {
        return seasonRepository.findByAnimeId(id);
    }


}
