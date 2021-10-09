package z20211009.DzwoniTelefon;

 class DzwoniMain {

    public static void main(String[] args) {
       Telefon tel=new Telefon();
       //tel.Zadzwon("222");

       for (int i=0; i<20;i++) {
           tel.Zadzwon("222");
       }
        System.out.println(tel.lacznyCzasRozmow);
    }

}
