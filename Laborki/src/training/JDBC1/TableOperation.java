package training.JDBC1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

abstract public class TableOperation {
    public static void getAllRecords(Connection con, String table) throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM "+table);
        displayResult(rs);
    }

    private static void displayResult(ResultSet rs) throws SQLException {
        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            System.out.print(rs.getMetaData().getColumnLabel(i)+"\t\t");
        }
        System.out.println();
        while (rs.next()){
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                System.out.print(rs.getString(i)+"\t\t");
            }
            System.out.println();
        }

    }

    public static void getAllRecordsXML(Connection con, String table, String columnName ,int record) throws SQLException, IOException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM "+table+" WHERE "+ columnName+"="+record);
        if(rs.next()){
            for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                System.out.print("<"+rs.getMetaData().getColumnName(i)+">");
                System.out.print(rs.getString(i));
                System.out.println("</"+rs.getMetaData().getColumnName(i)+">");
            }
        }else{
            throw new IndexOutOfBoundsException("Specified record does not exist");
        }

    }
}
