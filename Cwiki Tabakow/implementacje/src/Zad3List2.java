import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zad3List2 {
    public static void main(String[] args) {

        //Znajdź największą z pięciu liczb
        int a = 1;
        int b = 22;
        int c = 3;
        int d = 4;
        int e = 5;

        //Implementacja na mało poważnie
        System.out.println(
                Math.max(
                        Math.max(
                                Math.max(a,b),c
                        ), Math.max(d,e)
                )
        );

        //Implementacja na poważnie
        List<Integer> liczby = new ArrayList<Integer>(Arrays.asList(a,b,c,d,e));
        System.out.println(Collections.max(liczby));
    }
}
