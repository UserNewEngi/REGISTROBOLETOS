package daoConexion;

import connection.Conexion;
import daoImpl.ReporteVentaDao;
import java.sql.*;
import javax.swing.*;

public class ReporteVentaCN {
    private ReporteVentaDao edao = new ReporteVentaDao();
    
    public void listarReporte(JTable tabla) {
        //conexion a la base
        Connection conn = Conexion.getConnection();
        //mostrar los datos de la tabla
        edao.listarReporte(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
