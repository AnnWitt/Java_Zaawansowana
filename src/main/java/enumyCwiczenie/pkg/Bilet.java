package enumyCwiczenie.pkg;

public enum Bilet {

    ULGOWY_GODZINNY(2.3, 2),
    ULGOWY_CALODNIOWY(4.3, 120),
    NORMALNY_GODZINNY(4.3, 2),
    NORMALNY_CALODNIOWY(8.3, 120),
    BRAK_BILETU(0, 20),
    ;

    double cena;
    int czasJazdyWmin;
    int wiek;

    Bilet(double cena, int czasJazdyWmin) {
        this.cena = cena;
        this.czasJazdyWmin = czasJazdyWmin;
    }

    double pobiezCeneBiletu() {
        return cena;
    }

    double pobiezCzasJazdy() {
        return czasJazdyWmin;
    }

    static void wyswietlDaneOBilecie() {
        System.out.println("Bilet ulgowy 1-godzinny ");
    }

    static void metodaPkt10(int wiek, int czasJazdy, double kwota) {
        Bilet typBiletu;
        if (kwota == 0) {
            typBiletu=BRAK_BILETU;
            System.out.println("Niewystarczajace środki na zakup dowolnego biletu "
                    + typBiletu);}
            else{
                if (wiek <= 18) {
                    if (czasJazdy > 120) { //moznaby thisem
                        typBiletu = ULGOWY_CALODNIOWY;
                    } else {
                        typBiletu = ULGOWY_GODZINNY;
                    }

                    boolean czyMozna = kwota > typBiletu.pobiezCeneBiletu();
                    if (czyMozna == true) {
                        System.out.println("(ulgowy) Mozna kupic " + typBiletu);
                    } else {
                        System.out.println("(ulgowy)  Nie Mozna kupic " + typBiletu);
                    }
                } else {
                    if (czasJazdy > 120) {
                        typBiletu = NORMALNY_CALODNIOWY;
                    } else {
                        typBiletu = NORMALNY_GODZINNY;
                    }
                    boolean czyMozna = kwota > typBiletu.pobiezCeneBiletu();
                    if (czyMozna == true) {
                        System.out.println("(normalny) Mozna kupic " + typBiletu);
                    } else {
                        System.out.println("(normalny) Nie Mozna kupic " + typBiletu);
                    }
                }
            }
        }
    }




