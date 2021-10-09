package z20211009.Zadanie3Pokarm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PokarmMain {
        //pamietaj o toString aby sam poformatowal
    public static void main(String[] args) {

        Pokarm p1 = new Pokarm("Nabial",TypPokarmu.NABIAL,300);
        /*Pokarm p2 = new Pokarm(TypPokarmu.OWOCE);
        Pokarm p3 = new Pokarm(TypPokarmu.MIESO);*/

        Jedzacy j1 = new Programista();
        Jedzacy j2 = new Krokodyl();
        Jedzacy j3 = new Weganin();
        j1.jedz(p1);
        j2.jedz(p1);
        j3.jedz(p1);

        Jedzacy[] jedzacy={j1,j2,j3};

        Arrays.sort(jedzacy);

        System.out.println(j1.ileGramowZjedzone()+ " " + j1.ilePosilkowZjedzone());

        //dorob 8 i 9
    }

}
