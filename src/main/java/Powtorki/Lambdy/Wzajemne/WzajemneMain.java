package Powtorki.Lambdy.Wzajemne;

public class WzajemneMain {
    public static void main(String[] args) {
        InterfejsWzajemne1 w1 = (number1) -> number1 * 2;
        InterfejsWzajemne2 w2 = (number21, number22) -> {
            number21 = w1.wzajemna1(number21);
            return number21 * number22;
        };
        int wynikW2 = w2.wzajemna2(1, 3);
        System.out.println("Wynik W2 " + wynikW2);

        InterfejsWzajemneTekst w3 = (numerTeks) -> {
            numerTeks = wynikW2;
            for (int licznikX = 0; licznikX < numerTeks; licznikX++) {
                System.out.println(licznikX + 1 + " dupa");
            }
            return null;
        };
        w3.wzajemneTekst(wynikW2);
    }
}
