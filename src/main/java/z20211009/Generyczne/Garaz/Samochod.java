package z20211009.Generyczne.Garaz;

import java.util.Objects;

public abstract class Samochod {
    protected String marka;
    protected String model;
    protected String kolor;

    String zmienKolor(String kolor) {
        this.kolor=kolor;
        return this.kolor;
    }


    public Samochod(String marka,String model, String kolor) {
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


    @Override
    public boolean equals(Object o) {  //sprawdzamy czy to ten sam obiekt o
        if (this == o) return true;
        if (!(o instanceof Samochod)) return false;
        Samochod samochod = (Samochod) o; //obiekt zrzutowany na samochod
        return Objects.equals(marka, samochod.marka) &&
                Objects.equals(model, samochod.model) &&
                Objects.equals(kolor, samochod.kolor);
    }

}
