package Zadaniapo20211010.CwiczenieAWwlasne;

public class MainAW {

    public static void main(String[] args) {

        AW1 aw1=new AW1();
        AW2 aw2=new AW2();
        AW3 aw3=new AW3();
        AW1 ewka=new Ewka();
        AW2 gen1=new Gen1<>();
        Gen1<String> listaGen=new Gen1<>();

        aw1.kolorBluzki();
        aw2.kolorBluzki();
        aw3.kolorBluzki();
        System.out.println("--------------z dziedziczonej -------------------------");
        ewka.kolorBluzki();
        System.out.println("------------z generycznej----------------");
        gen1.kolorBluzki();
        listaGen.Mod("dad");


    }
}
