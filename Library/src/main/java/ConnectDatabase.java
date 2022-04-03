import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnectDatabase {
    private final String hostName = "localhost:3306";
    private final String dbName = "library";
    private final String username = "root";
    private final String password = "10122001";

    private final String url = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
