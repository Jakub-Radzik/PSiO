package training.Streams_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializacja2 {
    public static void main(String[] args) {
        Student s1 = new Student("Jakub", "Radzik");

        try {

            ObjectOutputStream so = new ObjectOutputStream(new FileOutputStream("Student.ser"));
            so.writeObject(s1);
            so.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

class Student implements Serializable {
    String fname;
    String lname;

    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}
