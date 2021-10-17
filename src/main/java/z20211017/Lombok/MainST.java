package z20211017.Lombok;

import java.util.*;

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

    }

}

