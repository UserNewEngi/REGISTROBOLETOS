package daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReporteVentaDao {
    
    public void listarReporte(Connection con, JTable tabla) {
        
        DefaultTableModel model;
        String[] columnas = {"IdReporte", "fechaVenta", "tipoOperacion", "monto", "producto", "precio", "importe"};
        model = new DefaultTableModel(null, columnas);

        //copnsulta y ordene segun el id
        String sql = "SELECT * FROM ReportesVentas ORDER BY IdReporte";

        //crear filas
        String[] filas = new String[8];
        //ejecutar nuestro query
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                //recorra hasta el 8 si estan los datos
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
}
