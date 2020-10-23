package collectionTrain;

import java.util.LinkedHashMap;

public class _LinkedMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();
        for (int i = 0; i < 20; i++) {
            mapa.put(i,Integer.toString(i));
        }

        mapa.replaceAll((k,v) -> v.concat("1"));
        System.out.println(mapa);

        
    }
}
