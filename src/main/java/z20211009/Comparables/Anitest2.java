package z20211009.Comparables;

public class Anitest2 implements Comparable {
    int dupa;

    public Anitest2(int dupa) {
        this.dupa = dupa;
    }

    @Override
    public int compareTo(Object obiekt) {
        Anitest2 that = (Anitest2) obiekt; //(int) 2,3  to samo
        return Integer.compare(this.dupa, that.dupa);
    }
}
