package z20211003.Polimorfizm.SymulatorFarby.wspolne.model;

import z20211003.Polimorfizm.SymulatorFarby.wspolne.service.Figure;

public class Cicrle extends Figure {
    protected double r;



public static void Circle (double r) {
    if (r<0) {
        throw new IllegalArgumentException("ujemny promien");
    }

}

    //dodac overrider
    public Cicrle(double r) {
        this.r=r;
    }

    @Override
    public double getSurface(){
        return Math.PI*r*r;
    }
}
