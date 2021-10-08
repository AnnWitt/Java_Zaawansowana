package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public class Main {
    public static void main(String[] args) {
        Zajezdnie z1 = new ZajezdniaAutobusowa(NazwyZajezdni.ZAJEZDNIA1, TypyPojazdow.AUTOBUS);
        Zajezdnie z2 = new ZajezdniaTramwajowa(NazwyZajezdni.ZAJEZDNIA2, TypyPojazdow.TRAMWAJ);

        Pojazdy p1 = new Autobus(1, 90, TypyPojazdow.AUTOBUS, 10.5, z1);
        Pojazdy p2 = new Autobus(2, 80, TypyPojazdow.AUTOBUS, 19.5, z1);
        Pojazdy p3 = new Tramwaj(3, 40, TypyPojazdow.TRAMWAJ, z2, IleWagonow.JEDEN);
        Pojazdy p4 = new Tramwaj(4, 42, TypyPojazdow.TRAMWAJ, z2, IleWagonow.DWA);
        Pojazdy p5 = new Tramwaj(5, 30, TypyPojazdow.TRAMWAJ, z2, IleWagonow.TRZY);


        Zajezdnie[] zajezdnie = {z1, z2};
        Pojazdy[] pojazdy = {p1, p2, p3, p4, p5};

        int z = 0;
        int p = 0;

        double zuzycie=0;
        for (int i=0; i< pojazdy.length;i++) {
            if (pojazdy[i] instanceof Autobus) {
                zuzycie=zuzycie+ ((Autobus) pojazdy[i]).zuzyciePaliwa;
            }
        }

        int ileWagonowOgolem=0;
        for (int i=0; i< pojazdy.length;i++) {
            if (pojazdy[i] instanceof Tramwaj) {
               // ileWagonowOgolem=ileWagonowOgolem+ (((Tramwaj) pojazdy[i]).ileWagonow);
                ileWagonowOgolem=ileWagonowOgolem+ (((Tramwaj) pojazdy[i]).ileWagonow.getLiczbaWagonow());
            }
        }


        while (z < zajezdnie.length) {
            StringBuilder stringBuilder1=new StringBuilder();
            stringBuilder1.append(zajezdnie[z].getNazwaZajezdni() + " |  " + zajezdnie[z].getTypyPojazdow() + " ");
           if (zajezdnie[z] instanceof ZajezdniaTramwajowa) {
               stringBuilder1.append(" | Ogólna liczba wagonów: " + ileWagonowOgolem);
           }
            if (zajezdnie[z] instanceof ZajezdniaAutobusowa) {
                stringBuilder1.append(" | Sumaryczne zużycie paliwa pojazdów: " + zuzycie);
            }


            while (p < pojazdy.length) {
                StringBuilder stringBuilder2 = new StringBuilder();
                if (pojazdy[p].zajezdnie.getNazwaZajezdni() == zajezdnie[z].getNazwaZajezdni()) {
                    stringBuilder2.append(" | numer porządkowy pojazdu -> " + pojazdy[p].getLp() + " | typ pojazdu " + pojazdy[p].getTypPojazdu()+" | max speed " +
                            pojazdy[p].getMaxSpeed() + " km/h ");

                    if (pojazdy[p] instanceof Tramwaj) {
                        ileWagonowOgolem=ileWagonowOgolem+ ((Tramwaj) pojazdy[p]).ileWagonow.getLiczbaWagonow();
                        stringBuilder2.append(" |  liczba wagonów " + ((Tramwaj) pojazdy[p]).ileWagonow);
                    }

                    if (pojazdy[p] instanceof Autobus) {
                        stringBuilder2.append(" | Zużycie paliwa pojazdu " + ((Autobus) pojazdy[p]).zuzyciePaliwa);
                    }

                    System.out.print(stringBuilder1);
                    System.out.println(stringBuilder2);
                }
                p++;
            }
           // stringBuilder1.append("Ogółem wagonów w zajezdni: " + ileWagonowOgolem);
            //System.out.println(stringBuilder1);
            p = 0;
            z++;
        }


    }
}
