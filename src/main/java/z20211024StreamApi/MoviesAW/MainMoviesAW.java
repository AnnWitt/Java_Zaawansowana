package z20211024StreamApi.MoviesAW;


import java.util.Arrays;
import java.util.List;

public class MainMoviesAW {

    public static void main(String[] args) {

        VideoAW v1=new VideoAW("tytuł1","url1",VideoTypeAW.CLIP);
        VideoAW v2=new VideoAW("tytuł2","url2",VideoTypeAW.EPISODE);
        VideoAW v3=new VideoAW("tytuł3","url3",VideoTypeAW.CLIP);
        VideoAW v4=new VideoAW("tytuł4","url4",VideoTypeAW.PREVIEW);
        VideoAW v5=new VideoAW("tytuł5","url5",VideoTypeAW.EPISODE);
        VideoAW v6=new VideoAW("tytuł6","url6",VideoTypeAW.PREVIEW);

        List<VideoAW> videoAWList= Arrays.asList(v1,v2,v3,v4,v5,v6);

        EpisodeAW ep1=new EpisodeAW("episode 1 name",1,videoAWList);
        EpisodeAW ep2=new EpisodeAW("episode 2 name",2,videoAWList);
        EpisodeAW ep3=new EpisodeAW("episode 3 name",3,videoAWList);
        EpisodeAW ep4=new EpisodeAW("episode 4 name",4,videoAWList);
        EpisodeAW ep5=new EpisodeAW("episode 5 name",5,videoAWList);
        EpisodeAW ep6=new EpisodeAW("episode 6 name",6,videoAWList);
        EpisodeAW ep7=new EpisodeAW("episode 7 name",7,videoAWList);

        List<EpisodeAW> episodeAWList=Arrays.asList(ep1,ep2,ep3,ep4,ep5,ep6,ep7);

        SeasonAW s1=new SeasonAW("season 1 name",1,episodeAWList);
        SeasonAW s2=new SeasonAW("season 2 name",2,episodeAWList);
        SeasonAW s3=new SeasonAW("season 3 name",3,episodeAWList);
        SeasonAW s4=new SeasonAW("season 4 name",4,episodeAWList);

        List<SeasonAW> seasonAWList=Arrays.asList(s1,s2,s3,s4);

        /////////////////////////////////////////////////////////////////////////////////
/*        System.out.println("Lista wszystkich epizodów");
        seasonAWList.stream()
                .flatMap(s->s.episodesAW.stream())
                .flatMap(x->x.videosAW.stream())
                .map(c->c.url)
                .forEach(System.out::println);*/

        seasonAWList.stream()
                .filter(d->d.seasonNumber==1)
                .flatMap(s->s.episodesAW.stream())
                .map(x->x.episodeName)
                .forEach(System.out::println);








    }

}
