package z20211009.Generyczne.WAZNEParaCwiczenieGeneryki;


import java.util.Random;

public class MainParaPorownaniePodejsc {

    public static void main(String[] args) {
//-----------------rzutowaniem-----------------------------------------------
        Czlowiek monika = new Czlowiek("Monika", "NazwiskoMoniki", "kobieta");
        Czlowiek tomasz = new Czlowiek("Tomasz", "NazwiskoTomasza", "mezczyzna");
        System.out.println("Rzutowaniem");
        ParaRzutowaniem paraRzutowaniem = new ParaRzutowaniem(monika.costam(), tomasz.imie); //tomasz da adres fizyczny. Dostęp tylko do metod "człowiek". Metody z
        ParaRzutowaniem paraRzutowaniem2 = new ParaRzutowaniem(monika, tomasz); //tomasz da adres fizyczny. Dostęp tylko do metod "człowiek". Metody z
        // "para" nie użyjemy na obiekcie człowiek
        System.out.println(paraRzutowaniem);
        System.out.println(paraRzutowaniem2);

        //monika.costam()//bez dostepu do Pary z rzutowaniem
        //paraRzutowaniem.getLewy(). //brak dostepu do metody z klasy czlowiek
        //rzutowaniem obiekt typu para zrzutowany na człowieka.

        Czlowiek cz1 = (Czlowiek)paraRzutowaniem2.getLewyRzut(); //na paraRzutowaniem nie dzialalo bo monika.costam() zwradalo string
        int liczba = (int) 3.4;
        Czlowiek cz2 = (Czlowiek)paraRzutowaniem2.getPrawyRzut();

        System.out.println("Zapis " + ((Czlowiek) paraRzutowaniem2.getPrawyRzut()).imie);

//-----------------generyki-----------------------------------------------
        System.out.println("Generyki");
        Czlowiek karol = new Czlowiek("Karol", "NazwiskoKarola", "mezczyzna");
        Czlowiek alicja = new Czlowiek("Alicja", "NazwiskoAlicji", "kobieta");

        ParaGeneryk<Czlowiek> paraGeneryk = new ParaGeneryk<Czlowiek>(karol, alicja);
        Random random = new Random();
        System.out.println(paraGeneryk);
        System.out.println(paraGeneryk.getPrawyGen().imie);
        System.out.println(paraGeneryk.getLewyGen().imie);
        System.out.println(paraGeneryk.getLewyGen().costam()); //dostajemy z pary dostęp do metody klasy człowiek

        System.out.println("Porownanie");
        System.out.println("Zapis Rzutowaniem " + ((Czlowiek) paraRzutowaniem2.getPrawyRzut()).imie);
        System.out.println("Zapis Generykiem " + paraGeneryk.getPrawyGen().imie);
        System.out.println("Zapis Rzutowaniem " + ((Czlowiek) paraRzutowaniem2.getLewyRzut()).costam());
        System.out.println("Zapis Generykiem " + paraGeneryk.getLewyGen().costam());


    }

}


