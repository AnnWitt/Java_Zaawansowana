package z20211009.Zadanie3Pokarm;

 class Weganin implements Jedzacy {
     int ilePosilkowZm = 0;
     int ileGranowZm = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        StringBuilder stringBuilder = new StringBuilder("Weganin: ");
        switch (pokarm.getTypPokarmu()) {
                case MIESO: {
                    stringBuilder.append("Nie zje mięsa");
                    break;
                }
                case OWOCE: {
                    stringBuilder.append("Zje owoce");
                    break;
                }
                case NABIAL: {
                    stringBuilder.append("Nie zje nabiału");
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
