package view;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class FrmLogin2 extends javax.swing.JFrame {

    private HashMap<String, String> usuarios;

    public FrmLogin2() {
        initComponents();
        //Lista de empleados con sus usuarios y contraseña
        usuarios = new HashMap<>();
        usuarios.put("Ganthony", "123");
        usuarios.put("Jpanta", "456");
        usuarios.put("JJuarez", "1234");
        usuarios.put("PPuccioA", "2315");
        usuarios.put("AlonsoR", "2020");
        usuarios.put("SJunior", "382");
        usuarios.put("DJostin", "451");

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 137));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel3.setText("Ingreso al sistema");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        lblUsuario.setBackground(new java.awt.Color(0, 0, 0, 0));
        lblUsuario.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lblUsuario.setBorder(null);
        lblUsuario.setOpaque(false);
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 10));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jpassword.setBackground(new java.awt.Color(0,0,0,0));
        jpassword.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jpassword.setBorder(null);
        jpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpassword.setOpaque(false);
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, 20));

        btnIniciar.setBackground(new java.awt.Color(204, 204, 255));
        btnIniciar.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnIniciar.setText("Ingresar");
        btnIniciar.setBorder(null);
        btnIniciar.setOpaque(false);
        btnIniciar.setSelected(true);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 180, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //guardar el usuario y contraseña ingresada
        try {
            String usuario = lblUsuario.getText();
            char[] contrasenaChars = jpassword.getPassword();
            String contrasena = new String(contrasenaChars);
            
            //Validar si la contraseña o usuario es coreccto, ingresar al FrmPrincipal
            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
                FrmPrincipal2 frmPrincipal = new FrmPrincipal2(usuario);
                frmPrincipal.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField lblUsuario;
    // End of variables declaration//GEN-END:variables
}
