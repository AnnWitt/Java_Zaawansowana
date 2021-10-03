package z20211002.CarZadanie;

public class KabrioletDZ extends CarRodzic {
    String kolor;
    String marka;
    int rocznik;
    //protected boolean dach=false;
    boolean dach=false;

    @Override
    public String toString() {
/*        return "KabrioletDZ{" +
                "kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", rocznik=" + rocznik +'\'' +
                ", dach=" + dach+
                '}';*/
        return super.toString()+ "rozsuwanym dachem" + dach; //to jest z CarRodzic dlatego
        //dodatkowo dach bo jego tam nie bylo
    }

    KabrioletDZ(String kolor, String marka, short rocznik) {
        super(kolor,marka,rocznik);
        this.dach = dach;
    }

    void schowajDach(){
        this.dach=true;
        System.out.println(" Dach schowano");
    }

    boolean czyDachSchowany() {
        return this.dach;
    }

 @Override
    void przyspiesz() {
        this.predkosc=170;
        this.predkosc = this.predkosc + 10;
        if (this.predkosc > 190) {
            System.out.println("Samochod nie może jechać więcej niż 120h");
        } else {
            System.out.println("Przyspieszono do: " + this.predkosc);
        }
    }

}
