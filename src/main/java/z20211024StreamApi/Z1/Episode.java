package z20211024StreamApi.Z1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;

     Episode(String episodeName, int episodeNumber, List<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "episodeName='" + episodeName + '\'' +
                ", episodeNumber=" + episodeNumber +
               // ", videos=" + videos +
                '}' ;
    }
}
