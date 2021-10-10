package z20211009.Generyczne.MojaLista;

import java.util.Arrays;

public class MojaLista<E> { //podajac typ podajac jaki rodzaj elemntu bedzie
    //dlatego E zamiast T
    private int n;
    protected E[] tableTypElementow;

    protected MojaLista(int n) {
        this.n = n;
        this.tableTypElementow = (E[]) new Object[n]; //tu mozemy po prostu obiekt i bedzie
        //wiedzial, ze to n. Tabliza obiektów zrzutowana na E. Zrzutujemy na E tablice obiektow
        //object rzutujemy na n. To, że unchecked to ok, moze nie zadzialac ale tu tworzymy
        //pusta tablice od nowa wiec zadziala
    }
/*
    protected E getElement(int n) { //przyklad bo nmusi byc <=this.n bo user moze
        //wprowadzic 500 podczas gdy my mamy max 5
        //to jest niekompletne
        return tableTypElementow[n]; //tu zasadniczo zrobilam metode
    }*/


    //metode    4.Dodaj metodę zawiera(E element):boolean
//1.Zwróci trueelement jest equalswzględem innego elementu w zbiorze
    protected boolean zawiera(E n) {
        for (int i = 0; i < tableTypElementow.length; i++) {
            if (n.equals(tableTypElementow[i])) {
                return true;
            }
        }
        return false;
    }

    //5.Dodaj metodę rozmiar():int
    //6.* Niech rozmiar() zwróci zajętą ilość elementów

    protected int rozmiar() {
        // (!name.equals(other.name))
        n = tableTypElementow.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if ((tableTypElementow[i]) != null) {
                counter++;
            }
            ;
        }
        System.out.println("ogółem elementów " + n + " niepustych " + counter);
        return counter;
    }

    /*7.Dodaj metodę dodaj(E element):boolean
    1.Element zostaje dodany w wolne miejsce po ostatnim zajętymelemencie
    2.Zwraca truejeśli udało się dodać i falsejeśli zabrakło miejsca*/
    protected boolean dodaj(E element) {
        //int n = tableTypElementow.length; //niepotrzebne
        for (int i = 0; i < this.n; i++) {
            if (tableTypElementow[i] == null) {
                tableTypElementow[i] = element;
            }
            return true;
        }

/*        for(int i=1;i<n;i++) {
            System.out.println(tableTypElementow[i]);
        }*/
        return false;

    }

    @Override
    public String toString() {
        return "MojaLista{" +
                "tableTypElementow=" + Arrays.toString(tableTypElementow) +
                '}';
    }
}



