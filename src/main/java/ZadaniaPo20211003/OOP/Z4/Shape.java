package ZadaniaPo20211003.OOP.Z4;

abstract class Shape {
    protected String color;
    protected boolean isFilled;

    Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    //abstrakcyjne nie maja cial
    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        if (isFilled == true) {
            return "Shape with color of " + color + '\'' +
                    " filled";
        } else {
            return "Shape with color of " + color + '\'' +
                    " notfilled";
        }
    }

    //------------------------

}
