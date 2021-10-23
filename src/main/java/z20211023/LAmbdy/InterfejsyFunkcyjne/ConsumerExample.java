package z20211023.LAmbdy.InterfejsyFunkcyjne;

import java.util.function.Consumer;

public class ConsumerExample {


    public static void main(String[] args) {
        Consumer<String> stringTrim=(s)->{
            System.out.println(s.trim());
            //bez returna bo voidowa
        };
        stringTrim.accept("s"); //--> wywolanie
    }
    //akceptuje arg wejsciowy i nic nie zwraca
    //accept wywoluje metode do np lambvdy
    //void accept(T t)




}
