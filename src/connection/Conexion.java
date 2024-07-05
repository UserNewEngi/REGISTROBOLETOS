package connection;

import java.sql.*;

public class Conexion {

    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=dbo.Gechisa;trustServerCertificate=true;";
    private static final String usuario = "sa";
    private static final String contraseña = "jaren2515";
    public static Connection conn = null;
      public static Conexion instancia;

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, usuario, contraseña);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println();
            return null;
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println();
        }
    }
    public synchronized static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}
