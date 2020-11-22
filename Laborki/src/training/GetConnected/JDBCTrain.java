package training.GetConnected;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

public class JDBCTrain {
    public static void main(String[] args) {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","radzik","radzik123");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM testtab");

            ArrayList<Person> osoby = new ArrayList<>();

            while (rs.next()){
                osoby.add(new Person(rs.getInt(1), rs.getString(2)));
            }
            con.close();

            osoby.forEach(person -> System.out.println(person.toString()));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}