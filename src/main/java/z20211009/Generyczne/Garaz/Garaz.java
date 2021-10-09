package z20211009.Generyczne.Garaz;

public class Garaz <T>{
    private T lewySamochod;
    private T prawySamochod;

    public Garaz(T lewySamochod, T prawySamochod) {
        this.lewySamochod = lewySamochod;
        this.prawySamochod = prawySamochod;
    }

    void zaparkuj(Samochod auto) {
        //this.lewySamochod=auto;
        System.out.println(auto.model);
    }


}
