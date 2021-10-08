package ZadaniaPo20211003.OOP.ZgitHub.Robot;

public enum RuchRobota {
    KROK_LEWA(5),
    KROK_PRAWA(5),
    RUCH_REKA_LEWA(7),
    RUCH_REKA_PRAWA(7),
    SKOK(10);

    int energia;

    RuchRobota(int energia) {
        this.energia = energia;
    }



}
