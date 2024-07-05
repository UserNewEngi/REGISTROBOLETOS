package daoConexion;

import connection.Conexion;
import javax.swing.JTable;
import java.sql.*;

import daoImpl.HistorialDao;

public class HistorialCN {

    private HistorialDao edao = new HistorialDao();

    public void listarHistorial(JTable tabla, String tipoBusqueda, String valorBusqueda) {
        try (Connection conn = Conexion.getConnection()) {
            // Mostrar los datos de la tabla
            edao.listarHistorial(conn, tabla, tipoBusqueda, valorBusqueda);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
