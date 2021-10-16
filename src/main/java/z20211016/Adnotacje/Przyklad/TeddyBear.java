package z20211016.Adnotacje.Przyklad;

public class TeddyBear {
    @Adnot.MinMaxValue(minValue = 10)
    private int age;

    public TeddyBear(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        try {
            if (!TeddyBearAgeValidator.validate(this)) {
                throw new IllegalArgumentException("Niepoprawna wartość wieku!");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }



}


