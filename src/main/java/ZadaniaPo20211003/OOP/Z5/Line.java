package ZadaniaPo20211003.OOP.Z5;

class Line {
    private Point2D punktPoczatkowy;
    private Point2D punktKoncowy;
    private float xP, yP, xK, yK;

     Line(Point2D punktPoczątkowy, Point2D punktKoncowy) {
        setPunktPoczątkowy(punktPoczątkowy);
        setPunktKoncowy(punktKoncowy);
        this.xP = punktPoczątkowy.getX();
        this.yP = punktPoczątkowy.getY();
        this.xK = punktKoncowy.getX();
        this.yK = punktKoncowy.getY();
    }

      Line(float xP, float yP, float xK, float yK) {
        setPunktPoczątkowy(new Point2D(xP,yP));
        setPunktKoncowy(new Point2D(xK,yK));
    }

    void  ObliczDlugoscOdcinka() {
        float dlugoscOdcinka = (float) Math.sqrt((float) Math.pow((getPunktKoncowy().getX() - getPunktPoczątkowy().getX()), 2) +
                (float) Math.pow((getPunktKoncowy().getY() - getPunktPoczątkowy().getY()), 2));
        System.out.println("Dlugość odcinka wynosi pomiędzy punktami " + punktPoczatkowy + " a " + punktKoncowy + " wynosi " + dlugoscOdcinka);
    }

    void SrodekOdcinka(){
        float xS= ((getPunktPoczątkowy().getX())+ getPunktKoncowy().getX())/2;
        float yS= ((getPunktPoczątkowy().getY())+ getPunktKoncowy().getY())/2;
        Point2D middlePoint=new Point2D(xS,yS);
        System.out.println("Wspołrzędnie środka odcinka pomiędzy " + punktPoczatkowy + " a " + punktKoncowy + " to " +middlePoint);
    }


    Point2D getPunktPoczątkowy() {
        return punktPoczatkowy;
    }

    void setPunktPoczątkowy(Point2D punktPoczątkowy) {
        this.punktPoczatkowy = punktPoczątkowy;
    }

    Point2D getPunktKoncowy() {
        return punktKoncowy;
    }

    void setPunktKoncowy(Point2D punktKoncowy) {
        this.punktKoncowy = punktKoncowy;
    }
}
