package ZadaniaPo20211003.OOP.Z7;

class ResizableCircle implements Resizable {

    public ResizableCircle() {
    }

    @Override
    public void resize(int percent) {
        System.out.println("Wyjściowy promień koła " + Circle.radius);
        System.out.println("Promień zmniejszony o " + percent + " % = " + (Circle.radius - ((Circle.radius * ((double) percent) / 100))));
    }
}
