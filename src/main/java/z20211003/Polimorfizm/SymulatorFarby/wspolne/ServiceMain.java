package z20211003.Polimorfizm.SymulatorFarby.wspolne;

import z20211003.Polimorfizm.SymulatorFarby.wspolne.model.Cicrle;
import z20211003.Polimorfizm.SymulatorFarby.wspolne.model.Rectangle;
import z20211003.Polimorfizm.SymulatorFarby.wspolne.model.Square;
import z20211003.Polimorfizm.SymulatorFarby.wspolne.model.Trapeze;
import z20211003.Polimorfizm.SymulatorFarby.wspolne.service.Figure;
import z20211003.Polimorfizm.SymulatorFarby.wspolne.service.PaintSim;

public class ServiceMain {
    public static void main(String[] args) {
        Figure fig1=new Cicrle(4);
        Figure fig2=new Square(4);
        Figure fig3=new Rectangle(2, 4);
        Figure fig4=new Trapeze(2, 5, 2);

        Figure[] figures=new Figure[]{fig3, fig2,fig4, fig1};

        System.out.println(PaintSim.calculatePaintDemand(figures, 10));


    }
}
