package ZadaniaPo20211003.OOP.Z1_2D3D;

public class MainZ1 {

    public static void main(String[] args) {

       Point2D point2d = new Point2D();
      Point3D point3d=new Point3D();

        float[] tbl = point2d.getXY();

        for (float t : tbl) {
            System.out.print(t + "  ");
        }

        System.out.println("settery");

        point2d.setXY(point2d.setX(2), point2d.setY(3));
        tbl = point2d.getXY();

        for (float t : tbl) {
            System.out.print(t + "  ");
        }

        //System.out.println(point2d.toString()); skracamy
        System.out.println(point2d);

        System.out.println("3D");
        point3d.setXYZ(point2d,4);

        float[] tbl2;
        tbl2= point3d.getXYZ();

        for (float t : tbl2) {
            System.out.print(t + "  ");
        }

        System.out.println(point3d);
    }
}
