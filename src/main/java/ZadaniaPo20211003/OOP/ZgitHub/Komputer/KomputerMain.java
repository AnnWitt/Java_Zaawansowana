package ZadaniaPo20211003.OOP.ZgitHub.Komputer;

 class KomputerMain {
     public static void main(String[] args) {
         Komputer device1=new Komputer(1,"producent1",TypProcesora.WIELORDZENIOWY);
         Komputer device2=new Komputer(2,"producent2",TypProcesora.JEDNORDZENIOWY);
         Komputer device3=new Komputer(1,"producent4",TypProcesora.WIELORDZENIOWY);
         Laptop device4=new Laptop(4,"producent3",TypProcesora.JEDNORDZENIOWY,11.1,false);
         Laptop device5=new Laptop(3,"producent1",TypProcesora.WIELORDZENIOWY,17.1,true);
         Laptop device6=new Laptop(10,"producent2",TypProcesora.WIELORDZENIOWY,15.3,false);
         Laptop device7=new Laptop(5,"producent4",TypProcesora.JEDNORDZENIOWY,15.1,true);

         Komputer[] komputers={device1,device2,device3,device4,device5,device6,device7};

         int licznik=0;


         
        while (licznik< komputers.length){

            if (komputers[licznik] instanceof Laptop) {
                System.out.println(licznik + " | " +komputers[licznik].potrzebnaMoc+ " " + komputers[licznik].getProducent()+" "
                        +komputers[licznik].typProcesora+ " " + ((Laptop) komputers[licznik]).wielkoscMatrycy);
            } else {
                System.out.println(licznik + " | " +komputers[licznik].potrzebnaMoc+ " " + komputers[licznik].getProducent()+" "
                        +komputers[licznik].typProcesora);
            }
            licznik++;

        }

        licznik=0;

         System.out.println("opcja ze stringbuilderem");

         while (licznik<komputers.length) {
             StringBuilder stringBuilder=new StringBuilder();
             stringBuilder.append(licznik + " || "+komputers[licznik].potrzebnaMoc + " " + komputers[licznik].getProducent() + " " + komputers[licznik].typProcesora);
             if (komputers[licznik] instanceof Laptop) {
                 stringBuilder.append(" " + ((Laptop) komputers[licznik]).wielkoscMatrycy);
             }
             System.out.println(stringBuilder);
             licznik++;
         }

     }
}

