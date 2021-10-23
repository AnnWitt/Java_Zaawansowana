package z20211023.LAmbdy.InterfejsyFunkcyjne;

import java.util.function.Predicate;
//zamiana na booleana
public class PredicatExample {
    public static void main(String[] args) {
        //szczegolny przypadek Function
        Predicate<Integer> predicate=value -> value>=0; //wpada w to i sprawdza czy
        Predicate<Integer> predicate2=value -> value>=0 && value<100; //wpada w to i sprawdza czy
        //jest wieksza od zera, tylklpo dodatnie przez to przejda
        //predykat
        checkTest(predicate, 10); //tak
        checkTest(predicate, -4); //nie


    }

    static void  checkTest(Predicate<Integer> predicate, Integer valueToCheck){ //jeżeli tylko do
        // int a mogloby byc tez bez
        System.out.println(predicate.test(valueToCheck));
        //to test z dokumenta
    }

    static void  checkTestDlaDowolnegoTypu(Predicate predicate, Object valueToCheck){ //jeżeli tylko do
        // int a mogloby byc tez bez
        System.out.println(predicate.test(valueToCheck));
        //to test z dokumenta
    }

}
