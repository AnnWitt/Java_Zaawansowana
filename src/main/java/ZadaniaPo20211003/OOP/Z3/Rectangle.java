package ZadaniaPo20211003.OOP.Z3;

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

    double getArea() {
        return (double) (this.width * this.length);
    }

    double getPerimeter() {
        return (double) ((2 * this.length) + (2 * this.width));
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width +
                " and length " + length +
                " which is a subclass of " + super.toString();
    }

    //-------------------------
    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }
}
