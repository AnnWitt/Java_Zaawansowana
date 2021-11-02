package ZadaniaPo20211003.OOP.Z2Rozw;

public class Exercise {

    public static void main(String[] args) {
        Person student = new Student("John", "BC 43", "IT", 1,
                1000);
        Person staff = new Staff("Computer Programming", 4500f);
        System.out.println(student);
        System.out.println(staff);
    }
}
class Person {
    protected String name, address;
    public Person() {
    }
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return String.format("%s->%s", name, address);
    }
}
class Student extends Person {
    private String typeOfStudies;
    private int yearOfStudy;
    private float studiesPrice;

    public Student(String name, String address, String
            typeOfStudies, int yearOfStudy, float studiesPrice) {
        super(name, address);
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudy = yearOfStudy;
        this.studiesPrice = studiesPrice;
    }
    public String getTypeOfStudies() {
        return typeOfStudies;
    }
    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public float getStudiesPrice() {
        return studiesPrice;
    }
    public void setStudiesPrice(float studiesPrice) {
        this.studiesPrice = studiesPrice;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudies='" + typeOfStudies + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", studiesPrice=" + studiesPrice +
                '}';
    }
}
class Staff extends Person {
    private String specialization;
    private float salary;
    public Staff(String specialization, float salary) {
        this.specialization = specialization;
        this.salary = salary;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", specialization='" + specialization + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}


