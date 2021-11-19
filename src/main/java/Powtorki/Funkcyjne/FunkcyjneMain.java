package Powtorki.Funkcyjne;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

 class FunkcyjneMain {
     public static void main(String[] args) throws Exception {

     Runnable run1=()-> System.out.println("Runnable dupa");
        run1.run();

        Callable cal1=()-> "Callable dupa";
        System.out.println(cal1.call());

        InterfLiczba i=(liczba)-> liczba*10;

        Executor ex1=(ex)-> System.out.println("Executor dupa");
        ex1.execute(run1);

        System.out.println(i.liczbaInt(4));

        Supplier<Integer> supplierINT=() -> 10;
        System.out.println(supplierINT.get());

        Function<Integer,Integer> funInt=(l1) -> l1*20; //przyjmuje integer zwraca integer
         System.out.println(funInt.apply(3));

         Consumer<Integer> consumerInt=(liczba)-> System.out.println(liczba*2);
         consumerInt.accept(3);

         Predicate<Integer> predicateInt=(liczba)-> liczba==10;
         System.out.println(predicateInt.test(10));
         System.out.println(predicateInt.test(102));

     }
}
