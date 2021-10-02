package samochodDziedziczenie;

public class KabrioletDZ extends CarRodzic {

    boolean dach=false;
    KabrioletDZ() {
        this.dach = dach;
    }

    void schowajDach(){
        this.dach=true;
        System.out.println(" Dach schowano");
    }

    boolean czyDachSchowany() {
        return this.dach;
    }

 @Override
    void przyspiesz() {
        this.predkosc=170;
        this.predkosc = this.predkosc + 10;
        if (this.predkosc > 190) {
            System.out.println("Samochod nie może jechać więcej niż 120h");
        } else {
            System.out.println("Przyspieszono do: " + this.predkosc);
        }
    }

}
