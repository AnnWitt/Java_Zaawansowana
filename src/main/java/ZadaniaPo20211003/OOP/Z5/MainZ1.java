package ZadaniaPo20211003.OOP.Z5;

public class MainZ1 {

    public static void main(String[] args) {


        System.out.println("Zadanie 5");

        Point2D punktPoczatkowy = new Point2D(2, 7);
        Point2D punktKoncowy = new Point2D(3, 13);

        System.out.println("Zadanie 5 po punktach");
        Line line = new Line(punktPoczatkowy, punktKoncowy);
        line.ObliczDlugoscOdcinka();
        line.SrodekOdcinka();
        System.out.println("Zadanie 5 po wspolrzednych");
        Line line2=new Line(2,7,3,13);
        line2.ObliczDlugoscOdcinka();
        line2.SrodekOdcinka();
    }
}
