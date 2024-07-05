package view;
import javax.swing.JOptionPane;

public class JfrmReporteEmpleados extends javax.swing.JInternalFrame {

    public JfrmReporteEmpleados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblEmpleados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrarHoras = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtHorasTrabajadas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnGuardarInfo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Reporte");
        setToolTipText("");

        tblEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tblEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("REPORTE EMPLEADOS");
        tblEmpleados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel3.setText("Nombre:");
        tblEmpleados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        btnMostrar.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnMostrar.setText("Mostrar informacion");
        btnMostrar.setBorder(null);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, 40));

        txaMostrarHoras.setColumns(20);
        txaMostrarHoras.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaMostrarHoras.setRows(5);
        jScrollPane1.setViewportView(txaMostrarHoras);

        tblEmpleados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 470, 190));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel4.setText("Horas trabajadas:");
        tblEmpleados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 100, -1));

        txtHorasTrabajadas.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtHorasTrabajadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtHorasTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, 30));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tblEmpleados.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 130, 40));

        btnGuardarInfo.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnGuardarInfo.setText("GUARDAR REPORTE");
        btnGuardarInfo.setBorder(null);
        btnGuardarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInfoActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnGuardarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 140, 40));

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel7.setText("Turno:");
        tblEmpleados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtTurno.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel6.setText("Apellido:");
        tblEmpleados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 120, 30));

        txtNombre1.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 150, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel8.setText("Cargo:");
        tblEmpleados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 120, 30));

        txtNombre2.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        // Obtener la información directamente de los JTextField
        String nombre = txtNombre.getText(); // Asume que tienes un campo de texto llamado txtNombre
        String turno = txtTurno.getText();
        String horasTrabajadas = txtHorasTrabajadas.getText(); // Esto es un String, asumiendo que txtHorasTrabajadas es un JTextFiel
        // Componer el texto para mostrar
        String infoParaMostrar = "Nombre: " + nombre + "\n"
                + "--------------------------------------------" + "\n"
                + "Turno: " + turno + "\n"
                + "Horas Trabajadas: " + horasTrabajadas;

        // Mostrar la información en el JTextArea
        txaMostrarHoras.setText(infoParaMostrar);

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txaMostrarHoras.setText("");
        txtHorasTrabajadas.setText("");
        txtNombre.setText("");
        txtTurno.setText("");

        txtNombre.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInfoActionPerformed
// En tu clase de interfaz de usuario
        // Obtener los datos del formulario
        String nombre = txtNombre.getText(); 

        String turno = txtTurno.getText();
        String horasTrabajadas = txtHorasTrabajadas.getText(); 
        
        // Verificar si alguno de los campos está vacío
if (nombre.isEmpty() || turno.isEmpty() || horasTrabajadas.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return; // No continuar con el guardado si hay campos vacíos
}

    }//GEN-LAST:event_btnGuardarInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarInfo;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tblEmpleados;
    private javax.swing.JTextArea txaMostrarHoras;
    private javax.swing.JTextField txtHorasTrabajadas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
