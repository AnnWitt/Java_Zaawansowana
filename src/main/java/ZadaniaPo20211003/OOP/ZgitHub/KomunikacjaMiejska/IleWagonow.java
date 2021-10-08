package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

 enum IleWagonow {

    JEDEN(1),
    DWA(2),
    TRZY(3);

     int liczbaWagonow;

     int getLiczbaWagonow() {
        return liczbaWagonow;
    }

    IleWagonow(int wagonow) {
        this.liczbaWagonow=wagonow;
    }


}
