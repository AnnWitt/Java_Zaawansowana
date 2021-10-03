package z20211003.BibliotekaZwiazki.pkg;

public class Autor extends Czlowiek {
    String gatunek;

    public Autor(String imie, String nazwisko, String gatunek) {
        super(imie, nazwisko);
        this.gatunek = gatunek;
    }


}
