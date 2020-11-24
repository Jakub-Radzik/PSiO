package training.JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import static training.JDBC1.TableOperation.*;

public class Main {
    public static void main(String[] args){
        ConnectionBase connectionBase = ConnectionBase.getInstance();

        try {
            Class.forName(connectionBase.getDriver());
            Connection con = DriverManager.getConnection(connectionBase.getBase(), connectionBase.getUser(), connectionBase.getPassword());
            getAllRecordsXML(con, "testtab","id",1);
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
