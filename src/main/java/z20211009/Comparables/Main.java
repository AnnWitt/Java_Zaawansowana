package z20211009.Comparables;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ComparableClass c1 = new ComparableClass(10);
        ComparableClass c2 = new ComparableClass(20);
        ComparableClass c3 = new ComparableClass(30);

        ComparableClass[] comparableClasses = {c1, c2, c3};

        NotComparable nc1 = new NotComparable(10);
        NotComparable nc2 = new NotComparable(20);
        NotComparable nc3 = new NotComparable(30);

        NotComparable[] notComparable={nc1,nc2,nc3};
        //Arrays.sort(notComparable) ///bedzie exception;


        Arrays.sort(comparableClasses);

        //dla niekomporacje nie da sie zrzutowac na obiektu bo nie ma zaimplementowanego
        //interfejsy



        //
    }
}
