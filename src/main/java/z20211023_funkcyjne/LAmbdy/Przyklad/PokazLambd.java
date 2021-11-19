package z20211023_funkcyjne.LAmbdy.Przyklad;

import java.util.Comparator;
import java.util.Locale;

public class PokazLambd {

    public static void main(String[] args) {


        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!r1");
                System.out.println("Czescr1");
            }
        };

        Runnable r2 = () -> {
            System.out.println("Hellor2");
            System.out.println("Czescr2");
        };

        r.run();
        r2.run();


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Comparator<String> comparator1 = (String x, String y) -> x.compareTo(y);


        Funkcjonalny f = new Funkcjonalny() {
            @Override
            public int sth(Integer x) {
                return x * 10;
            }
        };
        System.out.println(f.sth(6));

        Funkcjonalny f1 = (wartosc) -> wartosc * 10;
        System.out.println(f1.sth(6));

        System.out.println("próba Ani");
        Funkcjonalny f2=(dupa)-> (f1.sth(4)*10);
        System.out.println(f2.sth(2)); //wynik 400 -> 4*10=40 + z wywołania f1 wartosc azy 10. To co w tym nawiasie nie ma znaczenia.

        FunkcjonalnyBezArgumentow fx1=() -> 4; //tu bezparametrowy to przypisujemy konretna wartosc

        System.out.println(fx1.pustyFunkcjonalny()*10);

        FunkcyjnyVoid fv=(string) -> System.out.println(string.toUpperCase(Locale.ROOT));
        fv.intVoid("dupa");

        //mieszany

        Mieszany mix=(licznik,tekst)->{
            for (int i=0;i <=licznik;i++) {
                System.out.println(licznik + " ----> " + tekst);
            }
        };
        mix.mix(4,"dupa");
    }
}
