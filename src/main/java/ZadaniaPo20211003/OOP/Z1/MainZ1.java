package ZadaniaPo20211003.OOP.Z1;

public class MainZ1 {

    public static void main(String[] args) {

       Point2D point2d = new Point2D();
        //Point2D point2d = new Point2D(7,8);

        float[] tbl = point2d.getXY();

        for (float t : tbl) {
            System.out.print(t + "  ");
        }

        System.out.println();

        point2d.setXY(point2d.setX(2), point2d.setY(3));
        tbl = point2d.getXY();

        for (float t : tbl) {
            System.out.print(t + "  ");
        }


        //System.out.println(point2d.toString()); skracamy
        System.out.println(point2d);
    }
}
