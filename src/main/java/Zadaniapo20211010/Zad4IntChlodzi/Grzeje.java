package Zadaniapo20211010.Zad4IntChlodzi;

public interface Grzeje {

    //double temp=0;

    double pobierzTemp(double temp);
    void zwiekszTemp(double zwieksz);
    default void wyswietlTempWpomieszczeniu(){
    };
}
