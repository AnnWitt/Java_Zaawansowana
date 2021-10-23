package z20211023.LAmbdy.StudentSortowanyLambdami;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainST {

    public static void main(String[] args) {


        Student s1 = new Student("imiest1", "Naziwsko1", 3.6);
        Student s2 = new Student("imiest2", "Naziwsko2222", 4.6);
        Student s3 = new Student("imiest3", "Naziwsko33", 5.6);
        Student s4 = new Student("imiest4", "Nazi4", 3.0);
        Student s5 = new Student("imiest5", "Naziwsk5", 4.2);
        List<Student> ls = new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        ls.add(s5);

        System.out.println(ls);
        // NEW COMPARATOR, nowy interfejs generyczny i podpowiada anoniowa klase
        // implementujaca (to z override
        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(Double.compare(o1.getAverage(), o2.getAverage()));
                //- bo sortujemy malejaco
            }
        });

        //-----------lambda
        System.out.println("Lambda");
/*        Collections.sort(ls, (Student o1, Student o2)->
                Double.compare(o1.getAverage(),o2.getAverage()));*/
        Collections.sort(ls, Comparator.comparingDouble(Student::getAverage));
        //uzycie referencji do metody
        Collections.sort(ls, Comparator.comparingDouble(o -> o.getAverage())); //alternatywa
        //dla kazdego o z o pobierz Average i zwroc, jak for ale jest w sorcie
        //wywolanie na obiekcie, lambdzie
        System.out.println(ls);
        System.out.println("lllllamda");

        System.out.println(ls);
        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
            }
        });
        System.out.println(ls);

        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSurname().compareTo(o2.getSurname()); //tu na obiekcie
            }
        });
        System.out.println(ls);
        //lambda razy dwa w zasadzie
        Collections.sort(ls, Comparator.comparingInt(o -> o.getSurname().length()));
        System.out.println(ls);
    }

}

