package ZadaniaPo20211003.OOP.Z4;

class Square extends Rectangle {

     Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
        super.setWidth(size);
        super.setLength(size);
    }


    @Override
    public String toString() {
        return "Square of " + length + " -> " + super.toString();
    }




}
