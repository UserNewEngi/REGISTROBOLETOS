package view;

public class JfrmInfoRutas extends javax.swing.JInternalFrame {

    public JfrmInfoRutas() {
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
        btnGuardarInfo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Rutas");
        setToolTipText("");

        tblEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tblEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("RUTAS");
        tblEmpleados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel3.setText("Origen:");
        tblEmpleados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, 30));

        btnMostrar.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnMostrar.setText("Mostrar informacion");
        btnMostrar.setBorder(null);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 40));

        txaMostrarHoras.setColumns(20);
        txaMostrarHoras.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaMostrarHoras.setRows(5);
        jScrollPane1.setViewportView(txaMostrarHoras);

        tblEmpleados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 800, 270));

        btnGuardarInfo.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        btnGuardarInfo.setText("GUARDAR");
        btnGuardarInfo.setBorder(null);
        btnGuardarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInfoActionPerformed(evt);
            }
        });
        tblEmpleados.add(btnGuardarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 140, 30));

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel6.setText("Horarios:");
        tblEmpleados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 120, 30));

        txtNombre1.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel8.setText("Tarifas:");
        tblEmpleados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 120, 30));

        txtNombre2.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        txtNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpleados.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 150, 30));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tblEmpleados.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        // Obtener la información directamente de los JTextField

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGuardarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInfoActionPerformed
// En tu clase de interfaz de usuario


    }//GEN-LAST:event_btnGuardarInfoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarInfo;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tblEmpleados;
    private javax.swing.JTextArea txaMostrarHoras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}
