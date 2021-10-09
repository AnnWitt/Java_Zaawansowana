package z20211009.DzwoniTelefon;

import java.util.Random;

class Telefon implements Dzwoni {

    String numerTelefonu = null;
    int lacznyCzasRozmow = 0;

    @Override
    public void Zadzwon(String numer) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int losowanie = (int) (random.nextDouble() * 10);
        if (losowanie == 5) {
            stringBuilder.append("Nie dodzwoniłeś się. ");
        } else {
            stringBuilder.append("Doodzwoniłeś się. ");
            losowanie = random.nextInt(60) + 1;
            stringBuilder.append(" | Czas rozmowy " + losowanie + " minut");
            lacznyCzasRozmow = lacznyCzasRozmow + losowanie;
        }
        System.out.println(stringBuilder);
        //System.out.println(stringBuilder.toString()); tu zbedne ale moze byc potrzebny
    }

    //m.add(generator.nextDouble()*10);
    @Override
    public void ZadzwonNaNrAlarmowy(String numer) {

    }
}
