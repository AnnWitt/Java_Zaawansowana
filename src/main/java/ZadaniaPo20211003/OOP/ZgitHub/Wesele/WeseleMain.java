package ZadaniaPo20211003.OOP.ZgitHub.Wesele;


/*

        Po zaimplementowaniu poproś użytkownika o podanie ilości zaproszeń a następnie wprowadź dla każdego zaproszenia jego imie, nazwisko i typ.
        Przechowaj zaproszenia w tablicy.

        Po zebraniu informacji stwórz pętlę i zsumuj osoby na zaproszeniach (jeśli jest to zaproszenie z os. towarzyszaca, to dodajesz 2, jesli nie, to 1).


        Lacznie zaproszono: 5 osób.*/

import java.util.*;

public class WeseleMain {

    public static void main(String[] args) {

        List<Zaproszenie> lista = new ArrayList<>();
        //lista.add(new Zaproszenie("imieBezOsobnego", "nazwiskobezOsobnego",TypZaproszenia.ZOSOBATOWARZYSZACA ));

        Zaproszenie z1=(new Zaproszenie("imieBezOsobnego", "nazwiskobezOsobnego",TypZaproszenia.ZOSOBATOWARZYSZACA ));
        Zaproszenie z2=(new Zaproszenie("imieBezOsobnego", "nazwiskobezOsobnego",TypZaproszenia.ZOSOBATOWARZYSZACA ));
        Zaproszenie z3=(new Zaproszenie("imieBezOsobnego", "nazwiskobezOsobnego",TypZaproszenia.ZOSOBATOWARZYSZACA ));

        lista.addAll(List.of(z1,z2,z3));
        //figuraTreeSet.addAll(List.of(f1,f2,f3,f4,f5,f6));

        Scanner scanner = new Scanner(System.in);
        boolean goOn = true;
        String akcja;
        int ileOsobWsumie = 0;
        while (goOn == true) {
            System.out.println("Czy chcesz dodać nowe zaproszenie? T/N");
            akcja = scanner.nextLine();
            if (!akcja.toUpperCase(Locale.ROOT).equals("T") && !akcja.toUpperCase(Locale.ROOT).equals("N")) {
                System.out.println("Wybrano niepoprawną akcję");
                //break;
            } else {
                if (akcja.toUpperCase(Locale.ROOT).equals("T")) {
                    System.out.println("Podaj imię, nazwisko, czy z osobą towarzyszącą (T/N");
                    String[] osoba = (scanner.nextLine()).split(" ");
                    TypZaproszenia typ = null;
                    switch (osoba[2].toUpperCase(Locale.ROOT)) {
                        case "N": {
                            typ = TypZaproszenia.POJEDYNCZE;
                            lista.add(new Zaproszenie(osoba[0], osoba[1], typ));
                            ileOsobWsumie++;
                            break;
                        }
                        case "T": {
                            typ = TypZaproszenia.ZOSOBATOWARZYSZACA;
                            lista.add(new Zaproszenie(osoba[0], osoba[1], typ));
                            ileOsobWsumie = ileOsobWsumie + 2;
                            break;
                        }

                        default:
                            System.out.println("Niepoprawny wartość - wybierz T lub N");
                            break;
                    }
                    goOn = true;
                } else if (akcja.toUpperCase(Locale.ROOT).equals("N")) {
                    goOn = false;
                    System.out.println("Zakonczono");
                } else {
                    System.out.println("Niepoprawna wartosc");
                    goOn = true;
                }

            }

        }
        System.out.println("Dodano " + ileOsobWsumie + " gosci");
        System.out.println(lista);
    }
}
