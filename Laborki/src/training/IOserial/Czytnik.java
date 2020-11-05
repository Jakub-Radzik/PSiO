package training.IOserial;

import java.io.*;
import java.util.Enumeration;

public class Czytnik {
    public static void main(String[] args) throws Exception {

        try{
            FileWriter fw = new FileWriter("konsola.txt");
            BufferedWriter bf = new BufferedWriter(fw);

            InputStreamReader in1 = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in1);

            String line = "";

            while (!line.equals("stop")){
                System.out.println("Enter: ");
                line = br.readLine();
                bf.write(line+"\n");
            }

            br.close();
            in1.close();
            bf.close();
            fw.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
