package ZadaniaPo20211003.OOP.Z2AW;

abstract class Person {
    String name;
    String address;

    Person() {

    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return String.format("%s->%s",name,address);
    }

    //-------------------
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }
}
