package z20211023_funkcyjne.LAmbdy.Przyklad;

import java.util.function.Consumer;

public class ReferncjeMetod {
    public static void main(String[] args) {


        Consumer<String> consumer = valueToAccept -> System.out.println(valueToAccept);

        /*
        Aby uzyc referencji do metody, lambda musi otrzymywac jeden argument i:
        a) argument wejściowy lambdy jest argumentem metody (do ktorej robimy referencje)
        lub
        b) na argumencie wejściowym wywoływana jest bezargumentowa metoda
         */

        // przypadek a)
        System.out.println(); // wywolanie metody
        Consumer<String> consume2 = System.out::println; // referencja do metody

        // przypadek b)
        Consumer<String> consume3 = String::length; // referncja do metody
        ;

        consume2.accept("Ala ma kota");
        consume3.accept("Ala ma kota");

    }
}
