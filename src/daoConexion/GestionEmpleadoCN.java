package daoConexion;

import connection.Conexion;
import model.GestionEmpleado;
import daoImpl.GestionEmpleadoDao;
import java.sql.*;
import javax.swing.JTable;

public class GestionEmpleadoCN {

    private String mensaje = "";
    private GestionEmpleadoDao edao = new GestionEmpleadoDao();

    public String agregarEmpleado(GestionEmpleado emp) {
        //se crea la conexion
        Connection conn = Conexion.getConnection();
        try {
            //la va a trabajar en la clase DAO se envia y recibe. //el emp igual recibe y envia datos
            mensaje = edao.agregarEmpleado(conn, emp);
            //el roll bat detiene la conxion
            conn.rollback();
        } catch (Exception e) {
           System.out.println(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return null;
    }

    public String actualizarEmpleado(GestionEmpleado emp) throws SQLException {
        Connection conn = Conexion.getConnection();
        try {
            //la va a trabajar en la clase DAO se envia y recibe. //el emp igual recibe y envia datos
            mensaje = edao.actualizarEmpleado(conn, emp);
            
            //el roll bat detiene la conxion
            conn.rollback();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return mensaje;
    }

    public String eliminarEmpleado(int id) {
        Connection conn = Conexion.getConnection();
        try {
            //la va a trabajar en la clase DAO se envia y recibe. //el emp igual recibe y envia datos
            mensaje = edao.eliminarEmpleado(conn, id);
            //el roll bat detiene la conxion
            conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }

        }
        return mensaje;
    }

    public void listarEmpleado(JTable tabla) {
        Connection conn = Conexion.getConnection();
        edao.listarEmpleado(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
