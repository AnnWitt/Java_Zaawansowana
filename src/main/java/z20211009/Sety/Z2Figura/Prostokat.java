package z20211009.Sety.Z2Figura;

public class Prostokat extends Figura{
    double a,b;

    @Override
    double obliczPole() {
        return 0;
    }

    public Prostokat(double pole) {
        super(pole);
    }

    public int compareTo(Figura o) {
        return super.compareTo(o);
    }
}
