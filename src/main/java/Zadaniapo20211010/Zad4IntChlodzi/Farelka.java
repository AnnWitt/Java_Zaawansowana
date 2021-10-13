package Zadaniapo20211010.Zad4IntChlodzi;

public class Farelka implements Grzeje{
    double temp;

    @Override
    public double pobierzTemp(double temp) {
        return this.temp=temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public void zwiekszTemp(double podgrzej) {
        temp=pobierzTemp(temp)+podgrzej;
        System.out.print("Zwiekszono farelką temparaturę o " + podgrzej + " stopni.");
        wyswietlTempWpomieszczeniu();

    }

    @Override
    public void wyswietlTempWpomieszczeniu() {
        System.out.println(" -> Aktualna temp w pomieszczeniu to: " + temp);
    }
}
