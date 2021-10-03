package z20211003.Kolo;

class KoloMetody {
    protected double promien;
    protected final double PI =Math.PI;

    public KoloMetody(double promien) {
        this.promien = promien;
    }

    public KoloMetody() {
        this.promien = promien;
    }

   protected final double obliczPole() {
        return PI *promien*promien;
    }

    protected final double obliczPole(boolean negative) {
        return 333; //przeciazenie
    }

    protected final double obliczPoleD(final boolean negative) {
        return 333; //przeciazenie //final przy konstruktorze
    }

    protected final double obliczPole(String negative) {
        return 333; //przeciazenie
    }

    protected final double obliczPole(float zlonga) {
        return 333333333; //przeciazenie
    }





    //----------- gettery/settery
    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }


    //-------------gettery/settery


}
