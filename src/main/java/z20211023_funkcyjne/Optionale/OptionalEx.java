package z20211023_funkcyjne.Optionale;
//Optional<Movie> movieCont=Optional.ofNullable(movie)
//mozliwosc zastapienia nulli i pominiec. Nie potrzeba obslugi nullpointerexception

import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {
        Optional<String> stringOptional=Optional.empty();//twoezy pusty optional //wywolywane na klasach
        stringOptional=Optional.ofNullable(null);
        Optional.of("dd");// przynullu rzuci wyjatkiem
        stringOptional.ifPresent((s -> System.out.println(s))); //consumer
        //ifpresent,isempty itd wywolywane na obiektach
        System.out.println(stringOptional.orElse("dupa"));
        //jezeli stringoptional pusty to bedzie dupa
        //najpierw wysietli dupa a potem wartosc stringOptional
        //jeżeli mamy w nawiasie przerwanie działania to przerwie mimo, że mamy wartosc
        //roznica: w 1 wykona z nawiasu, potem stwierdzi, że jednak wartosc ma i zwroci stringOptional
        //to w nawiasie i tak sie wykona - poprosilam o dane ale w sumie juz mam ;)  -EAGER
        stringOptional.ifPresent((s -> System.out.println(s))); //consumer
        stringOptional.orElseGet(()->"test"); //LAZY
        //oczekuje suppliera
        //nie wykona sie jezeli nie bedzie potrzeby, najpierw sprawdzi czy jest a potem ew test
        //zwracamy optionle zamiast nulli - dobra praktyka
        //druga dobra praktyka, nie przyjmujemy optionali
        //metody moga zwracac optionale ale nie powinny ich przyjmowac


        //jak cos moze byc nullem to w optionala aby uniknac dotarcia do wyjatku
        //a wyjatek do "zakrycia"

    }
}
