package z20211009.Comparables;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ComparableClass c1 = new ComparableClass(10);
        ComparableClass c2 = new ComparableClass(50);
        ComparableClass c3 = new ComparableClass(30);

        ComparableClass[] comparableClasses = {c1, c2, c3};

        System.out.println("comparable");
        Arrays.sort(comparableClasses);
        for (ComparableClass c : comparableClasses
        ) {
            System.out.println(c.value);

        }

        System.out.println("notcomparable");
        NotComparable nc1 = new NotComparable(60);
        NotComparable nc2 = new NotComparable(20);
        NotComparable nc3 = new NotComparable(30);

        NotComparable[] notComparable = {nc1, nc2, nc3};
        for (NotComparable nc : notComparable
        ) {
            System.out.println(nc.field);

        }

        //Arrays.sort(notComparable) ///bedzie exception;


        System.out.println("Ani test");
        Anitest a1 = new Anitest(12);
        Anitest a2 = new Anitest(102);
        Anitest a3 = new Anitest(18);
        Anitest a4 = new Anitest(342);

        Anitest[] anitests = {a1, a2, a3, a4};

        Arrays.sort(anitests);

        for (Anitest a : anitests) {
            System.out.println(a.wartosc);

        }


        Anitest2 a12 = new Anitest2(12);
        Anitest2 a22 = new Anitest2(4);
        Anitest2 a32 = new Anitest2(9);


        System.out.println("Anitest 2");
        Anitest2[] anitests2 = {a12, a22, a32};

        Arrays.sort(anitests2);

        for (Anitest2 a : anitests2) {
            System.out.println(a.dupa);

        }


        //dla niekomporacje nie da sie zrzutowac na obiektu bo nie ma zaimplementowanego
        //interfejsy


        //
    }
}
