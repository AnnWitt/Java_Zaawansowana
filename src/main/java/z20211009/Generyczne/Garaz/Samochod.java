package z20211009.Generyczne.Garaz;

public class Samochod {
    String marka;
    String model;
    String kolor;

    String zmienKolor(String kolor) {
        this.kolor=kolor;
        return this.kolor;
    }

    public Samochod(String model, String kolor) {
        this.model = model;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }





}
