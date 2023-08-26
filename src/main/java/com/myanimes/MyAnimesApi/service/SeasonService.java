package com.myanimes.MyAnimesApi.service;

import com.myanimes.MyAnimesApi.entity.Season;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeasonService {
    List<Season> getAllSeasons();
    List<Season> getActiveSeasons();

    List<Season> getSeasonsforAnimes(Integer id);
}
