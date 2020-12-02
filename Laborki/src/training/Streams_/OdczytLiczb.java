package training.Streams_;

import java.io.BufferedReader;
import java.io.FileReader;

public class OdczytLiczb {
    int[] liczby = new int[1000];

    public static void main(String[] args) {

        String line;
        int number;
        try(BufferedReader br = new BufferedReader(new FileReader("Liczby.txt"))){
            while((line = br.readLine()) != null){
                number = Integer.parseInt(line);
                System.out.println(line+" "+(double)number/17);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
