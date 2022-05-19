package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.MovieRepository;

public class MovieService {
    private MovieRepository m_MovieRepository = new MovieRepository();
    public void registerMovie(Movie p_Movie){
        m_MovieRepository.add(p_Movie);
    }
}
