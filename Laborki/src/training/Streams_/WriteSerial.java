package training.Streams_;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class WriteSerial {
    public static void main(String[] args) {

        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("Student.ser"))){
            Object obj1 = is.readObject();
            Student st1 = (Student) obj1;
            System.out.println(st1.fname);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
