package z20211009.Sety.Z2Figura;

public class Kwadrat extends Figura {
    private double x;

    @Override
    double obliczPole() {
        return x*x;
    }

    public Kwadrat(double pole) {
        super(pole);
    }


    @Override
    public int compareTo(Figura o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
