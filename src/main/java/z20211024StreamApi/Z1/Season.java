package z20211024StreamApi.Z1;

import lombok.Data;

import java.util.List;

 class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;

     Season(String seasonName, int seasonNumber, List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
}
