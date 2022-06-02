package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.GoLiveRepository;
import com.arcreane.repository.MovieRepository;
import com.arcreane.repository.MovieRepositoryInterface;

public class MovieService {
    private MovieRepositoryInterface m_MovieRepository = new GoLiveRepository();
    public void registerMovie(Movie p_Movie){
        m_MovieRepository.add(p_Movie);
    }
}
