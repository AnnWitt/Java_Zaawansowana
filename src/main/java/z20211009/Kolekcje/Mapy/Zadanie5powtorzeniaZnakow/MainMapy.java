package z20211009.Kolekcje.Mapy.Zadanie5powtorzeniaZnakow;

/*1.Napisz program do zliczania wystąpień słów w tekście, w tym celu:
        2.Dodaj metodę zliczWystapieniaSlow(String tekst):Map<String, Integer>
1.Metoda pobiera tekst
        2.Następnie rozdziela go na wystąpienia słów
        3.Tworzy mapę ‚słowo’ ilość wystąpień
        4.Iteruje po wszystkich słowach w zadanym tekscie
        5.Dla każdego słowa wyciąga ilość zliczonych słów z mapy i dorzuca
        kolejne wystąpienie
        3.Program wyświetla wszystkie odkryte słowa wraz z ich liczebnością
        4.* Program wyświetla wszystkie odkryte słowa wraz z ich liczebnościąw
        kolejności od
        najczęściej występującego do najrzadziej występującego*/


import java.util.Scanner;

public class MainMapy {
    public static void main(String[] args) {
        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Wprowadz tekst");
        //String tekst=scanner.nextLine();
        String tekst="dddd-wwww!777,777,777";
        System.out.println(MapyMetody.zliczWystapieniaSlow(tekst));

        //MapyMetody.zliczWystapieniaSlow(tekst).entrySet().;
    }
///////////////////////sprawdz z gItem

   // https://github.com/chodek/javagda49/blob/master/src/main/java/kolekcje/mapy/Zad5.java
}
