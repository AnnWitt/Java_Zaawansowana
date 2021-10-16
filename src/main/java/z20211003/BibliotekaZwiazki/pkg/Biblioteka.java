package z20211003.BibliotekaZwiazki.pkg;

public class Biblioteka {
    Egzemplarz[] egzemplarze;
    Czlowiek[] czlowiek;




    public Biblioteka(Egzemplarz[] egzemplarze) {
        this.egzemplarze = egzemplarze;
    }

    public Biblioteka(Czlowiek[] czlowiek) {
        this.czlowiek = czlowiek;
    }

    public Egzemplarz[] szukajPoTytule(String tytul) throws ExeptionJawny {
        Egzemplarz[] found = new Egzemplarz[egzemplarze.length];


        //mozna tu dodac licznik i drugi raz ta sama petle ale uzupelniac mniejsza tablice
        //wtedy tych nulli w ogole nie bedzie w tablicy
        for (int i = 0; i < egzemplarze.length; i++) { //zamiast euals contains to bedzie po frazie te
            //teraz kolejnosc jest wazna
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

    //     *****   egzemplarze[i].getTytul().equals(tytul)) //moze pojdzie null
    //        tytul.equals(egzemplarze[i].getTytul())) //tu nie pojdzi
    //
    //        cos i null w srodku, wywolujemy equals na czyms co nie bedzie nulem


    public void display1() {
        Egzemplarz[] tbl = new Egzemplarz[0]; //= szukajPoTytule("Tytul1");
        try {
            tbl= szukajPoTytule("Tytul1");
        } catch (ExeptionJawny e) {
            e.setStackTrace();

/*
//            jezeli zlapiemy to tu wykonujemy kod np opis co sie stalo i lecimy dalej
            //jezeli w try jakis inny nic to co w nawiasie to nie zostanie obsluzony
            e.printStackTrace(); //alternatywa dla sout*/

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
            //if ((egzemplarze[i].getNazwisko().equals(autor.nazwisko)) && (czlowiek[i].getNazwisko().equals(autor.nazwisko))){
            if ((egzemplarze[i].getAutor().equals(autor))){
                foundNazw[i] = egzemplarze[i]; //brac z autor1 itd z maina
            }
        }
        return foundNazw;
    }

   //zrobic po autrozesz
    /*public void display2() {
        Autor autor=new Autor("imie", "nazwisko", "gatunek");
        Czlowiek[] tbl2 = szukajPoAutorze(autor); //tu jest blad
        for (Czlowiek czl : tbl2) {
            if (czl != null) {
                System.out.println(czl.getImie() + " " +
                        czl.getNazwisko() + " ->  ");
            }
        }*/
   // }


}