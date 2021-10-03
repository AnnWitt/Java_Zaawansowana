package z20211003.BibliotekaZwiazki.pkg;

public abstract class Egzemplarz {
    Autor autor;
    String tytul;

    public Egzemplarz(Autor autor, String tytul) {
        this.autor = autor;
        this.tytul = tytul;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }
}
