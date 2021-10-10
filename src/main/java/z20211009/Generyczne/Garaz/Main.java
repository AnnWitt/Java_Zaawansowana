package z20211009.Generyczne.Garaz;

public class Main {
    public static void main(String[] args) {
        Samochod s1bmw = new BMW("modelBMW", "kolorBMW");
        Samochod s2porshe = new Porshe("modelPorshe", "kolorPorshe");
        Garaz<Samochod> carGarage=new Garaz<>(s1bmw,s2porshe); //dwa auta sa w  garazu
        Garaz<Samochod> carGarage2=new Garaz("bmw",s2porshe); //przyjmujemy klase bez
        //typizowania.  Przyjmie i stringa i cara, nie typo cara
        // <> typizowanie uzycie typu z <>. Jezeli bedzie <> to nie bedzie umial wywnioskowac
        //jakie argumenty
       // Garaz<Rower> carGarage=new Garaz<>(s1bmw,s2porshe);

        System.out.println("carGarage.zaparkuj(s1bmw);");
        carGarage.zaparkuj(s1bmw);
        System.out.println("carGarage.getAutoOut(s1bmw);");
        carGarage.getAutoOut(s1bmw);
        System.out.println("carGarage.getAutoOut(s1bmw);");
        carGarage.getAutoOut(s1bmw);


    }

}
