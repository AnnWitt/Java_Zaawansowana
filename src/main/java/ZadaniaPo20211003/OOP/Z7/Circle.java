package ZadaniaPo20211003.OOP.Z7;

class Circle implements GeometricObject {
   static double radius;

    public Circle() {

    }

    @Override
    public double getPerimeter() {
        System.out.println("getPerimeter");
        return (Math.PI * 2 * this.radius);
    }

    @Override
    public double getArea() {
        System.out.println("get area");
        return (Math.PI * Math.pow(this.radius, 2));
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

     void setRadius(double radius) {
        this.radius = radius;
    }
}
