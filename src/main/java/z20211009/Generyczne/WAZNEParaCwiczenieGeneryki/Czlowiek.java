package z20211009.Generyczne.WAZNEParaCwiczenieGeneryki;

 class Czlowiek {
    protected Object imie;
    protected Object nazwisko;
    protected Object plec;

     Czlowiek(String imie, String nazwisko, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

     Object costam() {

        return "dupa";
    }


}
