package z20211009.Student;

import java.util.Arrays;

public class MainStudent {
    public static void main(String[] args) {
        Student s1=new Student("Imie1","Nazwisko1",2);
        Student s2=new Student("Imie2","Nazwisko2",12);
        Student s3=new Student("Imie3","Nazwisko3",5);

        Student[] students={s1,s2,s3};

        System.out.println("przed sortowaniem");
        for (Student s: students
        ) {
            System.out.println(s.numerAlbumu + " " + s.imie + " " + s.nazwisko);
        }
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("po sortowaniu");
        for (Student s: students
             ) {
            System.out.println(s.numerAlbumu + " " + s.imie + " " + s.nazwisko);
        }



    }

}
