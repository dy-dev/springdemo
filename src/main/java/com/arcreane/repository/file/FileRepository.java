package com.arcreane.repository.file;

import com.arcreane.entity.Movie;
import com.arcreane.repository.MovieRepositoryInterface;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@NoArgsConstructor
@Repository
public class FileRepository implements MovieRepositoryInterface {
    private
    @Getter
    @Setter
    @Value("${file_path}")
    File file;

    public void add(Movie p_Movie) {
        FileWriter fileWriter;
        try {
//            fileWriter = new FileWriter("./tmp.txt", true);
            System.out.println(file.getPath());
            fileWriter = new FileWriter(file, true);
            fileWriter.write(p_Movie.toString() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
