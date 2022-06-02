package com.arcreane.repository;

import com.arcreane.entity.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
@NoArgsConstructor
public class FileRepository implements MovieRepositoryInterface {
    private
    @Getter
    @Setter
    File file;

    public void add(Movie p_Movie){
        FileWriter fileWriter;
        try{
//            fileWriter = new FileWriter("./tmp.txt", true);
            fileWriter = new FileWriter(file, true);
            fileWriter.write(p_Movie.toString() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
