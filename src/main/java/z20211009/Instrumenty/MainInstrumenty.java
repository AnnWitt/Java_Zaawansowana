package z20211009.Instrumenty;

 class MainInstrumenty {

    public static void main(String[] args) {

        Pianino p1=new Pianino();
        Gitara g1=new Gitara();
        Beben b1=new Beben();

        b1.graj();
        g1.graj();
        p1.graj();
        b1.test();
        g1.test();
        p1.test();


    }
}
