package z20211016.Adnotacje.JebanyMis;

public class TeddyBear {

    private int age;
    @MaxLenghtAdnotacje(maxValue = 6)
    private String name;

    public TeddyBear(int age, String name) throws Exception{
        this.age = age;
        this.name = name;
       if (!TeddyBearNameLenghtVlidator.validate(this)) {
           throw new IllegalArgumentException("za dlugie imie z konsturktora");
       }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        this.name = name;
        if (!TeddyBearNameLenghtVlidator.validate(this)) {
            throw new IllegalArgumentException("za dlugie imie z settera");
        }
    }
}
