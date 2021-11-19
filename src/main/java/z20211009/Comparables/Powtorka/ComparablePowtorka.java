package z20211009.Comparables.Powtorka;

public class ComparablePowtorka implements Comparable {
    int wartoscBazowa=5;

    @Override
    public int compareTo(Object o) {
        return Integer.compare(wartoscBazowa,(int)o);
    }

    public int getWartoscBazowa() {
        return wartoscBazowa;
    }
}


