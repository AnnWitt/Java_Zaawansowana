package z20211023_funkcyjne.Optionale;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InterfejsFunkcyjnyOptional {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.empty(); // tworzy pusty Optional
        optionalString = Optional.ofNullable(null);
        //optionalString = Optional.of(null); // rzuci wyjatek


        optionalString.ifPresent((d) -> System.out.println(d));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");

        String s = "cos";
        String s2 = null;


        Optional<String> os = Optional.ofNullable(s);
        Optional<String> os2 = Optional.ofNullable(s2);

        List<Object> list = new ArrayList<>();

        if (os2.isPresent()) {
            os2.get();
        }

        System.out.println(os.orElse("dupa")); //tu była wartosc wiec poszlo coś
        System.out.println(os.orElse(doSth().get())); //tu była wartosc wiec poszlo coś
      //  System.out.println(os.orElseGet(() -> doSth()));
        System.out.println("------------------------");
        //System.out.println(os2.orElse(doSth()));
        System.out.println(os2.orElse("dupa2")); //to nie bylo wiec poszlo
        System.out.println(os2.orElse(doSth().get())); //to nie bylo wiec poszlo
    //    System.out.println(os2.orElseGet(() -> doSth()));
    }

     static Optional<String> doSth() {
        System.out.println("Jestem w metodzie doSth()");
        return Optional.of("test");
    }

}

