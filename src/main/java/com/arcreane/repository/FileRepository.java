package com.arcreane.repository;

import com.arcreane.entity.Movie;
import lombok.NoArgsConstructor;

import java.io.FileWriter;
import java.io.IOException;
@NoArgsConstructor
public class FileRepository implements MovieRepositoryInterface {
    public void add(Movie p_Movie){
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter("./tmp.txt", true);
            fileWriter.write(p_Movie.toString() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
