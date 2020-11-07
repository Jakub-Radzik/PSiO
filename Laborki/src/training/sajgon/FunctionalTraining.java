package training.sajgon;

import java.util.HashSet;
import java.util.function.*;

public class FunctionalTraining {

    static Function<Integer,String> intStringConvert =
            number -> Integer.toString(number*number);

    static BiFunction<Integer, Integer, Integer> addNumbs =
            (n1, n2) -> (n1+n2);

    static BiConsumer<Double, String> show =
            (n, txt) -> System.out.println(txt+" - "+n);

    static Predicate<String> hasHashtag =
            txt -> txt.contains("#");

    static Supplier<Integer> random09 =
            () -> (int) (Math.random()*11);



    public static void main(String[] args) {

//        System.out.println(intStringConvert.apply(2));
//        System.out.println(addNumbs.apply(3,5));
//
//        show.accept(5.0,"Laborki z PSiO");

        System.out.println(hasHashtag.test("siema"));
        System.out.println(hasHashtag.test("s#####"));

        HashSet<Integer> unique = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            unique.add(random09.get());
        }
        unique.stream()
                .sorted()
                .forEach(System.out::println);


    }
}