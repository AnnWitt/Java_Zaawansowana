package ZadaniaPo20211003.Wyjatki.Z1PowtorkaZtestami;

public class Z1MainWyjatki {

    public static void main(String[] args) {

        divide(4, 2);
        divide(0, 2);
        divide(4, 0);
        divide(4, 3);
    }


    static double divide(double a, double b) throws DzieleniePrzezZero {
        double wynik = a / b;
        try {
            if (b == 0) {
                throw new DzieleniePrzezZero();
            } else {
                System.out.println(wynik);
            }
        } catch (DzieleniePrzezZero exception) {
           System.out.println(exception.getMessage());

        }
        return wynik;
    }


}
