package training.sajgon;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> mapka = new HashMap<>();

        mapka.put(0,"siema");
        mapka.put(1,"siema1");
        mapka.put(2,"siema2");
        mapka.put(3,"siema3");

        Map<Integer, String> mapka2 = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            mapka.putIfAbsent(i,null);
        }
        mapka.forEach((k,v) -> System.out.println(k+":"+v));
    }
}
