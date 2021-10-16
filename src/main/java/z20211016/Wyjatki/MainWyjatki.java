package z20211016.Wyjatki;

import z20211009.Generyczne.Garaz.Samochod;

public class MainWyjatki {

    public static void main(String[] args) {
        //jezeli mamy korzystac z naszego
        //brak obslugi wyjatku, idzie w hierarchi coraz wyzej az jezeli
        //w mainie nie ma to sie wywali

      //  throw new Exception("ddd");

//tu wywolania metod, ktore moga spowodowac problem
        try {
            //miejsce wywolania wyjatkow
        } catch (IllegalArgumentException | IllegalAccessError
                | IllegalMonitorStateException e) { // | kolejne mozliwe typy
            //w e przechowujemy wyjatek. Wyjatki jakby rownorzedne w hierarchi. Jak
            //Excepion to sie przypierdoli
//            jezeli zlapiemy to tu wykonujemy kod np opis co sie stalo i lecimy dalej
            //jezeli w try jakis inny nic to co w nawiasie to nie zostanie obsluzony
       e.printStackTrace(); //alternatywa dla sout
            //wypisze blad ale program pojdzie dalej

        } finally { //niezalezne od wystapieniu wyjatku lub jego braku
            //np zamknij strumien, zasz sie wykona
            System.out.println("wyswietl zawartosc finally");
           // System.exit( -1); //to nie pozwoli na wykonanie einally
        }

        System.out.println("tego po finally juz nie wyswietli");

        //po jednym try mozna wiele catchy
    }

}
