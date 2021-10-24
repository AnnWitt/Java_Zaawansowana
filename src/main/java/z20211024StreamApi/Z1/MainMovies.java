package z20211024StreamApi.Z1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainMovies {

    public static void main(String[] args) {
        // Lista wszystkich epizodów
//z seazon przez Episode do Video
        Video v1 = new Video("Tytul", "url", VideoType.EPISODE);
        Video v2 = new Video("Tytul", "url", VideoType.CLIP);
        Video v3 = new Video("Tytul", "url", VideoType.PREVIEW);
        List<Video> videoList1 = Arrays.asList(v1, v2, v3);
        List<Video> videoList2 = Arrays.asList(v1, v3);
        Stream<Video> videoStream1 = videoList1.stream();
        Stream<Video> videoStream2 = videoList2.stream();


        Episode epi1 = new Episode("NazwaEpizosu", 1, videoList1);
        Episode epi2 = new Episode("NazwaEpizosu2", 2, videoList2);
        Episode epi3 = new Episode("NazwaEpizosu3", 3, videoList1);
        Episode epi4 = new Episode("NazwaEpizosu4", 4, videoList2);

        List<Episode> episodeList1 = Arrays.asList(epi1, epi2, epi3);
        List<Episode> episodeList2 = Arrays.asList(epi1, epi4);
        Stream<Episode> episodeStream1 = episodeList1.stream();
        Stream<Episode> episodeStream2 = episodeList2.stream();

        Season s1 = new Season("season1name", 1, episodeList1);
        Season s2 = new Season("season2name", 2, episodeList2);
        List<Season> seasonList = Arrays.asList(s1, s2);
        Stream<Season> seasonStream = seasonList.stream();

        Stream.of(s1, s2)
                .flatMap(season -> season.episodes.stream())
                .forEach(System.out::println);
        //.flatMap(season -> season.episodes.stream())

        //Comparator<String> comparator1 = (String x, String y) -> x.compareTo(y);
        //List<Episode> pkt1=


    }
}
