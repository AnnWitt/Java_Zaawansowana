package ZadaniaPo20211003.OOP.ZgitHub.Wesele;

import lombok.Data;

public enum TypZaproszenia {
    POJEDYNCZE(1),
    ZOSOBATOWARZYSZACA(2);

    private int ileOsob;

    TypZaproszenia(int i){
        this.ileOsob=i;
    }

    public int getIleOsob() {
        return ileOsob;
    }
}

