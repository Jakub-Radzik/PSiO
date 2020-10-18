package training;

import java.util.ArrayList;

public class StrBuilder {
    public static void main(String[] args) {
       int one = 1;
       String color = "red";

        StringBuilder sb = new StringBuilder();
        ArrayList<String> liczby = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            sb.append(i);
            liczby.add(Integer.toString(i));
        }
        System.out.println(sb);
        String joii = String.join(" - ", liczby);

        char[] tabelka = {'a', 'b', 'c'};
        System.out.println(tabelka);
        sb.insert(3,tabelka);
        sb.reverse();
        System.out.println(sb);
        System.out.println(joii);
    }
}
