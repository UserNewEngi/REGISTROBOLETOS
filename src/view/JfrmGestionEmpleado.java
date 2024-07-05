package view;

import model.GestionEmpleado;
import daoConexion.GestionEmpleadoCN;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class JfrmGestionEmpleado extends javax.swing.JInternalFrame {

    private GestionEmpleadoCN ebo = new GestionEmpleadoCN();

    public JfrmGestionEmpleado() {
        initComponents();
        listarEmpleado();
    }

    public void listarEmpleado() {
        ebo.listarEmpleado(tblEmpleado);

    }

    private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtDireccion.setText("");
        grdEstado.clearSelection();
        txtNivelEducativo.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtFechaIngreso.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grdEstado = new javax.swing.ButtonGroup();
        tblEmpleados = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNivelEducativo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        rbtnSoltero = new javax.swing.JRadioButton();
        rbtCasado = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Gestion empleado");
        setToolTipText("");

        tblEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tblEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 80, 40));

        btnEliminar.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 90, 40));

        btnAgregar.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 90, 40));

        btnActualizar.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 90, 40));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblEmpleados.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 340, -1));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        tblEmpleados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 780, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel6.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel8.setText("Dni:");

        txtDni.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel7.setText("Direccion:");

        txtDireccion.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel4.setText("Estado civil:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel5.setText("Nivel Educativo:");

        txtNivelEducativo.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNivelEducativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel10.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel9.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel14.setText("Fecha ingreso:");

        txtFechaIngreso.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtFechaIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbtnSoltero.setBackground(new java.awt.Color(255, 255, 255));
        grdEstado.add(rbtnSoltero);
        rbtnSoltero.setText("Soltero");

        rbtCasado.setBackground(new java.awt.Color(255, 255, 255));
        grdEstado.add(rbtCasado);
        rbtCasado.setText("Casado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8)
                        .addGap(19, 19, 19)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnSoltero)
                        .addGap(30, 30, 30)
                        .addComponent(rbtCasado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(txtNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSoltero)
                    .addComponent(rbtCasado))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tblEmpleados.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 380, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*
         int fila = tblEmpleado.getSelectedRow();
         if (fila == -1) {
         JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
         } else {
         int IdEmpleado = Integer.parseInt(tblEmpleado.getValueAt(fila, 0).toString()); // Assuming ID is in the first column
         if (JOptionPane.showConfirmDialog(null, "Desea eliminar el registro", "Eliminar", JOptionPane.YES_NO_OPTION, 3) == 0) {
                
         String mensaje = crudDao.eliminar(new GestionEmpleado(IdEmpleado));
         lblMensaje.setText(mensaje);
         limpiarTabla();
         listar();
         btnNuevoActionPerformed(evt);
         }
         }
         */
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDni.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtNivelEducativo.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty() || txtFechaIngreso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "llene todos los campos");
        } else {
            String estado;
            //si se selecciona casado o soltero
            if (rbtCasado.isSelected()) {
                estado = "Casado";
            } else {
                estado = "Soltero";

            }
            //recoger los datos y asignar en sus txt
            GestionEmpleado emp = new GestionEmpleado();
            emp.setNombre(txtNombre.getText());
            emp.setApellido(txtApellido.getText());
            emp.setDni(txtDni.getText());
            emp.setDireccion(txtDireccion.getText());
            emp.setEstadoCivil(estado);
            emp.setNivelEduca(txtNivelEducativo.getText());
            emp.setTelefono(txtTelefono.getText());
            emp.setEmail(txtNombre.getText());

            //cambiar el formato de fecha al aceptado por sql server
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            try {
                //parsear una cadena String a date
                Date fecha = formato.parse(txtFechaIngreso.getText());
                // se establece en el objeto emp
                emp.setFechaIngreso(fecha);
            } catch (ParseException e) {
                System.out.println();
            }

            ebo.agregarEmpleado(emp);
            limpiar();
            listarEmpleado();

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDni.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtNivelEducativo.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty() || txtFechaIngreso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "llene todos los campos");
        } else {
            try {
                //si se selecciona casado o soltero
                String estado;
                if (rbtCasado.isSelected()) {
                    estado = "Casado";
                } else {
                    estado = "Soltero";

                }
                //recoger los datos y asignar en sus txt
                GestionEmpleado emp = new GestionEmpleado();
                emp.setNombre(txtNombre.getText());
                emp.setApellido(txtApellido.getText());
                emp.setDni(txtDni.getText());
                emp.setDireccion(txtDireccion.getText());

                emp.setEstadoCivil(estado);

                emp.setNivelEduca(txtNivelEducativo.getText());
                emp.setTelefono(txtTelefono.getText());
                emp.setEmail(txtNombre.getText());

                //cambiar el formato de fecha al aceptado por sql server
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    //parsear una cadena String a date
                    Date fecha = formato.parse(txtFechaIngreso.getText());
                    // se establece en el objeto emp
                    emp.setFechaIngreso(fecha);
                } catch (ParseException e) {
                    System.out.println();
                }

                ebo.actualizarEmpleado(emp);
                limpiar();
                listarEmpleado();

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblEmpleadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseReleased
        //obtiene en donde se escuentra el evento causado por el mause
        int seleccion = tblEmpleado.rowAtPoint(evt.getPoint());
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            try {
                //filas seleccionadas
                txtNombre.setText(tblEmpleado.getValueAt(seleccion, 1) + "");
                txtApellido.setText(tblEmpleado.getValueAt(seleccion, 2) + "");
                txtDni.setText(tblEmpleado.getValueAt(seleccion, 3) + "");
                txtDireccion.setText(tblEmpleado.getValueAt(seleccion, 4) + "");
                String estado = tblEmpleado.getValueAt(seleccion, 5) + "";
                if (estado.equals("Soltero")) {
                    rbtnSoltero.setSelected(true);
                } else {
                    rbtCasado.setSelected(true);
                }
                txtNivelEducativo.setText(tblEmpleado.getValueAt(seleccion, 6) + "");
                txtTelefono.setText(tblEmpleado.getValueAt(seleccion, 7) + "");
                txtEmail.setText(tblEmpleado.getValueAt(seleccion, 8) + "");
                txtFechaIngreso.setText(tblEmpleado.getValueAt(seleccion, 9) + "");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al procesar la fila seleccionada: " + e);
            }

        }
    }//GEN-LAST:event_tblEmpleadoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup grdEstado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JRadioButton rbtCasado;
    private javax.swing.JRadioButton rbtnSoltero;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JPanel tblEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtNivelEducativo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
