package z20211009.Kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        System.out.println(strings);
        strings.add("x");
        System.out.println(strings);
        strings.add("y");
        strings.add("z");
        strings.add("y");
        strings.add("x");
        strings2 = new ArrayList<>(strings); //z = by bylo odniesienie do tego
        //samego obiektu
        System.out.println(strings);
        strings.set(1, "Punkt2");
        System.out.println(strings);
        System.out.println("pierwsza pozycja x " + strings.indexOf("x"));
        System.out.println("ostatnia pozycja x " + strings.lastIndexOf("x"));
        strings.remove("Punkt2");
        System.out.println(strings);
        strings.remove(0);
        System.out.println(strings);
        System.out.println(strings2); //to by przy = bylo takie same jak strings
        //pkt 2

        wyswietlDuplikaty(strings2);
        usunDupl(strings2);

/*

        for (int i = 1; i < strings2.size(); i++) {
            for (int j = 0; j <=i ; j++) {
                if (strings2.indexOf(i) == strings2.lastIndexOf(j)) {
                    System.out.println(strings2.indexOf(j));
                }
            }
*/

       /*     3.Działanie metody indexOf(Object o)
            4.Działanie metody lastIndexOf(Object o)*/


    }

    public static void wyswietlDuplikaty(List<String> strings2) {
        System.out.println("pokaz duplikaty");
        List<String> duplicates = new ArrayList<>();
        for (String s : strings2)
            if (strings2.indexOf(s) != strings2.lastIndexOf(s)) {
                if (!duplicates.contains(s)) {
                    duplicates.add(s);
                }
            } //jeszcze ywswiatlenie
    }


    private static void usunDupl(List<String> string2) {
        Iterator<String> iterator = string2.iterator();
        //for each wykorzystuje schowany iterator
        while (iterator.hasNext()) {
            String omawiany = iterator.next();
            ;
            if (string2.indexOf(omawiany) != string2.lastIndexOf(omawiany)) {
                iterator.remove();
            }

        }


/*        for (String s: string2
             ) {
            while (string2.indexOf(s)!= string2.lastIndexOf(s)) {
                string2.remove(string2.lastIndexOf(s));
            }

        }*/
    }
}