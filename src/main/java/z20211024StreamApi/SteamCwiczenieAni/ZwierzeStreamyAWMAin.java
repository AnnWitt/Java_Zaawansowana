package z20211024StreamApi.SteamCwiczenieAni;

import java.util.Arrays;
import java.util.List;

public class ZwierzeStreamyAWMAin {

    public static void main(String[] args) {

        Body b1 = new Body(BodyType.FUTRO, "Czarny");
        Body b2 = new Body(BodyType.FUTRO, "Biały");
        Body b3 = new Body(BodyType.LUSKI, "Czerwony");
        Body b4 = new Body(BodyType.LUSKI, "Czarny");


        List<Body> bodyList = Arrays.asList(b1, b2, b3, b4);

        Zwierze z1 = new Zwierze(ZwierzeGatunek.KOT, bodyList, "Imie1");
        Zwierze z2 = new Zwierze(ZwierzeGatunek.PIES, bodyList, "Imie2");
        Zwierze z3 = new Zwierze(ZwierzeGatunek.RYBKA, bodyList, "Imie3");
        Zwierze z4 = new Zwierze(ZwierzeGatunek.PAJAK, bodyList, "Imie4");
        Zwierze z5 = new Zwierze(ZwierzeGatunek.RYBKA, bodyList, "Imie5");

        List<Zwierze> zwierzeList = Arrays.asList(z1, z2, z3, z4, z5);

        Opiekun o1 = new Opiekun("ImieOpiekuna1", 30, zwierzeList);
        Opiekun o2 = new Opiekun("ImieOpiekuna2", 36, zwierzeList);
        Opiekun o3 = new Opiekun("ImieOpiekuna3", 40, zwierzeList);

        List<Opiekun> opiekunlist = Arrays.asList(o1, o2, o3);


        zwierzeList.stream()
                .map(s->s.Imie)
                .forEach(System.out::println);
        System.out.println("--------------------------");
        zwierzeList.stream()
                .filter(d->d.gatunek==ZwierzeGatunek.RYBKA)
                .map(s->s.Imie)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        zwierzeList.stream()
                .flatMap(a->a.bodies.stream())
                .filter(b->b.kolor=="Czarny")
                .map(d->d.bodyType)
                .forEach(System.out::println);

    }

}
