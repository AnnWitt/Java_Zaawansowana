package z20211023.Optionale;
//Optional<Movie> movieCont=Optional.ofNullable(movie)
//mozliwosc zastapienia nulli i pominiec. Nie potrzeba obslugi nullpointerexception

import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {
        Optional<String> stringOptional=null;
        Optional.empty();//twoezy pust //wywolywane na klasach
        Optional.of("dd");// przynullu rzuci wyjatkiem
        stringOptional.ifPresent((s -> System.out.println(s))); //consumer
        //ifpresent,isempty itd wywolywane na obiektach
        stringOptional.orElse("dupa"); //jezeli stringoptional pusty to bedzie dupa
        //najpierw wysietli dupa a potem wartosc stringOptional
        //roznica: w 1 wykona z nawiasu, potem stwierdzi, że jednak wartosc ma i zwroci stringOptional
        //to w nawiasie i tak sie wykona - poprosilam o dane ale w sumie juz mam ;)  -EAGER
        stringOptional.orElseGet(()->"test"); //LAZY
        //nie wykona sie jezeli nie bedzie potrzeby, najpierw sprawdzi czy jest a potem ew test
        //zwracamy optionle zamiast nulli - dobra praktyka
        //druga dobra praktyka, nie przyjmujemy optionali
        //metody moga zwracac optionale ale nie powinny ich przyjmowac


    }
}
