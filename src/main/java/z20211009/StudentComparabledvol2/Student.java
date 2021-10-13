package z20211009.StudentComparabledvol2;

public class Student implements Comparable {
    String imie;
    String nazwisko;
    int nrAlbumu;

    public Student(String imie, String nazwisko, int nrAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrAlbumu = nrAlbumu;
    }


    @Override
    public int compareTo(Object o) {
        Student st=(Student) o;
        //return Integer.compare(this.nrAlbumu,st.nrAlbumu); //rosnaco
        return Integer.compare(st.nrAlbumu,this.nrAlbumu); //malejaco
    }
}
