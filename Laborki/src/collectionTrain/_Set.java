package collectionTrain;

import java.util.*;

public class _Set {
    public static void main(String[] args) {
        TreeSet<Integer> dict = new TreeSet<>();

        for (int i = 0; i < 50; i+=2) {
            dict.add(i);
        }

        

        for (int i = 0; i < 100; i+=5) {
            dict.add(i);
        }

        List<Integer> list = new ArrayList<>(dict);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(dict);
        System.out.println(dict.tailSet(4,true));
        System.out.println(dict.subSet(3,20));
    }
}
