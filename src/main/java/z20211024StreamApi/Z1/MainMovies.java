package z20211024StreamApi.Z1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainMovies {

    public static void main(String[] args) {
        // Lista wszystkich epizodów
//z seazon przez Episode do Video
        Video v1 = new Video("Tytul1", "url1", VideoType.CLIP);
        Video v2 = new Video("Tytul2", "url2", VideoType.EPISODE);
        Video v3 = new Video("Tytul3", "url3", VideoType.PREVIEW);
        List<Video> videoList = Arrays.asList(v1,v3);
        Stream<Video> videoStream = videoList.stream();

        Episode epi1 = new Episode("NazwaEpizosu1", 1, videoList);
        Episode epi2 = new Episode("NazwaEpizosu2", 2, videoList);
        Episode epi3 = new Episode("NazwaEpizosu2", 3, videoList);
        Episode epi4 = new Episode("NazwaEpizosu2", 4, videoList);


        List<Episode> episodeList = Arrays.asList(epi3, epi4, epi1);
        List<Episode> episodeList2 = Arrays.asList(epi1, epi2);
        Stream<Episode> episodeStream = episodeList.stream();
        //Stream<Episode> episodeStream2 = episodeList2.stream();


        Season s1 = new Season("season1name", 1, episodeList);
        Season s2 = new Season("season2name", 2, episodeList2);
        //Season s4 = new Season("season2name", 4, episodeList2);
        List<Season> seasonList = Arrays.asList(s1, s2);
        Stream<Season> seasonStream = seasonList.stream();

        System.out.println("1 - lista wszystkich epizodow");
        seasonStream //jeżeli drugi raz tak zrobie to ponownie
                // Stream<Season> seasonStream = seasonList.stream();
                //albo jak pnkt3
                .flatMap(seasonZM -> seasonZM.episodes.stream())
                .forEach(System.out::println);

/*
        System.out.println("1");
        Stream.of(s1, s2)
                .flatMap(dupa -> dupa.episodes.stream())
                .forEach(System.out::println);*/

        System.out.println("2 lista wszystkich filmow");
        episodeStream
                .flatMap(episodeZM -> episodeZM.videos.stream())
                .forEach(System.out::println);

        System.out.println("3 lista nazw wszystkich sezonow");
        seasonList.stream()
                .map(seasonZM -> seasonZM.getSeasonName())
                .forEach(System.out::println);
/*        Metoda map oczekuje na wejście obiektu Function<T, R>. Jej zadaniem jest
        przekonwertowanie elementu strumienia na nowym element, który dodatkowo może
        mieć inny typ.*/
        System.out.println("4 Lista numerów sezonów");
        seasonList.stream()
                .map(seasonZM -> seasonZM.getSeasonNumber())
                .forEach(System.out::println);

        //flatmap jak poziom  niżej a potem mapa ?
        System.out.println("5 - lista wszystkich nazw epizodrów");

        episodeList.stream()
                .map(mapper -> mapper.getEpisodeName())
                .forEach(System.out::println);

        System.out.println("metoda2 to samo");
        List.of(s1).stream()
                .flatMap(sezon -> sezon.episodes.stream())
                .map(epizod -> epizod.episodeName)
                .forEach(System.out::println);

        System.out.println("6 numery epizodow");

        List.of(s1, s2).stream()
                .flatMap(sezon -> sezon.episodes.stream())
                .map(epizod -> epizod.episodeNumber)
                .forEach(System.out::println);

        System.out.println("7  lista wszyssktihc nazw video");
        videoList.stream()
                .map(video -> video.title)
                .forEach(System.out::println);

        //jeżeli chcemy inny format to mozemy zamiast toString
        //sobie zapisac metode wyswietlajaca i wywolywac (sprawdz)

        System.out.println("8 adresy url dla każdego video");
        videoList.stream()
                .map(video -> video.title + " url epizodu " + video.url)
                .forEach(System.out::println);

        System.out.println("8 adresy url dla każdego video - wersja z metoda od formatowania");
        videoList.stream()
                .forEach(video -> Formatowanie.formatDlaVideo(video.title, video.url));

        System.out.println("9 -  tylko epizody z parzystych sezonów");
        seasonList.stream()
                .filter(season -> (season.seasonNumber % 2 == 0))
                .flatMap(epizod -> epizod.episodes.stream())
                .forEach(System.out::println);

        System.out.println("10 - tylko video z parzystych sezonów");
        seasonList.stream()
                .filter(season -> (season.seasonNumber % 2 == 0))
                .flatMap(epizod -> epizod.episodes.stream())
                .map(video -> video.videos)
                .forEach(System.out::println);

        System.out.println("11 - video z parzystyvh epizodow i sezonow");
        seasonList.stream()
                .filter(season -> (season.seasonNumber % 2 == 0))
                .flatMap(epizod -> epizod.episodes.stream())
                .filter(epizod -> (epizod.episodeNumber % 2 == 0))
                .map(video -> video.videos)
                .forEach(System.out::println);
        System.out.println("12 - tylko video typu clip z parzystych epizodów" +
                " i nieparzystych sezonow");
        seasonList.stream()
                .filter(season -> (season.seasonNumber % 2 != 0)) //nieparzysty
                .flatMap(epizod -> epizod.episodes.stream())
                .filter(epizod -> (epizod.episodeNumber % 2 == 0)) //parzysty
                .flatMap(video -> video.videos.stream())
                .filter(video -> video.videoType==VideoType.CLIP)
                .forEach(System.out::println);


        System.out.println("13 - tylko video typu preview z niepartzystych epizodów" +
                " i parzystrych sezonow");
        seasonList.stream()
                .filter(season -> (season.seasonNumber % 2 == 0)) //
                .flatMap(epizod -> epizod.episodes.stream())
                .filter(epizod -> (epizod.episodeNumber % 2 != 0)) //
                .flatMap(video -> video.videos.stream())
                .filter(video -> video.videoType==VideoType.PREVIEW)
                .forEach(System.out::println);


        //--------------
    }
}

class Formatowanie {

    static void formatDlaVideo(String title, String url) {
        System.out.println(title + " |url tytułu| " + url);
    }


}
