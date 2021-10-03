package z20211003.Polimorfizm.SymulatorFarby.wspolne.model;

import z20211003.Polimorfizm.SymulatorFarby.wspolne.service.Figure;

public class Rectangle extends Figure {

    protected double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSurface(){
        return 0;
    }
}
