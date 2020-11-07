package training.sajgon;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHASZmapp {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, null);
        map.put(2, "SIEMA");

        System.out.println(map);

        Set<Integer> keys = map.keySet();

        for(Integer key : keys) {
            System.out.println(key+":"+map.get(key));
        }

    }
}
