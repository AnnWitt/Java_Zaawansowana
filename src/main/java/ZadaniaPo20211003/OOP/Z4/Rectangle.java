package ZadaniaPo20211003.OOP.Z4;

class Rectangle extends Shape {
    double width;
    double length;

    Rectangle() {
        this.width = 1;
        this.length = 4;
        this.color = "unknown";
        this.isFilled = false;
    }

    Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return this.width * this.length;
    }

    @Override
    double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width +
                " and length " + length +
                " which is a subclass of " + super.toString();
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }
}
