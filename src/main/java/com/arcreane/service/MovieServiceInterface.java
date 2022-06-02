package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.MovieRepositoryInterface;

public interface MovieServiceInterface {

    void setMovieRepositoryInterface(MovieRepositoryInterface p_Interface);
    void registerMovie(Movie p_Movie);
}
