package samochodDziedziczenie;

class CarRodzic {
    int predkosc=70;
    boolean swiatla;

    void wlaczSwiatla(){
        this.swiatla=true;
        System.out.println(this.swiatla);
    }

    boolean czySwiatlaWlaczone (){
        return this.swiatla;
    }

    public CarRodzic() {
        this.predkosc = predkosc;
    }

    void przyspiesz() {
        this.predkosc = this.predkosc + 10;
        if (this.predkosc > 120) {
            System.out.println("Samochod nie może jechać więcej niż 120h");
        } else {
            System.out.println("Przyspieszono do: " + this.predkosc);
        }
    }

    //--------------------------------------------


}
