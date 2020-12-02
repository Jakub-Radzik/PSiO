package training.Streams_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

public class Buforki {
    public static void main(String[] args) {
        try{
            FileReader freader = new FileReader("plik.txt");
            BufferedReader breader = new BufferedReader(freader);
            Iterator itr = breader.lines().iterator();
            while (itr.hasNext()){
                System.out.println(itr.next());
            }
            breader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
