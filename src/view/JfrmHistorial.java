package view;

import daoConexion.HistorialCN;
import java.text.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JfrmHistorial extends javax.swing.JInternalFrame {

    public JfrmHistorial() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoletas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        cbxBuscarTipo = new javax.swing.JComboBox();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Historial");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBoletas.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        tblBoletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdBoleta", "Numero de Boleta", "Fecha", "Hora", "Asiento", "Pasajero", "Dni", "Origen", "Destino", "Placa", "Vendedor", "Tipo de pago", "Metodo de pago"
            }
        ));
        jScrollPane1.setViewportView(tblBoletas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1240, 330));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("HISTORIAL DE BOLETAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel4.setText("Realiza busquedas por fecha o hora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 260, 30));

        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 120, 30));

        txtConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 150, 30));

        cbxBuscarTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECCIONAR-", "fecha", "hora" }));
        cbxBuscarTipo.setBorder(null);
        jPanel1.add(cbxBuscarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 160, 30));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtConsulta.setText("");
        cbxBuscarTipo.setSelectedIndex(0);
        txtConsulta.requestFocus();
        tblBoletas.selectAll();

        //limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tblBoletas.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // valor del filtro el cual es ingresado a txtConsulta si es de hora o fecha
        String valorFiltro = txtConsulta.getText();
        // si el filtro es nulo el usuario no ha ingresado nada y comprobar si no ha ingresado espacios en blanco con trim()
        if (valorFiltro == null || valorFiltro.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un dato valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // validar si selecciono un filtro
        String tipoFiltro = cbxBuscarTipo.getSelectedItem().toString();
        // si el filtro es nulo el usuario no ha ingresado nada y comprobar si no ha ingresado espacios en blanco con trim()
        if (tipoFiltro == null || tipoFiltro.isEmpty() || "Seleccione un filtro".equals(tipoFiltro)) {
            JOptionPane.showMessageDialog(null, "Seleccione un filtro para realizar la consulta", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Si el filtro es fecha, comprobamos que sea una fecha válida
        if ("fecha".equals(tipoFiltro)) {
            // se parsean las fechas en java
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
            //con setLenient no se permitiria las fechas inexactas
            sdf.setLenient(false);
            try {
                sdf.parse(valorFiltro);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "introduzca una fecha válida en formato dd/MM/yyy", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        // Si el filtro es por hora, comprobamos que sea una hora válida
        if ("hora".equals(tipoFiltro)) {
            // se parsean las horas en java
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            //con setLenient no se permitiria las horas inexactas
            sdf.setLenient(false);
            try {
                sdf.parse(valorFiltro);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "introduzca una hora válida en formato HH:mm", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

        }

        //determina si se elije una de las dos opcciones
        String tipoFiltroColumna = "fecha".equals(tipoFiltro) ? "fechaRegistro" : "horaSalida";

        // Obtiene los datos filtrados y consulta en la base
        HistorialCN historialCN = new HistorialCN();
        historialCN.listarHistorial(tblBoletas, tipoFiltroColumna, valorFiltro);

    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox cbxBuscarTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBoletas;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
