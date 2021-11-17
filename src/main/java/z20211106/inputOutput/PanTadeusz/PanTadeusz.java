package z20211106.inputOutput.PanTadeusz;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PanTadeusz {
    public static void main(String[] args) throws IOException {
        //ile razy występuje Tadeusz

        Path panTadeusz = Paths.get("C:\\Users\\Anna_\\IdeaProjects\\JavaZaawansowana\\src" +
                "\\main\\java\\z20211106\\inputOutput\\PanTadeusz\\PanTadeuszWklejka.txt");


        //System.out.println(Files.readAllLines(panTadeusz).toString().compareTo("Tadeusz"));
        System.out.println(Files.readAllLines(panTadeusz).stream()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .filter((sl -> sl.contains("Tadeusz"))) //warunek filtrowania
                .count());



                    /*    seasonAWList.stream()
                                .filter(d->d.seasonNumber==1)
                                .flatMap(s->s.episodesAW.stream())
                                .map(x->x.episodeName)
                                .forEach(System.out::println);*/


        //.collect(Collectors.toList())

    }


}
