package z20211009.StudentComparabledvol2;

import java.util.Arrays;

public class MainStudent {

    public static void main(String[] args) {

        Student s1=new Student("imie1","nazwisko1", 34);
        Student s2=new Student("imie2","nazwisko2", 4);
        Student s3=new Student("imie3","nazwisko3", 27);
        Student s4=new Student("imie4","nazwisko4", 100);

        Student[] students={s1,s2,s3,s4};

        for (Student s: students
        ) {
            System.out.println(" Imie: " + s.imie + " Nazwisko: " +s.nazwisko + " nr albumu " + s.nrAlbumu);
        }

        Arrays.sort(students);

        for (Student s: students
             ) {
            System.out.println(" Imie: " + s.imie + " Nazwisko: " +s.nazwisko + " nr albumu " + s.nrAlbumu);
        }



    }

}
