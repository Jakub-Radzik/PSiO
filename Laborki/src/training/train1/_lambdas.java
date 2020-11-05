package training.train1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _lambdas {
    public static void main(String[] args) {

        Function<String, String> pN = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> up = (name, age) ->{
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };



        String name = pN.apply("jakub");
        System.out.println(name);

        String n = up.apply("alex", 30);
        System.out.println(n);


        Integer n1 = null;



    }


}
