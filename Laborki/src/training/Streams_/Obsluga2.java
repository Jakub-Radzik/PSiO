package training.Streams_;

import java.io.*;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Obsluga2 {
    public static void main(String[] args) {
//        String line = "";
//        String number;
//        String name;

//        try(FileOutputStream fw = new FileOutputStream("docelowy.txt",true)){
//            try(BufferedReader sc = new BufferedReader(new FileReader("plik.txt"))){
//                System.out.println("siema");
//                while((line = sc.readLine())!= null){
//                    number = line.split(" ")[0];
//                    name = line.split(" ")[1];
//                    fw.write(number.getBytes());
//                }
//
//            }catch(FileNotFoundException ex1){
//                System.out.println("Plik nie znaleziony");
//            }catch(Exception ex){
//                ex.printStackTrace();
//            }
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }

        try(FileWriter fw = new FileWriter("Liczby.txt")){
            for (int i = 0; i < 1000; i++) {
                int rand = new Random().nextInt(Integer.MAX_VALUE);
                fw.write(String.valueOf(rand));
                fw.write("\n");
                System.out.println("Wrote: "+rand);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
