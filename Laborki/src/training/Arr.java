package training;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            lista.add(Integer.toString(i));
        }
        System.out.println(lista);
    }
}
