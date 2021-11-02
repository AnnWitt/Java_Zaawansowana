package ZadaniaPo20211003.OOP.Z2AW;

class Lecturer extends Person {
    String specjalizacja;
    int wynagrodzenie;


    Lecturer(String specjalizacja, int wynagrodzenie) {
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

/*    Lecturer(String name, String address, String specjalizacja, int wynagrodzenie) {
        super(name, address);
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }*/

    @Override
    public String toString() {
        return "Lecturer{" +
                "specjalizacja='" + specjalizacja + '\'' +
                ", wynagrodzenie=" + wynagrodzenie +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //----------------------
     String getSpecjalizacja() {
        return specjalizacja;
    }

     void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

     int getWynagrodzenie() {
        return wynagrodzenie;
    }

     void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
}
