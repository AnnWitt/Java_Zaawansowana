package Zadaniapo20211010.Zad4IntChlodzi;

public class TempMain {
    public static void main(String[] args) {

        double temperatura = 20;
        Farelka f1 = new Farelka();
        Klimatyzacja k1 = new Klimatyzacja();
        Wiatrak w1 = new Wiatrak();

        System.out.println("Wyjsciowa temperatura to " + temperatura);
        f1.pobierzTemp(temperatura);
        f1.zwiekszTemp(10);
        f1.zwiekszTemp(10);
        temperatura = f1.getTemp();
        w1.pobierzTemp(temperatura);
        w1.schlodz(2);
        temperatura = w1.getTemp();
        k1.pobierzTemp(temperatura);
        k1.schlodz(13);
        temperatura = k1.getTemp();
        k1.pobierzTemp(temperatura);
        k1.zwiekszTemp(10);
        temperatura = k1.getTemp();
        f1.pobierzTemp(temperatura);
        f1.zwiekszTemp(2);


    }
}
