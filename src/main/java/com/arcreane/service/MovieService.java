package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.MovieRepositoryInterface;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class MovieService implements MovieServiceInterface {
    private
    @Getter
    @Setter
    MovieRepositoryInterface repository;

    @Override
    public void setMovieRepositoryInterface(MovieRepositoryInterface p_Interface) {
        repository = p_Interface;
    }

    public void registerMovie(Movie p_Movie){
        repository.add(p_Movie);
    }
}
