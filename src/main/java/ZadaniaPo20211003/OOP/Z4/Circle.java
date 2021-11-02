package ZadaniaPo20211003.OOP.Z4;

class Circle extends Shape {
    double radius;

    Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }


    @Override
    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " +
                radius +
                " which is a subclass of " + super.toString();
    }

}
