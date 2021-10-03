package z20211003.BibliotekaZwiazki.pkg;

public class BibliotekaMain {

    public static void main(String[] args) {
        Autor autor1 = new Autor("imie autora1", "nazwisko autora2", "horror");
        Egzemplarz egz1 = new Ksiazka(autor1, "Tytul1"); //egzemplarz abstr wiec z ksiazka
        Autor autor2 = new Autor("imie autora2", "nazwisko autora", "horror");
        Egzemplarz egz2 = new Ksiazka(autor2, "Tytul2");
        Autor autor3 = new Autor("imie autora3", "nazwisko autora2", "horror");
        Egzemplarz egz3 = new Ksiazka(autor3, "Tytul1");
//ctrl Q
        Egzemplarz[] egzemplarze = {egz1, egz2, egz3};
        Biblioteka biblioteka1 = new Biblioteka(egzemplarze);

        biblioteka1.display1();
        System.out.println("11111");
        biblioteka1.display2();
        //System.out.println(biblioteka1.szukajPoTytule("Tytul1"));

    }
}
