package z20211009.Comparables;

public class Anitest implements Comparable {

    int wartosc;

    public Anitest(int wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public int compareTo(Object o) { //tu tworze obiekt
        Anitest doPorownania=(Anitest) o;
        //return Integer.compare(this.wartosc,doPorownania.wartosc); //rosnaco
        return Integer.compare(doPorownania.wartosc, this.wartosc); //malejaco
    }

/*    @Override
    public int compareTo(Object o) {
        ComparableClass other=(ComparableClass) o;
        return Integer.compare(this.value,other.value);
    }*/



}
