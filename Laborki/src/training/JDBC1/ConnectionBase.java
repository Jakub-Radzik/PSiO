package training.JDBC1;

public class ConnectionBase {
    private static ConnectionBase instance = null;

    private ConnectionBase(){}
    public static ConnectionBase getInstance(){
        if (instance==null){
            instance = new ConnectionBase();
        }
        return instance;
    }

    public String getDriver() {
        return "org.mariadb.jdbc.Driver";
    }

    public String getBase() {
        return "jdbc:mariadb://localhost:3306/test";
    }

    public String getUser() {
        return "radzik";
    }

    public String getPassword() {
        return "radzik123";
    }
}

