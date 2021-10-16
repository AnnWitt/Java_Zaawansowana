package z20211009.Kolekcje.Sety.Z3Lotto;

import z20211009.Kolekcje.Sety.Z2Figura.Figura;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoGra {

    static void zagraj() {
        Set<Object> s1 = wprowadzLiczby();
        Set<Object> s2 = przeprowadzLosowanie();
        System.out.println("liczby wprowadzone " + s1);
        System.out.println("liczby wylosowane " + s2);
        System.out.println("Liczba trafien " + zwrocWynik(s1, s2));
    }


    static Set<Object> wprowadzLiczby() {
        Scanner scanner = new Scanner(System.in);
        Set<Object> liczbyWprowadzone = new HashSet<>();
        //set1.size();
        while (liczbyWprowadzone.size() < 6) {
            System.out.println("Podaj liczbę od 1 do 49");
            int liczba = scanner.nextInt();
            if (liczba <= 49 && liczba >= 1) {
                liczbyWprowadzone.add(liczba);
            } else {
                System.out.print("Liczba spoza przedziału. ");
            }
        }

        return liczbyWprowadzone;
    }

    private static int zwrocWynik(Set<Object> wprowadzone, Set<Object> wylosowane) {
        Set<Object> wspolne = new HashSet<>(wprowadzone);
        wspolne.retainAll(wylosowane); //zostaje tylko obiekt zlozony z czesci wspolnej, dlateog była kopia
        /*wspolne.removeAll(wylosowane); //wywala tylko duplikaty ale z 1
        wylosowane.removeAll(wprowadzone); //wywala tylko duplikaty
        System.out.println(wspolne);
        System.out.println(wylosowane);*/
        return wspolne.size();
    }


    private static Set<Object> przeprowadzLosowanie() {
        Set<Object> liczbyWylosowane = new HashSet<>();
        while (liczbyWylosowane.size() < 6) {
            int liczba = (int) (Math.random() * 10) + 1;
            liczbyWylosowane.add(liczba);
        }
        return liczbyWylosowane;

    }
}
