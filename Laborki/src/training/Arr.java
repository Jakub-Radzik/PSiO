package training;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            lista.add(i);
        }
        System.out.println(lista);

        ArrayList<Integer> l2 = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            l2.add(i);
        }
        System.out.println(l2);

        lista.addAll(5,l2);
        System.out.println(lista);

    }
}
