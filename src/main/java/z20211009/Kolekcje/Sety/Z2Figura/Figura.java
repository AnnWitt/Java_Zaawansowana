package z20211009.Kolekcje.Sety.Z2Figura;

public abstract class Figura implements Comparable<Figura> {
    double pole;

    abstract double obliczPole();

    public Figura(double pole) {
        this.pole = pole;
    }

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.obliczPole(), o.obliczPole());
    }

    @Override
    public String toString() {
        return "Figura{" +
                "pole=" + pole +
                '}' + "\n"
                ;
    }
}
