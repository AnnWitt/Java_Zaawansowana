package z20211024StreamApi.MoviesAW;


public class VideoAW {

    public String title;
    public String url;
    VideoTypeAW videoTypeAW;

    public VideoAW(String title, String url, VideoTypeAW videoTypeAW) {
        this.title = title;
        this.url = url;
        this.videoTypeAW = videoTypeAW;
    }


    @Override
    public String toString() {
        return "VideoAW{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", videoTypeAW=" + videoTypeAW +
                '}';
    }
}
