package daoImpl;

import model.GestionEmpleado;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionEmpleadoDao {

    public String agregarEmpleado(Connection con, GestionEmpleado emp) {
        // se asigna null para
        PreparedStatement pst = null;
        String sql = "INSERT INTO Empleado (nombre,apellido,dni,direccion,estadoCivil,nivelEduca,telefono,email,fechaIngreso) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombre());
            pst.setString(2, emp.getApellido());
            pst.setString(3, emp.getDni());
            pst.setString(4, emp.getDireccion());
            pst.setString(5, emp.getEstadoCivil());
            pst.setString(6, emp.getNivelEduca());
            pst.setString(7, emp.getTelefono());
            pst.setString(8, emp.getEmail());
            pst.setDate(9, new java.sql.Date(emp.getFechaIngreso().getTime()));

            pst.execute();
            pst.close();

        } catch (Exception e) {
            System.out.println();
        }

        return null;
    }

    public String actualizarEmpleado(Connection con, GestionEmpleado emp) {
        PreparedStatement pst = null;
        String sql = "UPDATE Empleado SET nombre = ?, apellido = ?,dni = ?,direccion = ?,estadoCivil = ?,nivelEduca = ?,telefono = ?,email = ?,fechaIngreso = ? "
                + "WHERE IdEmpleado=? ";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombre());
            pst.setString(2, emp.getApellido());
            pst.setString(3, emp.getDni());
            pst.setString(4, emp.getDireccion());
            pst.setString(5, emp.getEstadoCivil());
            pst.setString(6, emp.getNivelEduca());
            pst.setString(7, emp.getTelefono());
            pst.setString(8, emp.getEmail());
            pst.setDate(9, new java.sql.Date(emp.getFechaIngreso().getTime()));
            pst.setInt(10, emp.getIdEmpleado());
            
            pst.execute();
            pst.close();

        } catch (Exception e) {
            System.out.println();
        }
        return null;
    }

    public String eliminarEmpleado(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM Empleado WHERE IdEmpleado = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            pst.close();

        } catch (Exception e) {
            System.out.println();
        }
        return null;
    }

    public void listarEmpleado(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"IdEmpleado", "nombre", "apellido", "dni", "direccion", "estadoCivil", "nivelEduca", "telefono", "email", "fechaIngreso"};
        model = new DefaultTableModel(null, columnas);

        //copnsulta
        String sql = "SELECT * FROM Empleado ORDER BY IdEmpleado";

        //crear filas
        String[] filas = new String[10];
        //ejecuitar nuestro query
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 10; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            System.out.println();
        }
    }
}
