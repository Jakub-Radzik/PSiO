package training.GetConnected;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ObjectsToDB {
    public static void main(String[] args) {

        try{
            ArrayList<Person> osoby = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Karolina", "Monika","John", "Karolina", "Monika","John", "Karolina", "Monika","John", "Karolina", "Monika","John", "Karolina", "Monika"));

            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","radzik","radzik123");
            Statement getLastId = con.createStatement();
            ResultSet rs = getLastId.executeQuery("select id from testtab order by id DESC limit 1");
            rs.next();
            int newId = rs.getInt(1)+1;



            for (String name: names) {
                osoby.add(new Person(newId, name));
                PreparedStatement insertInto = con.prepareStatement("insert into testtab (id,name) values(?,?)");
                insertInto.setInt(1,newId);
                insertInto.setString(2,name);
                insertInto.executeUpdate();
                newId++;
            }

            osoby.forEach(person -> System.out.println(person.toString()));

            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }





    }

}


