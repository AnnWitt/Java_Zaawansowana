package Zadaniapo20211010.Zad4IntChlodzi;

public class Klimatyzacja implements Grzeje, Chlodzi{
    double temp;

    @Override
    public double pobierzTemp(double temp) {
        return this.temp=temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public void schlodz(double schlodz) {
        temp=pobierzTemp(temp)-schlodz;
        System.out.print("Zmniejszono klimatyzacją temparaturę o " + schlodz + " stopni.");
        wyswietlTempWpomieszczeniu();

    }

    @Override
    public void wyswietlTempWpomieszczeniu() {
        System.out.println(" -> Aktualna temp w pomieszczeniu to: " + temp);
    }

    @Override
    public void zwiekszTemp(double podgrzej) {
        temp=pobierzTemp(temp)+podgrzej;
        System.out.print("Zwiekszono klimatyzacja temparaturę o " + podgrzej + " stopni.");
        wyswietlTempWpomieszczeniu();
    }
}
