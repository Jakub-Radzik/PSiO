package training.IOserial;

import java.io.*;

public class Serializat{

    public static void serial(Object o, String file){
        try {
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(o);
            oout.close();
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jakub", "PWr", 20);
//        serial(s1, "stud.ser");

        try{
            FileInputStream fin = new FileInputStream("stud.ser");
            ObjectInputStream oin = new ObjectInputStream(fin);

            Student s2 = (Student) oin.readObject();
            System.out.println(s2.toString());

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

class Student implements Serializable{
    String name;
    String university;
    int age;

    public Student(String name, String university, int age) {
        this.name = name;
        this.university = university;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", university='").append(university).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
