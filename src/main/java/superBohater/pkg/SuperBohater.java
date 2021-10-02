package superBohater.pkg;

public class SuperBohater {
    public static void main(String[] args) {
        SuperBohaterSrc bohater1= new SuperBohaterSrc("Bohater 1"," moc 1");
        SuperBohaterSrc bohater2= new SuperBohaterSrc("Bohater 2"," moc 2");
        SuperBohaterSrc bohater3= new SuperBohaterSrc("Bohater 3","moc 3");

        //4a
        System.out.print("bohater1=bohater2 | ");
        System.out.println(bohater1=bohater2);

        System.out.print("bohater1=null | ");
        System.out.println(bohater1=null);

        System.out.print("bohater2==null | ");
        System.out.println(bohater2==null);

        //4b
        System.out.print("bohater1=null | ");
        System.out.println(bohater1=null);

        System.out.print("bohater2 = bohater1 | ");
        System.out.println(bohater2 = bohater1);

        System.out.print("bohater1 = bohater3 | ");
        System.out.println(bohater1 = bohater3);

        System.out.println("bohater1  | " + bohater1);
        System.out.println("bohater2  | " + bohater2);
        System.out.println("bohater3  | " + bohater3);

        //5*
        System.out.print("bohater1 equals bohater 2 | ");
        System.out.println(bohater1.equals(bohater2));
        System.out.print("bohater1 equals bohater 3 | ");
        System.out.println(bohater1.equals(bohater3));

        System.out.print("bohater1 == bohater 2 | ");
        System.out.println(bohater1==bohater2);
        System.out.print("bohater1 == bohater 3 | ");
        System.out.println(bohater1==bohater3);


    }

}
