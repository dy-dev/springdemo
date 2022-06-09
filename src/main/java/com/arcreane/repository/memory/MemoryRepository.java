package com.arcreane.repository.memory;

import com.arcreane.entity.Movie;
import com.arcreane.repository.MovieRepositoryInterface;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Repository
public class MemoryRepository implements MovieRepositoryInterface {
    static List<Movie> s_Movies = new ArrayList<>();

    public void add(Movie p_Movie){
        s_Movies.add(p_Movie);
        System.out.println("The movie " + p_Movie.getM_sTitle() + " has been added.");
    }

}
