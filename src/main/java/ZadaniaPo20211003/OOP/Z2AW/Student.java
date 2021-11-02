package ZadaniaPo20211003.OOP.Z2AW;

class Student extends Person {
    String typStudiow;
    int rokStudiow;
    int kosztStudiow;


     Student(String name, String address, String typStudiow, int rokStudiow, int kosztStudiow) {
        super(name, address);
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    //-------------------


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typStudiow='" + typStudiow + '\'' +
                ", rokStudiow=" + rokStudiow +
                ", kosztStudiow=" + kosztStudiow +
                '}';
    }

    String getTypStudiow() {
        return typStudiow;
    }

    void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    int getRokStudiow() {
        return rokStudiow;
    }

    void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    int getKosztStudiow() {
        return kosztStudiow;
    }

    void setKosztStudiow(int kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }
}
