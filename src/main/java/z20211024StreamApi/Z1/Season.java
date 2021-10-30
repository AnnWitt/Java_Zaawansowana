package z20211024StreamApi.Z1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
 class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;

    @Override
     public String toString() {
         return "Season{" +
                 "seasonName='" + seasonName + '\'' +
                 ", seasonNumber=" + seasonNumber +
                 ", episodes=" + episodes +
                 '}'+'\n';
     }
 }
