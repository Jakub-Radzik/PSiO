package training.IOserial;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BuffOutStr {
    public static void main(String[] args) {
        try{
            FileOutputStream f_out = new FileOutputStream("plik.txt");
            BufferedOutputStream b_out = new BufferedOutputStream(f_out);
            String s = "Siema";
            byte b[] = s.getBytes();
            b_out.write(b);
            b_out.flush();
            b_out.close();
            f_out.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
