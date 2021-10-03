package z20211003.Polimorfizm.SymulatorFarby.wspolne.model;

public class Square extends Rectangle{


    public Square(double a) { //skracamy do double a bo double b niepotrzebne
        //dostalismy wiecej niz chcemy
        super(a, a); //aby pasowalo rodzicowi
    }

 //crtl o
    @Override
    public double getSurface() {
        return a*a; //zdefiniowane u rodzica
    }
}
