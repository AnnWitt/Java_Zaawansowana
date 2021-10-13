package Zadaniapo20211010.Zad4IntChlodzi;

public class Wiatrak implements Chlodzi {
    double temp;

    @Override
    public double pobierzTemp(double temp) {
        return this.temp = temp;
    }

    @Override
    public void schlodz(double schlodz) {
        temp = pobierzTemp(temp) - schlodz;
        System.out.print("Zmniejszono wiatrakiem temparaturę o " + schlodz + " stopni.");
        wyswietlTempWpomieszczeniu();
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public void wyswietlTempWpomieszczeniu() {
        System.out.println(" -> Aktualna temp w pomieszczeniu to: " + temp);
    }
}
