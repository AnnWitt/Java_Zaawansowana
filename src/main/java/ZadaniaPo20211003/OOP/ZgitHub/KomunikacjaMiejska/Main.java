package ZadaniaPo20211003.OOP.ZgitHub.KomunikacjaMiejska;

public class Main {
    public static void main(String[] args) {
        Zajezdnie z1=new ZajezdniaAutobusowa(NazwyZajezdni.ZAJEZDNIA1,TypyPojazdow.AUTOBUS,30.2);
        Zajezdnie z2=new ZajezdniaTramwajowa(NazwyZajezdni.ZAJEZDNIA2,TypyPojazdow.TRAMWAJ,10);

        Pojazdy p1=new Autobus(1,90,TypyPojazdow.AUTOBUS,10.5,z1);
        Pojazdy p2=new Autobus(2,80,TypyPojazdow.AUTOBUS,9.5,z1);
        Pojazdy p3=new Tramwaj(3,40,TypyPojazdow.TRAMWAJ,z2,1);
        Pojazdy p4=new Tramwaj(4,42,TypyPojazdow.TRAMWAJ,z2,2);
        Pojazdy p5=new Tramwaj(5,30,TypyPojazdow.TRAMWAJ,z2,3);


        Zajezdnie[] zajezdnie={z1,z2};
        Pojazdy[] pojazdy={p1,p2,p3,p4,p5};

        int z=0;
        int p=0;

        while (z<zajezdnie.length) {

            System.out.println(zajezdnie[z].getNazwaZajezdni());
                while (p<pojazdy.length) {

                    if (pojazdy[p].zajezdnie.getNazwaZajezdni()==zajezdnie[z].getNazwaZajezdni()){
                        System.out.println(pojazdy[p].getTypPojazdu());
                    }
                    p++;
                }
            p=0;
            z++;
        }




    }
}
