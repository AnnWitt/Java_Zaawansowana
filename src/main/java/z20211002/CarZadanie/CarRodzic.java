package z20211002.CarZadanie;

class CarRodzic {
    int predkosc=70;
    boolean swiatla;
    String kolor;
    String marka;
    short rocznik;

    void wlaczSwiatla(){
        this.swiatla=true;
        System.out.println(this.swiatla);
    }

    boolean czySwiatlaWlaczone (){
        return this.swiatla;
    }

    @Override
    public String toString() {
        return "CarRodzic{" +
                "kolor='" + this.kolor + '\'' +
                ", marka='" + this.marka + '\'' +
                ", rocznik=" + this.rocznik +
                '}';
    }

    public CarRodzic(String kolor, String marka, short rocznik) {
        this.kolor=kolor;
        this.marka=marka;
        this.rocznik=rocznik;
    }

    void przyspiesz() {
        this.predkosc = this.predkosc + 10;
        if (this.predkosc > 120) {
            System.out.println("Samochod nie może jechać więcej niż 120h");
        } else {
            System.out.println("Przyspieszono do: " + this.predkosc);
        }
    }

    //--------------------------------------------


}
