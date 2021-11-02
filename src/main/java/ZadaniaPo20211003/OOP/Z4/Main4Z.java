package ZadaniaPo20211003.OOP.Z4;


class Main4Z {
   public static void main(String[] args) {

        Shape[] shapes={new Circle("blue",true,20),
                new Rectangle("yellow", true,20,30),
                new Square("green",false,40)
        };

       for (Shape licznikShapes: shapes) {
           System.out.println(licznikShapes);
           System.out.println(licznikShapes.getArea());
           System.out.println(licznikShapes.getPerimeter());
           System.out.println("------------------------");


       }





   }
}
