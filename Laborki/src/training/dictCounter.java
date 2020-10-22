package training;

import java.util.*;
import java.util.function.Function;

public class dictCounter {





    public static void main(String[] args) {
        String text = "Jakub Radzik ,Jakub. Inny, i -,morda i nie tylko ale nie moja głowa siema siema co!!! tam morda mordo mordo Jakub";
        System.out.println(text);
        text = text.replaceAll("[,.!?:;-]", "");
        System.out.println(text);



        ArrayList<String> words = new ArrayList<>(Arrays.asList(text.toLowerCase().split(" ")));
        Map<String, Integer> wordCounter = new HashMap<String, Integer>();
        for(String key: words){
            wordCounter.merge(key,1, Integer::sum);
        }

        wordCounter.forEach((word, count) -> System.out.println(word + " : " + count));





    }
}
