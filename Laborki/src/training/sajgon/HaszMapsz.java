package training.sajgon;

import java.util.HashMap;

public class HaszMapsz {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<String, String>();

        dict.put("England", "London");
        dict.put("Poland", "Warsaw");

        System.out.println(dict.size());
        System.out.println(dict.get("England"));

        for(String i : dict.keySet()){
            System.out.println(i+":"+dict.get(i));
        }

    }
}
