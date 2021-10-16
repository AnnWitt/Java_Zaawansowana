package z20211009.Kolekcje.Sety.Z2Figura;

import java.util.*;

public class Main {

    //kolekcje 3 do domu

    public static void main(String[] args) {

        Figura f1 = new Kwadrat(4);
        Figura f2 = new Kwadrat(14);
        Figura f3 = new Kwadrat(10);
        Figura f4 = new Prostokat(20);
        Figura f5 = new Prostokat(15);
        Figura f6 = new Prostokat(9);

        System.out.println("Figura hashset");
        Set<Figura> figuraHashSet = new HashSet<>();
        figuraHashSet.add(f1);
        figuraHashSet.add(f2);
        figuraHashSet.add(f3);
        figuraHashSet.add(f4);
        figuraHashSet.add(f5);
        figuraHashSet.add(f6);
        System.out.println(figuraHashSet);

        System.out.println("figuraLinkedHashSet");
        Set<Figura> figuraLinkedHashSet = new LinkedHashSet<>();
        figuraLinkedHashSet.add(f1);
        figuraLinkedHashSet.add(f2);
        figuraLinkedHashSet.add(f3);
        figuraLinkedHashSet.add(f4);
        figuraLinkedHashSet.add(f5);
        figuraLinkedHashSet.add(f6);

        System.out.println(figuraLinkedHashSet);


        System.out.println("figuraTreeSet");
        Set<Figura> figuraTreeSet = new TreeSet<>();
        //figuraTreeSet.addAll(figuraTreeSet.Fig)
        figuraTreeSet.addAll(List.of(f1,f2,f3,f4,f5,f6));
/*        figuraTreeSet.add(f1);
        figuraTreeSet.add(f2);
        figuraTreeSet.add(f3);
        figuraTreeSet.add(f4);
        figuraTreeSet.add(f5);
        figuraTreeSet.add(f6);*/

        //Samo sortowanie spisz od trenera bo zjebane

        System.out.println(figuraHashSet);

        //f1.compareTo(f4);


    }
}
