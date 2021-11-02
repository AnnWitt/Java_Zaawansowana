package ZadaniaPo20211003.OOP.Z3;

class Square extends Rectangle {

     Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
        super.setWidth(size);
        super.setLength(size);
    }

     Square() {
    }

/*    void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }*/

    @Override
    public String toString() {
        return "Square of " + length + " -> " + super.toString();
    }




}
