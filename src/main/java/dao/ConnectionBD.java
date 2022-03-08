package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    private static ConnectionBD instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/tp_jdbc";
    private String username = "root";
    private String password = "";

    private ConnectionBD() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnectionBD getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionBD();
        } else if (instance.getConnection().isClosed()) {
            instance = new ConnectionBD();
        }

        return instance;
    }


  }


