package Zadaniapo20211010.Zad4IntChlodzi;

public interface Chlodzi {
    double pobierzTemp(double temp);
    void schlodz(double zimniej);
    default void wyswietlTempWpomieszczeniu(){
    };
}
