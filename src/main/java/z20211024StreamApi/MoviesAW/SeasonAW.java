package z20211024StreamApi.MoviesAW;

import java.util.List;

public class SeasonAW {
    public String seasonName;
    public int seasonNumber;
    List<EpisodeAW> episodesAW;


    public SeasonAW(String seasonName, int seasonNumber, List<EpisodeAW> episodesAW) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodesAW = episodesAW;
    }

    @Override
    public String toString() {
        return "SeasonAW{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonNumber=" + seasonNumber +
                ", episodesAW=" + episodesAW +
                '}';
    }
}
