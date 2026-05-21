package isp.lab12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Ex7 {
    public long countNumber (String fileName, String word){
        try {
            return Files.lines(Paths.get(fileName))
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .filter(w -> w.equals(word))
                    .count();
        } catch (Exception e) {
            return 0;
        }

    }
}
