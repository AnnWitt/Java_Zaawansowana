package z20211009.Generyczne.Garaz;

public class Main {
    public static void main(String[] args) {
        Samochod s1bmw = new BMW("modelBMW", "kolorBMW");
        Samochod s2porshe = new Porshe("modelPorshe", "kolorPorshe");
        Garaz<Samochod> auto=new Garaz<>(s1bmw,s2porshe);

        auto.zaparkuj(s1bmw);


    }

}
