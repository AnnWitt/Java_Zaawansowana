package z20211009.Wprowadzenie;

import java.util.Comparator;

public interface Spiewajacy  extends Comparable, Comparator, Cloneable {
    //z defaulta abstrakxyny, nie dopisujemy
    int someValue=10; //z defaulta static i final w odroznieniu od klas

    void spiewa(); //public abstrakt zbedny
    int wiek();
    double oblicz();

    default void NowaMetoda(int a, int b){
        //pozwala zdefiniowac jakas akcje dla wszystkich klas pod interf.
        //ale mozna zrobic np w jednej z klas overwite. Zmiany nie trzeba w np 100
        // klasach. Wystarczy tu
        //defaultowa implementacja, mozna overwrite ale nie trzeba. JEst jakby w tle
        //te ktore nie sa def. Moznaby bez ale lepiej nie bo jak sie cos zmieni to moze
        //byc problem
        //strzaleczki obok, przenosza gdzie zadeklarowana
        //jak na i to pokaze gdzie one sa zaimpl
        //default nie ma bo sa wszedzie
    }
    //czy mozna nieabstrakcyjne metody? Nie


}
