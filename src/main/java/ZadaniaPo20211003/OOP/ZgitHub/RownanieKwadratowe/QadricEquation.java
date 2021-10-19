package ZadaniaPo20211003.OOP.ZgitHub.RownanieKwadratowe;

import z20211003.BibliotekaZwiazki.pkg.IllegalSurnameEx;

class QadricEquation {
    static double a, b, c;
    static double delta;


    static void setDelta(double delta) {
        QadricEquation.delta = delta;
    }

    static double getX() {

        return ((-b) / (2 * a));

    }

    static double getX1() {

        return ((-b - (Math.sqrt(delta))) / (2 * a));

    }

    static double getX2() {
        return ((-b + (Math.sqrt(delta))) / (2 * a));

    }

    QadricEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //ax^2 + bx +c =0
    //delta - b^2 -4ac

    static double Rownanie(double a, double b, double c)  {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Równanie przyjmuje postać: ");
        setA(a);
        setB(b);
        setC(c);

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
            setDelta(delta);
            //System.out.println(stringBuilder);

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


    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        QadricEquation.a = a;
    }


    public static void setB(double b) {
        QadricEquation.b = b;
    }


    public static void setC(double c) {
        QadricEquation.c = c;
    }
}


