package z20211106.inputOutput.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

 class PathShowcase {
    public static void main(String[] args) throws IOException {
        //Path jest interfejsem,
        Path path = Paths.get("C:\\Users\\Anna_\\IdeaProjects" +
                "\\JavaZaawansowana\\src\\main\\resources\\data.txt");
        Path p1 = Paths.get("C:\\Users\\Anna_\\IdeaProjects" +
                "\\JavaZaawansowana\\src\\main\\resources\\data.txt");
        //Path p2=Path.of(nazwadysku, nazwafolderu,nazwapliku) //zwraca obiekt łączacy stringi
           //p1. dużo metod do wyboru

        Files.createFile(path);
        Files.write(path, "A long time ago in a galaxy far, far away...."
                .getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "far away....\n".getBytes(), StandardOpenOption.APPEND);
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
        Files.delete(path);


    }
}
