package z20211023.Optionale.BibliotekiZOptionalami;

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
