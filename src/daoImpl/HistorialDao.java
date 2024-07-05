package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HistorialDao {

    public void listarHistorial(Connection con, JTable tabla, String tipoBusqueda, String valorBusqueda) {
        //columnas a mostrar en la tabla ya declaradas
        DefaultTableModel model;
        String[] columnas = {"IdBoleto","numeroBoleta","metodoPago","tipoPago","origen","destino","asiento","horaSalida","fechaRegistro","vendedor","cliente","dni","placa"};
        model = new DefaultTableModel(null, columnas);
        model.setRowCount(0);

        //copnsulta y ordene segun el id
        String sql = "SELECT * FROM Boletos WHERE " + tipoBusqueda + " = ? ORDER BY IdBoleto";

        //crear filas
        String[] filas = new String[13];

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, valorBusqueda);
            ResultSet rs = pst.executeQuery();

            //validar si existe el dato
            //el metodo isBeforeFirst() verifica si el datos ingresado a buscar se encuentra en la tabla
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Dato inexistente");
            } else {
                while (rs.next()) {
                    //recorra hasta el 8 si estan los datos
                    for (int i = 0; i < 13; i++) {
                        filas[i] = rs.getString(i + 1);
                    }
                    model.addRow(filas);
                }
            }
            tabla.setModel(model);
        } catch (Exception e) {
            System.out.println();
        }
    }
}
