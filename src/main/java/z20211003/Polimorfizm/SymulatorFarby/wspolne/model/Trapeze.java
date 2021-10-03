package z20211003.Polimorfizm.SymulatorFarby.wspolne.model;

import z20211003.Polimorfizm.SymulatorFarby.wspolne.service.Figure;

public class Trapeze extends Figure {
private double a,b,h;

    @Override
    protected double getSurface() {
        return (a+b)*(h/2);
    }

    public Trapeze(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
}
