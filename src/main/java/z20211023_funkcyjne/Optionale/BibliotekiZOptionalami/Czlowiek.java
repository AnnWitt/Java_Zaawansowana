package z20211023_funkcyjne.Optionale.BibliotekiZOptionalami;

public abstract class Czlowiek {
    String imie;
    String nazwisko;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        if (nazwisko.length()<2) {
            throw new IllegalSurnameEx("za krotnie nazwisko " + "nazwisko to: " + getNazwisko());
        }

    }



    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


}
