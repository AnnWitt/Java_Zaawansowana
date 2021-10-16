package z20211009.Kolekcje.Mapy.Zadanie5powtorzeniaZnakow;

import java.util.*;

public class MapyMetody {

    //zliczWystapieniaSlow(String tekst):Map<String, Integer>

    static Map<String, Integer> zliczWystapieniaSlow(String tekst) {

        tekst = tekst.replaceAll("\\W", ".");
        System.out.println(tekst);
        //List<String> slowo = List.of(tekst.split("\\."));
        String[] slowo = tekst.toLowerCase().split("\\W+");
        Map<String, Integer> slowoMapa = new LinkedHashMap<>();
        for (int i = 0; i < slowo.length; i++) {
            if (slowoMapa.containsKey(slowo[i])) {
                slowoMapa.put(slowo[i], slowoMapa.get(slowo[i]+1));
            } else {
                slowoMapa.put(slowo[i],1);
            }
            //System.out.println(slowoMapa);
        }
        //slowo.put(lista);
        slowoMapa.keySet();

        return slowoMapa;

    }

    ;
    // tekst.split(".");
    //String[] tekst2=tekst.split(".");

    // System.out.println("tbl");

    // System.out.println(tekst2.length);


}
