package z20211002.enumyCwiczenie;

public class enumMain {
   /* public static void main(String[] args) {
        enumBilet ulgowy=enumBilet.ULGOWY;
        System.out.println("ulgowy " + ulgowy);
        System.out.println("ulgowy cena | " + ulgowy.cena);
        System.out.println("ulgowy getCena | " + ulgowy.getCena());
    }*/

    public static void main(String[] args) {
        Bilet normalnyGodzinny=Bilet.NORMALNY_GODZINNY; //nazwa klasy enum, nazwa zmiennej,
        Bilet ulgowyGodzinny=Bilet.ULGOWY_GODZINNY; //nazwa klasy enum, nazwa zmiennej,
        Bilet brakBiletu=Bilet.BRAK_BILETU; //nazwa klasy enum, nazwa zmiennej,
        //przypisanie konkretnej wartosci enum

        System.out.println(normalnyGodzinny + " cena " + normalnyGodzinny.pobiezCeneBiletu() +
                " czas " + normalnyGodzinny.pobiezCzasJazdy());

        System.out.println(ulgowyGodzinny + " cena " + ulgowyGodzinny.cena +
                " czas " + ulgowyGodzinny.czasJazdyWmin);
        System.out.println(ulgowyGodzinny + " cena " + ulgowyGodzinny.pobiezCeneBiletu() +
                " czas " + ulgowyGodzinny.pobiezCzasJazdy());

        System.out.println(brakBiletu + " cena " + brakBiletu.pobiezCeneBiletu() +
                " czas " + brakBiletu.pobiezCzasJazdy());

        Bilet.wyswietlDaneOBilecie();

        System.out.println("Zadanie 10");
        Bilet.metodaPkt10(13, 20, 5);
        Bilet.metodaPkt10(13, 200, 2);
        Bilet.metodaPkt10(23, 20, 20);
        Bilet.metodaPkt10(23, 200, 2);
        Bilet.metodaPkt10(23, 200, 0);
        Bilet.metodaPkt10(13, 200, 0);







    }
}
