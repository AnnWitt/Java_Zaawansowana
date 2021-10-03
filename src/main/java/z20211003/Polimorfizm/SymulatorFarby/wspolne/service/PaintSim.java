package z20211003.Polimorfizm.SymulatorFarby.wspolne.service;

public class PaintSim { //zewnetrzna klasa po niczym nie dziedziczy

    public static double calculatePaintDemand(Figure[] figuresTbl, double canCapacity) {
//wpisac figures kropka i zjechac na dol w podpowiedziach

        double currentSum=0;
        for (Figure figure : figuresTbl) {
            //na kazdej figurze wywolamy figure getSufrace
            currentSum+=figure.getSurface();
        }
        //currentsum tu wyjdzie z waroscia zmodyf. bo zdeklarowana przed petla, w
        //petli bysmy tracili
        return Math.ceil(currentSum/canCapacity);
    }
    //floor zaokres w dol, ceil zaokrs w gore
}
