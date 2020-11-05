package training.IOserial;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Sequence {
    public static void main(String[] args) {
        try{
            FileInputStream in1 = new FileInputStream("plik.txt");
            FileInputStream in2 = new FileInputStream("plik.txt");

            SequenceInputStream inst = new SequenceInputStream(in1, in2);

            int j;
            while((j=inst.read())!= -1){
                System.out.print((char)j);
            }
            inst.close();
            in1.close();
            in2.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
