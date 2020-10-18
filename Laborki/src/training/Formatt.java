package training;

import java.util.Formatter;

public class Formatt {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        System.out.println(f.format("One=%d, color=%s",1,"red"));

        String name = "Jakub";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(name);
        }
        System.out.println("Name: " + name);
        System.out.println("SB: " + sb);
        name = sb.toString();
        System.out.println(name);
    }
}
