package z20211009.Comparables.Powtorka;

import java.util.Comparator;

public class MainPowtorka {
    public static void main(String[] args) {

        System.out.println("Comparable");
        ComparablePowtorka comparablePowtorka1=new ComparablePowtorka();
        System.out.println(comparablePowtorka1.compareTo(7));
        System.out.println(comparablePowtorka1.compareTo(2));
        System.out.println(comparablePowtorka1.compareTo(5));

        System.out.println("Comparator");
        Comparator<Integer> integerComparator=Comparator.naturalOrder();
        System.out.println(integerComparator.compare(3, 7));

        System.out.println("Comparable z lambdą");
        Comparable<Integer> comparableLambda=(liczba) -> liczba.compareTo(comparablePowtorka1.getWartoscBazowa());
        System.out.println(comparableLambda.compareTo(1));

        System.out.println("Comparator z lambda");
        Comparator<Integer> comparatorLamdba=(liczba1,liczba2)->liczba1.compareTo(liczba2);
        Comparator<Integer> comparatorLamdba2= Integer::compareTo;

        System.out.println(comparatorLamdba.compare(3, 3));
        System.out.println(comparatorLamdba2.compare(3, 8));
        System.out.println(comparatorLamdba2.compare(3, 1));

    }
}
