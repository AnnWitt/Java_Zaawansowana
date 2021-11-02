package ZadaniaPo20211003.OOP.Z3;

import java.sql.SQLOutput;

 class Main3Z {
    public static void main(String[] args) {

        Shape shape=new Shape("red",false);

        System.out.println(new Circle());
        System.out.println(new Circle("blue",true,20));
        System.out.println(new Circle("blue",true,20).getArea());
        System.out.println(new Rectangle());
        System.out.println(new Rectangle("yellow", true,20,30));
        System.out.println(new Rectangle("yellow", true,20,30).getArea());
        System.out.println(new Square());
        System.out.println(new Square("green",false,40));
        System.out.println(new Square("green",false,40).getArea());






    }
}
