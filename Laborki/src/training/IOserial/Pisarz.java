package training.IOserial;

import java.io.BufferedReader;
import java.io.FileReader;

public class Pisarz {




    public static void main(String[] args) {

//        try{
//            FileWriter fw = new FileWriter("text1.txt");
//            fw.write("siema mordo\n");
//            fw.write("XDXDXDXDXDXD\n");
//            fw.write("LOOOOOOOOOOOOL\n");
//            fw.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("text1.txt"));
            String line = reader.readLine();
            while (line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
