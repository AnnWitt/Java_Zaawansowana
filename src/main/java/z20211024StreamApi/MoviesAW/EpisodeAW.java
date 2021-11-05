package z20211024StreamApi.MoviesAW;


import java.util.List;

public class EpisodeAW {

        public String episodeName;
        public int episodeNumber;
        List<VideoAW> videosAW;

        public EpisodeAW(String episodeName, int episodeNumber, List<VideoAW> videosAW) {
                this.episodeName = episodeName;
                this.episodeNumber = episodeNumber;
                this.videosAW = videosAW;
        }


        @Override
        public String toString() {
                return "EpisodeAW{" +
                        "episodeName='" + episodeName + '\'' +
                        ", episodeNumber=" + episodeNumber +
                        ", videosAW=" + videosAW +
                        '}' + '\n';
        }
}
