package view;

import dao.IDaoGenerico;
import daoImpl.GestorAutobusImpl;
import daoImpl.GestorDeChoferesImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.GestionAutobus;
import model.GestionChofer;

public class JfrmGestionChoferes extends javax.swing.JInternalFrame {

    //instancia para ir a luego a frmPrincipal
    private FrmPrincipal2 principal;

    //tabla chofer
    private int idChofer;
    private IDaoGenerico<GestionChofer> crudDao;
    private DefaultTableModel modelo;
    private Object[] filaDatos;
    //tabla autobus
    private IDaoGenerico<GestionAutobus> crudDao2;
    private DefaultTableModel modelo2;
    private Object[] filaDatos2;

    public JfrmGestionChoferes(FrmPrincipal2 principal) {
        //asigna el valor del parámetro principal a la variable de instancia Principal del objeto actual
        this.principal = principal;

        initComponents();
        //chofer
        filaDatos = new Object[7];
        modelo = new DefaultTableModel();
        crudDao = new GestorDeChoferesImpl();
        listar();

        //autobus
        filaDatos2 = new Object[11];
        modelo2 = new DefaultTableModel();
        crudDao2 = new GestorAutobusImpl();
        listarAutobus();
    }

    private void listar() {
        try {
            //obtener el modelo de la tabla y como se ha declarado su diseño
            modelo = (DefaultTableModel) tblChofer.getModel();
            //recorre los objetos de gestionChofer y estos son obtenidos por listar()
            for (GestionChofer p : crudDao.listar()) {
                filaDatos[0] = p.getIdChofer();
                filaDatos[1] = p.getNombre();
                filaDatos[2] = p.getEdad();
                filaDatos[3] = p.getDireccion();
                filaDatos[4] = p.getTelefono();
                filaDatos[5] = p.getLicenciaConducir();
                filaDatos[6] = p.getFechaContratacion();
                //se añaden a la tabla
                modelo.addRow(filaDatos);
            }
        } catch (Exception e) {
            System.out.println();
        }
    }

    private void listarAutobus() {
        try {
            //obtener el modelo de la tabla y como se ha declarado su diseño
            modelo2 = (DefaultTableModel) tblAutobus.getModel();
            //recorre los objetos de gestionChofer y estos son obtenidos por listar()
            for (GestionAutobus p : crudDao2.listar()) {
                filaDatos2[0] = p.getIdChofer();
                filaDatos2[1] = p.getIdAutobus();
                filaDatos2[2] = p.getNumeroIdentificacion();
                filaDatos2[3] = p.getIdTipoModelo();
                filaDatos2[4] = p.getIdTipoMarca();
                filaDatos2[5] = p.getCapacidad();
                filaDatos2[6] = p.getCombustible();
                filaDatos2[7] = p.getAñoFabricacion();
                filaDatos2[8] = p.getPlaca();
                filaDatos2[9] = p.getIdTipoAccidente();
                //se añaden a la tabla
                modelo2.addRow(filaDatos2);
            }
        } catch (Exception e) {
            System.out.println();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblEmpleados1 = new javax.swing.JPanel();
        btnAgregar1 = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutobus = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLicenciaConducir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFechaContratacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChofer = new javax.swing.JTable();

        tblEmpleados1.setBackground(new java.awt.Color(255, 255, 255));
        tblEmpleados1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar1.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnAgregar1.setText("Agregar");
        btnAgregar1.setBorder(null);
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        tblEmpleados1.add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 90, 40));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblEmpleados1.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 340, -1));

        tblAutobus.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        tblAutobus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdAutobus", "IdChofer", "Numero de Identificacion", "IdTipoModelo", "IdTipoMarca", "Capacidad", "Combustible", "Año de fabricacion", "Placa", "IdTipoAccidente"
            }
        ));
        tblAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAutobusMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblAutobus);

        tblEmpleados1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 790, 250));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel8.setText("Edad:");

        txtEdad.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel7.setText("Direccion:");

        txtDireccion.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel5.setText("Licencia de conducir:");

        txtLicenciaConducir.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtLicenciaConducir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel10.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel14.setText("Fecha contratacion:");

        txtFechaContratacion.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtFechaContratacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel15.setText("Placa:");

        txtPlaca.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtPlaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtLicenciaConducir, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(26, 26, 26)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicenciaConducir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblEmpleados1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 360));

        tblChofer.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        tblChofer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdChofer", "nombre del chofer", "edad", "direccion", "telefono", "licencia de conducir", "fecha de contratacion"
            }
        ));
        tblChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblChoferMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblChoferMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblChofer);

        tblEmpleados1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 790, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblEmpleados1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        //los recoge de los ingresados de la tabla
        String nombre = txtNombre.getText();
        String placa = txtPlaca.getText();

        //manda los datos a principal en los txt de nombre y placa
        principal.setDatos(nombre, placa);
        this.dispose();
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void tblAutobusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutobusMouseReleased
        //se selecciona la tabla
        int seleccion = tblAutobus.getSelectedRow();
        //si no se selecciona ninguuna fila -1
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            //se extraen los datos de la tabla y se muestran en los txt
            txtPlaca.setText(tblAutobus.getValueAt(seleccion, 8) + "");
        }
    }//GEN-LAST:event_tblAutobusMouseReleased

    private void tblChoferMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChoferMouseReleased
        //se selecciona la tabla
        int seleccion = tblChofer.getSelectedRow();
        //si no se selecciona ninguuna fila -1
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            try {
                //se extraen los datos de la tabla y se muestran en los txt
                idChofer = Integer.parseInt(tblChofer.getValueAt(seleccion, 0) + "");
                txtNombre.setText(tblChofer.getValueAt(seleccion, 1) + "");
                txtEdad.setText(tblChofer.getValueAt(seleccion, 2) + "");
                txtDireccion.setText(tblChofer.getValueAt(seleccion, 3) + "");
                txtLicenciaConducir.setText(tblChofer.getValueAt(seleccion, 4) + "");
                txtTelefono.setText(tblChofer.getValueAt(seleccion, 5) + "");
                txtFechaContratacion.setText(tblChofer.getValueAt(seleccion, 6) + "");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al procesar la fila seleccionada: " + e);
            }
        }
    }//GEN-LAST:event_tblChoferMouseReleased

    private void tblChoferMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChoferMousePressed

    }//GEN-LAST:event_tblChoferMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblAutobus;
    private javax.swing.JTable tblChofer;
    private javax.swing.JPanel tblEmpleados1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaContratacion;
    private javax.swing.JTextField txtLicenciaConducir;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
