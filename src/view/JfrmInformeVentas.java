package view;

import connection.Conexion;
import dao.IDaoGenerico;
import daoImpl.GestorDeChoferesImpl;
import daoImpl.ReporteVentaImpl;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import model.GestionChofer;
import model.InformeVentas;

public class JfrmInformeVentas extends javax.swing.JInternalFrame {

    private int IdReporte;
    private IDaoGenerico<InformeVentas> crudDao;
    private DefaultTableModel modelo;
    private Object[] filaDatos;

    public JfrmInformeVentas() {

        initComponents();
        filaDatos = new Object[7];
        modelo = new DefaultTableModel();
        crudDao = new ReporteVentaImpl();
        listar();

    }

//metodo para listar en la tabla
    public void listar() {
        try {
            //obtener el modelo de la tabla y como se ha declarado su diseño
            modelo = (DefaultTableModel) tbloperaciones.getModel();
            //recorre los objetos de gestionChofer y estos son obtenidos por listar()
            for (InformeVentas p : crudDao.listar()) {
                filaDatos[0] = p.getIdReporte();
                filaDatos[1] = p.getFechaVenta();
                filaDatos[2] = p.getTipoOperacion();
                filaDatos[3] = p.getMonto();
                filaDatos[4] = p.getProducto();
                filaDatos[5] = p.getPrecio();
                filaDatos[6] = p.getImporte();
                //se añaden a la tabla
                modelo.addRow(filaDatos);
            }
        } catch (Exception e) {
            System.out.println();
        }

    }

    //metodo pra caclcular el total de las ventas
    private double calcularTotalVentas() {
        double suma = 0;
        //devuelve el numero total de filas de la tabla, desde la primera 0
        for (int i = 0; i < tbloperaciones.getRowCount(); i++) {
            double precio = Double.parseDouble(tbloperaciones.getValueAt(i, 5).toString());
            suma += precio;
        }
        return suma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBuscar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbloperaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        txtTotalVentas = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ventas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbloperaciones.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        tbloperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdReporte", "fecha de Venta", "Tipo de operacion", "Monto", "Producto", "Precio", "Importe"
            }
        ));
        jScrollPane1.setViewportView(tbloperaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1050, 340));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setText("INFORME DE VENTAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, -1));

        txtTotal.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        txtTotal.setText("Total general:");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtTotalVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 100, 30));

        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 80, 30));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 380, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double totalVentas = calcularTotalVentas();
        // mostrarlo en el "txtTotalVentas"
        txtTotalVentas.setText(String.valueOf(totalVentas));
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tbloperaciones;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtTotalVentas;
    // End of variables declaration//GEN-END:variables
}
