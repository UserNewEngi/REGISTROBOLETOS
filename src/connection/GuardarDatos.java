package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


public class GuardarDatos {

    // Método para guardar boleta
    public static int guardarBoleta(String numeroBoleta, String metodoPago, String tipoPago, String origen, String destino,
            int asiento, String horaSalida, String fechaRegistro, String vendedor, String cliente, String dni, String placa)
            throws Exception {

        String sql = "INSERT INTO Boletos ( numeroBoleta, metodoPago, tipoPago, origen, destino, asiento, horaSalida, "
                + "fechaRegistro, vendedor, cliente, dni, placa) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, numeroBoleta);
            ps.setString(2, metodoPago);
            ps.setString(3, tipoPago);
            ps.setString(4, origen);
            ps.setString(5, destino);
            ps.setInt(6, asiento);
            ps.setString(7, horaSalida);
            ps.setString(8, fechaRegistro);
            ps.setString(9, vendedor);
            ps.setString(10, cliente);
            ps.setString(11, dni);
            ps.setString(12, placa);
            ps.executeUpdate();
            
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    
                    throw new SQLException("Creating boleta failed, no ID obtained.");
                }
            }
        }
    }

    //Método para guardar detalle boleta
    public static int reportesVentas(String producto,float precio, float importe, String tipoOperacion, float monto, String fechaVenta) 
            throws Exception {
        
        String sql = "INSERT INTO ReportesVentas (producto, precio, importe, tipoOperacion, monto, fechaVenta) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, producto);
            ps.setFloat(2, precio);
            ps.setFloat(3, importe);
            ps.setString(4, tipoOperacion);
            ps.setFloat(5, monto);
            ps.setString(6, fechaVenta);

            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Creating boleta failed, no ID obtained.");
                }
            }
        }
    }

    // Método genérico para ejecutar un update
    private static void executeUpdate(String sql, Object... parameters) throws Exception {
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            setParameters(ps, parameters);
            ps.executeUpdate();
        }
    }

    // Método genérico para configurar parámetros
    private static void setParameters(PreparedStatement ps, Object... parameters) throws SQLException {
        for (int i = 0; i < parameters.length; i++) {
            ps.setObject(i + 1, parameters[i]);
        }
    }
}
