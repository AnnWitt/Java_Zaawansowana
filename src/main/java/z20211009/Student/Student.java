package z20211009.Student;

import z20211009.Comparables.ComparableClass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Student implements Comparable{
    String imie=null;
    String nazwisko=null;
    int numerAlbumu=0;

    public Student(String imie, String nazwisko, int numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    @Override //malejaco
    public int compareTo(Object o) {
        Student student=(Student) o; //o to object
        //o obiekt musimy zrzutowac na Studenta
        return -Integer.compare(this.numerAlbumu, student.numerAlbumu);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return numerAlbumu == student.numerAlbumu && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numerAlbumu);
    }
//    @Override - rosnaco
//    public int compareTo(Object o) {
//        Student student=(Student) o; //o to object
//        //o obiekt musimy zrzutowac na Studenta
//        return Integer.compare(this.numerAlbumu, student.numerAlbumu);
//    }


    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerAlbumu=" + numerAlbumu +
                '}';
    }
/*    ComparableClass other=(ComparableClass) o;
        return Integer.compare(this.field,other.field);*/
}
