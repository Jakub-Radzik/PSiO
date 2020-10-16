package lab1;

import java.util.Arrays;

public class Zad2b {
    public static void main(String[] args) {
        int[] liczby = {9,6,2};
        Arrays.sort(liczby);

        for(int n :liczby){
            System.out.print(n+" ");
        }
    }
}
