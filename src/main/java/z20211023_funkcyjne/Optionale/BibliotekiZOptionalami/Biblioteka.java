package z20211023_funkcyjne.Optionale.BibliotekiZOptionalami;

public class Biblioteka {
    Egzemplarz[] egzemplarze;
    Czlowiek[] czlowiek;
    //HashMap<>




    public Biblioteka(Egzemplarz[] egzemplarze) {
        this.egzemplarze = egzemplarze;
    }

    public Biblioteka(Czlowiek[] czlowiek) {
        this.czlowiek = czlowiek;
    }

    public Egzemplarz[] szukajPoTytule(String tytul) throws ExeptionJawny {
        Egzemplarz[] found = new Egzemplarz[egzemplarze.length];
        for (int i = 0; i < egzemplarze.length; i++) {
            if (egzemplarze[i].getTytul().equals(tytul)) { //****
                found[i] = egzemplarze[i];
        /*        if (found[i]==0) {
                    throw new ExeptionJawny();
                }*/
            }

        }

        //throw new ExeptionJawny();
        return found;
    }

    public void display1() {
        Egzemplarz[] tbl = new Egzemplarz[0];
        try {
            tbl= szukajPoTytule("Tytul1");
        } catch (ExeptionJawny e) {
            e.setStackTrace();

        }
        for (Egzemplarz egzemplarz : tbl) {
            if (egzemplarz != null) {
                System.out.println(egzemplarz.autor.imie + " " +
                        egzemplarz.autor.nazwisko + " ->  " + egzemplarz.tytul);
            }
        }
    }


    public Egzemplarz[] szukajPoAutorze(Autor autor) {
        Egzemplarz[] foundNazw = new Egzemplarz[egzemplarze.length];
        for (int i = 0; i < egzemplarze.length; i++) {
            if ((egzemplarze[i].getAutor().equals(autor))){
                foundNazw[i] = egzemplarze[i]; //brac z autor1 itd z maina
            }
        }
        return foundNazw;
    }

}