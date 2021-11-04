package ZadaniaPo20211003.OOP.Z7;

public class Z7Main {

    public static void main(String[] args) {
        Circle circle = new Circle(20);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        ResizableCircle resizeCircle=new ResizableCircle();
        resizeCircle.resize(10);


    }
}
