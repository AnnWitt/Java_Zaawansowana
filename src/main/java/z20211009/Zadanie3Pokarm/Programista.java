package z20211009.Zadanie3Pokarm;

class Programista implements Jedzacy {
    int ilePosilkowZm = 0;
    int ileGranowZm = 0;


    @Override
    public void jedz(Pokarm pokarm) {
        StringBuilder stringBuilder = new StringBuilder("Programista: ");
        switch (pokarm.getTypPokarmu()) {
            case MIESO: {
                stringBuilder.append("Zje mięso");
                this.ilePosilkowZm++;
                this.ileGranowZm += pokarm.getWaga();
                break;
            }
            case OWOCE: {
                stringBuilder.append("Zje owoce");
                this.ilePosilkowZm++;
                this.ileGranowZm += pokarm.getWaga();
                break;
            }
            case NABIAL: {
                stringBuilder.append("Zje nabiał");
                this.ilePosilkowZm++;
                this.ileGranowZm += pokarm.getWaga();
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
