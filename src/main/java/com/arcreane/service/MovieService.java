package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.MovieRepositoryInterface;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieService implements MovieServiceInterface {
    private MovieRepositoryInterface m_MovieRepository;

    @Override
    public void setMovieRepositoryInterface(MovieRepositoryInterface p_Interface) {
        m_MovieRepository = p_Interface;
    }

    public void registerMovie(Movie p_Movie){
        m_MovieRepository.add(p_Movie);
    }
}
