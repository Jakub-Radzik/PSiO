package collectionTrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _List {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        List<String> lista1 = new ArrayList<String>(Arrays.asList("Siema jestem jakub radzik i programuje w javie".split(" ")));

        for (int i = 0; i < 20; i++) {
            lista.add(i);
        }

        System.out.println(lista.toString());
        Collections.sort(lista);
        System.out.println(lista.toString());
        Collections.reverse(lista);
        System.out.println(lista.toString());



    }
}
