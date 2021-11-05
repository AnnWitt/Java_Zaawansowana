package z20211023_funkcyjne.LAmbdy.Przyklad.AniZabawa;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdyAniaCwiczenie {

    public static void main(String[] args) {
        IFzeStringiem zapisBezLambd = new IFzeStringiem() {
            @Override
            public String wInterfejsieFunkcyjnymBezCiala(String string) {
                return "Cokolwiek" + string;
            }
        };

        System.out.println(zapisBezLambd.wInterfejsieFunkcyjnymBezCiala("test Bez Lambd"));


        System.out.println("---------------------------------");
        IFzeStringiem zapisZLambdami = (string) -> {
            return "test z lambdami " + string;
        };

        IFzeStringiem zapisZLambdami2 = (string) -> "test z lambdami " + string;
        System.out.println(zapisZLambdami.wInterfejsieFunkcyjnymBezCiala("any"));

        System.out.println("-----------------Bez----------------");
        IFbezArgumentow bezArg = () -> System.out.println("Bez niczego");
        bezArg.Bezarg();

        System.out.println("----------int----------");
        IFzINT int1 = x -> x * 20;
        System.out.println(int1.dupa(4));

        IFzINT int2 = new IFzINT() {
            @Override
            public int dupa(int x) {
                return x * 20;
            }
        };
        System.out.println(int2.dupa(4));


        System.out.println("-----------jeszcze raz stringi-------");
        IFzeStringiem s1=new IFzeStringiem() {
            @Override
            public String wInterfejsieFunkcyjnymBezCiala(String string) {
                return string.toUpperCase(Locale.ROOT)+" " +string.toLowerCase();
            }
        };


       System.out.println(s1.wInterfejsieFunkcyjnymBezCiala("Non Lamdba String"));

        IFzeStringiem s2=(string)->string.toUpperCase(Locale.ROOT)+" "+string.toLowerCase();

        System.out.println(s2.wInterfejsieFunkcyjnymBezCiala("Lambda String"));

        System.out.println("---------------------------dwuarg------------");

        IFDwuarg dw=((string, integer) -> {
            for(int i=0;i<integer;i++) {
                System.out.println(string);
            }
            String bl="jakis bełkot";
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(bl + " ");
            stringBuilder.append(bl.toUpperCase(Locale.ROOT) + " " + integer);
            System.out.println(stringBuilder);
        });

        dw.Dwuarg("dupa",3);


        System.out.println("...............");
        IFbezArgumentow najprostszaLambda=()-> {};
        najprostszaLambda.Bezarg();
        System.out.println("...............");
        IFbezArgumentow najprostszaLambd2=()-> {
            System.out.println("ddd");
        };
        najprostszaLambd2.Bezarg();

        Supplier<String> supplier=()-> "dupa z suppliera";
        System.out.println(supplier.get());

        Function<Integer,String> fct=(integer)-> integer+" Testujemu function";

        System.out.println(fct.apply(5));




    }




    }

