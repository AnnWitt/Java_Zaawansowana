package Zadaniapo20211010.CwiczenieAWwlasne;

public class MainAW {

    public static void main(String[] args) {

        AW1 aw1 = new AW1();
        AW2 aw2 = new AW2();
        AW3 aw3 = new AW3();
        AW1 ewka = new Ewka();
        AW2 gen1 = new Gen1<>();
        Gen1<String> listaGen = new Gen1<>();

        aw1.kolorBluzki();
        aw2.kolorBluzki();
        aw3.kolorBluzki();
        System.out.println("--------------z dziedziczonej -------------------------");
        ewka.kolorBluzki();
        System.out.println("------------z generycznej----------------");
        gen1.kolorBluzki();
        listaGen.Mod("dad");
        System.out.println("----------lambda--o cos mi chodzi ale nie wiem o co--------");

/*
        InterfejsPodLambdy test = (dupastring) -> {
            return String.valueOf(dupastring.length());
        };
        System.out.println(test.ModInt("ochujec mozna")); //zwroci dlugosc
*/

        InterfejsPodLambdy test2 = (dupa) -> "pokurwiony test" + dupa;
        System.out.println(test2.coZaBajzel(" ja pierdole"));



     /*   IFzeStringiem zapisZLambdami2 = (string) -> "test z lambdami " + string;
        System.out.println(zapisZLambdami2.wInterfejsieFunkcyjnymBezCiala("any"));*/


        //(dupa)-> {return
        //test.ModInt("dudddd");


    }

    ;


}
