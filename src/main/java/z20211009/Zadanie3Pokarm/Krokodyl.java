package z20211009.Zadanie3Pokarm;

 class Krokodyl implements Jedzacy {
     int ilePosilkowZm = 0;
     int ileGranowZm = 0;

     @Override
     public void jedz(Pokarm pokarm) {
         StringBuilder stringBuilder = new StringBuilder("Krokodyl: ");
         switch (pokarm.getTypPokarmu()) {
             case MIESO: {
                 stringBuilder.append("Zje mięso");
                 break;
             }
             case OWOCE: {
                 stringBuilder.append("Zje owoce ale niechętnie :)");
                 break;
             }
             case NABIAL: {
                 stringBuilder.append("Zje nabiał");
                 break;
             }
         }
         System.out.println(stringBuilder);
     }

     @Override
     public int ilePosilkowZjedzone() {
         return ilePosilkowZm;
     }

     @Override
     public int ileGramowZjedzone() {
         return ileGranowZm;
     }

     public int getIlePosilkowZm() {
         return ilePosilkowZm;
     }

     public int getIleGranowZm() {
         return ileGranowZm;
     }
 }