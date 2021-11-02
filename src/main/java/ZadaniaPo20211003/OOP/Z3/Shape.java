package ZadaniaPo20211003.OOP.Z3;

class Shape {
    String color;
    boolean isFilled;

    Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        if (isFilled==true) {
            return "Shape with color of " + color + '\'' +
                    " filled";
        } else {
            return "Shape with color of " + color + '\'' +
                    " notfilled";
        }
    }

    //------------------------

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return isFilled;
    }

    void setFilled(boolean filled) {
        isFilled = filled;
    }
}
