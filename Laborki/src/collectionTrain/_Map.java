package collectionTrain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _Map {
    public static void main(String[] args) {
//        Map<String, String> mapka = new LinkedHashMap<>();
//
//        mapka.put("jeden", "1");
//        mapka.put("dwa", "2");
//        mapka.put("trzy", "3");
//        mapka.put("cztery", "4");
//        mapka.put("pięc", "5");
//
//        for(String i : mapka.keySet()){
//            System.out.println(i + " "+ mapka.get(i));
//        }
//
//        mapka.forEach((k,v) -> System.out.println(k+" "+v));
//
//        mapka.compute("dwa",(k,v) -> "simea");
//
//        mapka.forEach((k,v) -> System.out.println(k+" "+v));


        HashMap<Integer,String> wordCount = new HashMap<>();
        wordCount.put(0,"0");
        wordCount.put(3,"3");
        wordCount.put(2,"2");
        wordCount.put(5,"3");
        System.out.println(wordCount.get(3).equals(wordCount.get(5)));

        wordCount.computeIfAbsent(7, k->"XD");
        wordCount.computeIfPresent(3, (k,v)-> v.concat("elo"));
        wordCount.compute(5,(k,v) -> "piąteczka");
        wordCount.remove(3);
        for(Integer i : wordCount.keySet()){
            System.out.println(i + ":"+wordCount.get(i));
        }

    }
}
