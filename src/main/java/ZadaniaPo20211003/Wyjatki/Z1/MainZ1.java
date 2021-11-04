package ZadaniaPo20211003.Wyjatki.Z1;


public class MainZ1 {
    public static void main(String[] args) {

        divide(3,2);
        divide(3,7);
        divide(0,2);
        divide(3,0);
        divide(3,2);
    }

    static void divide (double x,double y) throws CannotDivideByZeroException {
            double wynik=x/y;
           try {
               if (y == 0) {
                   throw new CannotDivideByZeroException();
               } else {
                   System.out.println(x + "/" + y + " = "+ wynik);
               }

           } catch (CannotDivideByZeroException e) {
               System.out.println(e.getMessage());
               System.out.println("dupa");
           }

    }

}
