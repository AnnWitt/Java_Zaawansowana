package ZadaniaPo20211003.OOP.ZgitHub.RownanieKwadratowe.drugametoda;
import lombok.Data;

@Data
class QadricEquation {
    double a;
    double b;
    double c; //z wartosciami by nie trafiło do konstruktora
    double delta;

    double getX() {
        return ((-b) / (2 * a));
    }

    double getX1() {
        return ((-b - (Math.sqrt(delta))) / (2 * a));
    }

    double getX2() {
        return ((-b + (Math.sqrt(delta))) / (2 * a));
    }


    double Rownanie(double a, double b, double c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Równanie przyjmuje postać: ");
        this.a = a;
        this.b = b;
        this.c = c;

        double delta = 0;
        boolean validate = true;

        try {
            if (a == 0) {
                throw new ZeroweA();
            } else {
                stringBuilder.append(a + "(x^2)");
                if (b < 0) {
                    stringBuilder.append(b + "x");
                } else {
                    stringBuilder.append("+" + b + "x");
                }
                if (c < 0) {
                    stringBuilder.append(c);
                } else {
                    stringBuilder.append("+" + c);
                }
            }
        } catch (ZeroweA zeroweA) {
            validate = false;
        }

        if (validate == true) {
            delta = (Math.pow(b, 2)) - (4 * a * c);
            stringBuilder.append(" -> delta wynosi: " + delta + ".");
            this.delta = delta;

            try {
                if (delta == 0) {
                    stringBuilder.append(" Delta wynosi zero więc mamy jeden pierwiastek kwadratowy " + getX());
                    System.out.println(stringBuilder);
                } else if (delta > 0) {
                    stringBuilder.append(" Delta jest większa od zera więc mamy dwa pierwiastki kwadratowe: " + getX1() + " oraz " + getX2());
                    System.out.println(stringBuilder);
                } else if (delta < 0) {
                    System.out.print(stringBuilder);
                    throw new ujemnaDelta();
                }
            } catch (IllegalArgumentException ujemnaDelta) {

            }
        }
        return delta;
    }
}


