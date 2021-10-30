package z20211023_funkcyjne.LAmbdy.StudentSortowanyLambdami;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data //mozna settery bez ustawianie setterow
@RequiredArgsConstructor //musza byc finalne albo bedzie, że niezainicjowany. Ogarnia
//tylko finalne jako konstruktor
//@AllArgsConstructor //ogarnia wszystkie pola "w konstruktorze"
public class Student implements Comparable {
    //private  String name ="imie"; //to w konstruktorze nie bedzie bo ustawone.
    //jakby wartosci nie bylo to by bylo
   // private int wiek;
    private final String name2;
    private final String surname;
    private final double average;


        //return Integer.compare(this.nrAlbumu,st.nrAlbumu); //rosnaco


    @Override
    public String toString() {
        return "name2='" + name2 + '\'' +
                ", surname='" + surname + '\'' +
                ", average=" + average+'\n';
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(this.average, getAverage());
    }
}
