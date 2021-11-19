package Powtorki.StreamApi;

import z20211024StreamApi.MoviesAW.VideoAW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        List<Integer> lista2=new ArrayList<>();
        List<Integer> lista3=new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.addAll(List.of(1,2,3,6,7,8));
        lista.forEach(System.out::println);
        System.out.println("Steamy");
        System.out.println("filter");
        lista.stream().filter(element -> element.equals(1)).forEach(System.out::print);
        System.out.println("\n"+"sorted");
        lista.stream().sorted().forEach(System.out::print);
        System.out.println("\n"+"map");
        lista.stream().map(element->element*10).forEach(System.out::println);
        System.out.println("\n"+"flatmap"); //stream ze streamow

        lista2.addAll(List.of(5,5,6,6,7));
        lista3.addAll(List.of(0,1,2,0));

        //List<VideoAW> videoAWList= Arrays.asList(v1,v2,v3,v4,v5,v6);


        List<List<Integer>> list=new ArrayList<>();
        list.addAll(List.of(lista,lista2,lista3));
        list.forEach(System.out::println);

        System.out.println("Stream flatmap");

        list.stream()
                .flatMap(element->element.stream())
                .filter(element2->element2.equals(6))
                .map(element3->element3*10)
                .forEach(System.out::print);

        System.out.println("\n"+"distinct");
        list.stream()
                .flatMap(element->element.stream())
                .distinct()
                .forEach(System.out::print);
        System.out.println("\n");

        lista.stream()
                .distinct()
                .forEach(System.out::print);


    }

}
