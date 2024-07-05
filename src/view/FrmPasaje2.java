package view;

import model.InfoBoleta;
import model.InfoViaje;
import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrmPasaje2 extends javax.swing.JDialog {

    private InfoBoleta boleta = new InfoBoleta();

    public FrmPasaje2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //mantenga su tamaña
        setResizable(false);
        setLocationRelativeTo(null);
    }

    // Método para el cambio de color los botones cuando sean clikeados
    private void toggleButtonColorAndText(JButton btn, String seatText) {
        String currentText = txtAsiento.getText();
        String newText;
        //a color rojo (asiento asignado)
        btn.setBackground(Color.RED);
        //separar con "," si se selecciona varios botones
        newText = currentText.isEmpty() ? seatText : currentText + ", " + seatText;
        txtAsiento.setText(newText);
    }

    // Método para mostrar los datos ingresados de principal a pasajes
    public void setDatos(InfoViaje infoViaje) {
        // Mostrar lo ingresado de principal
        txtOrigen.setText(infoViaje.getOrigen());
        txtDestino.setText(infoViaje.getDestino());
        txtFechaSalida.setText(infoViaje.getFechaSalida());
        txtNombreChofer.setText(infoViaje.getNombre());
        txtPlaca.setText(infoViaje.getPlaca());
        txtHora.setText(infoViaje.getHora());
        lblUsuario.setText(infoViaje.getUsuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDniPasajero = new javax.swing.JTextField();
        txtNombrePasajero = new javax.swing.JTextField();
        txtApellidoPasajero = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtAsiento = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxTipoPago = new javax.swing.JComboBox();
        cbxMetodoDePago = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtNombreChofer = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnLimpiarDatos = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtcarro = new javax.swing.JLabel();
        btnBoleta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pasajes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn21.setBackground(new java.awt.Color(0, 204, 0));
        btn21.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn21.setText("B21");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        getContentPane().add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 60, 60));

        btn22.setBackground(new java.awt.Color(0, 204, 0));
        btn22.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn22.setText("A22");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        getContentPane().add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 60, 60));

        btn24.setBackground(new java.awt.Color(0, 204, 0));
        btn24.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn24.setText("A24");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        getContentPane().add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 60, 60));

        btn25.setBackground(new java.awt.Color(0, 204, 0));
        btn25.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn25.setText("B25");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });
        getContentPane().add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, 60));

        btn23.setBackground(new java.awt.Color(0, 204, 0));
        btn23.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn23.setText("B23");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        getContentPane().add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 60, 60));

        btn26.setBackground(new java.awt.Color(0, 204, 0));
        btn26.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn26.setText("A26");
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });
        getContentPane().add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 60, 60));

        btn28.setBackground(new java.awt.Color(0, 204, 0));
        btn28.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn28.setText("A28");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });
        getContentPane().add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 60, 60));

        btn27.setBackground(new java.awt.Color(0, 204, 0));
        btn27.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn27.setText("B27");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });
        getContentPane().add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 60, 60));

        btn30.setBackground(new java.awt.Color(0, 204, 0));
        btn30.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn30.setText("A30");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });
        getContentPane().add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 60, 60));

        btn29.setBackground(new java.awt.Color(0, 204, 0));
        btn29.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn29.setText("B29");
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });
        getContentPane().add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 60, 60));

        btn32.setBackground(new java.awt.Color(0, 204, 0));
        btn32.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn32.setText("A32");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        getContentPane().add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 60, 60));

        btn31.setBackground(new java.awt.Color(0, 204, 0));
        btn31.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn31.setText("B31");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });
        getContentPane().add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 60, 60));

        btn34.setBackground(new java.awt.Color(0, 204, 0));
        btn34.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn34.setText("A34");
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });
        getContentPane().add(btn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 60, 60));

        btn33.setBackground(new java.awt.Color(0, 204, 0));
        btn33.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn33.setText("B33");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });
        getContentPane().add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 60, 60));

        btn36.setBackground(new java.awt.Color(0, 204, 0));
        btn36.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn36.setText("A36");
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });
        getContentPane().add(btn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 70, 60));

        btn35.setBackground(new java.awt.Color(0, 204, 0));
        btn35.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn35.setText("B35");
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });
        getContentPane().add(btn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 70, 60));

        btn40.setBackground(new java.awt.Color(0, 204, 0));
        btn40.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn40.setText("C40");
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });
        getContentPane().add(btn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 70, 60));

        btn38.setBackground(new java.awt.Color(0, 204, 0));
        btn38.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn38.setText("C38");
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });
        getContentPane().add(btn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 70, 60));

        btn37.setBackground(new java.awt.Color(0, 204, 0));
        btn37.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn37.setText("C37");
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });
        getContentPane().add(btn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 70, 60));

        btn2.setBackground(new java.awt.Color(0, 204, 0));
        btn2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn2.setText("B02");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 60));

        btn4.setBackground(new java.awt.Color(0, 204, 0));
        btn4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn4.setText("B04");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 60));

        btn1.setBackground(new java.awt.Color(0, 204, 0));
        btn1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn1.setText("A01");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 60, 60));

        btn3.setBackground(new java.awt.Color(0, 204, 0));
        btn3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn3.setText("A03");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 60, 60));

        btn6.setBackground(new java.awt.Color(0, 204, 0));
        btn6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn6.setText("B06");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 60, 60));

        btn8.setBackground(new java.awt.Color(0, 204, 0));
        btn8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn8.setText("B08");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 60, 60));

        btn10.setBackground(new java.awt.Color(0, 204, 0));
        btn10.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn10.setText("B10");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 60, 60));

        btn12.setBackground(new java.awt.Color(0, 204, 0));
        btn12.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn12.setText("B12");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 60, 60));

        btn14.setBackground(new java.awt.Color(0, 204, 0));
        btn14.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn14.setText("B14");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 60, 60));

        btn16.setBackground(new java.awt.Color(0, 204, 0));
        btn16.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn16.setText("B16");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 60, 60));

        btn18.setBackground(new java.awt.Color(0, 204, 0));
        btn18.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn18.setText("B18");
        btn18.setBorder(null);
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        getContentPane().add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 70, 60));

        btn17.setBackground(new java.awt.Color(0, 204, 0));
        btn17.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn17.setText("A17");
        btn17.setBorder(null);
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        getContentPane().add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 70, 60));

        btn15.setBackground(new java.awt.Color(0, 204, 0));
        btn15.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn15.setText("A15");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 60, 60));

        btn13.setBackground(new java.awt.Color(0, 204, 0));
        btn13.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn13.setText("A13");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 60, 60));

        btn11.setBackground(new java.awt.Color(0, 204, 0));
        btn11.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn11.setText("A11");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 60, 60));

        btn9.setBackground(new java.awt.Color(0, 204, 0));
        btn9.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn9.setText("A09");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 60, 60));

        btn7.setBackground(new java.awt.Color(0, 204, 0));
        btn7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn7.setText("A07");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 60, 60));

        btn5.setBackground(new java.awt.Color(0, 204, 0));
        btn5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn5.setText("A05");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 60, 60));

        btn39.setBackground(new java.awt.Color(0, 204, 0));
        btn39.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn39.setText("C39");
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });
        getContentPane().add(btn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 70, 60));

        btn20.setBackground(new java.awt.Color(0, 204, 0));
        btn20.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn20.setText("A20");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        getContentPane().add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 60, 60));

        btn19.setBackground(new java.awt.Color(0, 204, 0));
        btn19.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btn19.setText("B19");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        getContentPane().add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 60, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel3.setText("Nombres");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 50, 130, 17);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 110, 100, 17);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel6.setText("DNI");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 170, 30, 17);

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel16.setText("Pasajero");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(90, 10, 50, 14);

        txtDniPasajero.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDniPasajero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtDniPasajero);
        txtDniPasajero.setBounds(20, 190, 190, 30);

        txtNombrePasajero.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombrePasajero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtNombrePasajero);
        txtNombrePasajero.setBounds(20, 70, 190, 30);

        txtApellidoPasajero.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtApellidoPasajero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtApellidoPasajero);
        txtApellidoPasajero.setBounds(20, 130, 190, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 250, 240));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel19.setText("Detalles del viaje");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(110, 10, 100, 20);

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel20.setText("Asiento");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(170, 110, 100, 17);

        txtHora.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(txtHora);
        txtHora.setBounds(170, 190, 140, 30);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel22.setText("Chofer");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(100, 20, 40, 14);

        jLabel23.setText("Nombres y apellidos");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(10, 60, 100, 14);

        jLabel24.setText("Placa");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(10, 140, 30, 14);
        jPanel6.add(jTextField7);
        jTextField7.setBounds(10, 170, 110, 30);
        jPanel6.add(jTextField8);
        jTextField8.setBounds(10, 90, 210, 30);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 0, 0);

        jLabel25.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel25.setText("Hora");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(170, 170, 30, 17);

        jLabel26.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel26.setText("Fecha de salida");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(10, 170, 100, 17);

        jLabel29.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel29.setText("Origen");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(10, 50, 40, 17);

        txtDestino.setEditable(false);
        txtDestino.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDestino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(txtDestino);
        txtDestino.setBounds(10, 130, 150, 30);

        txtAsiento.setEditable(false);
        txtAsiento.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtAsiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(txtAsiento);
        txtAsiento.setBounds(170, 130, 140, 30);

        txtOrigen.setEditable(false);
        txtOrigen.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtOrigen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(txtOrigen);
        txtOrigen.setBounds(10, 70, 150, 30);

        jLabel28.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel28.setText("Destino");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(10, 110, 100, 17);

        txtFechaSalida.setEditable(false);
        txtFechaSalida.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFechaSalida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(txtFechaSalida);
        txtFechaSalida.setBounds(10, 190, 150, 30);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 320, 240));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel11.setText("Pago");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(80, 10, 30, 20);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel13.setText("Total");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 170, 30, 17);

        txtTotal.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtTotal);
        txtTotal.setBounds(20, 190, 150, 30);

        jLabel27.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel27.setText("Tipo de pago");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(20, 110, 100, 17);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel15.setText("Metodo de pago");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 50, 140, 17);

        cbxTipoPago.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        cbxTipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccione-", "Moneda", "Billete", "-----" }));
        cbxTipoPago.setBorder(null);
        jPanel3.add(cbxTipoPago);
        cbxTipoPago.setBounds(20, 130, 150, 30);

        cbxMetodoDePago.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        cbxMetodoDePago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccione-", "Efectivo", "Transferencia bancaria" }));
        cbxMetodoDePago.setBorder(null);
        jPanel3.add(cbxMetodoDePago);
        cbxMetodoDePago.setBounds(20, 70, 150, 30);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 200, 240));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel8.setText("Chofer");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(100, 10, 40, 14);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel9.setText("Nombres y apellidos");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 50, 180, 17);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel14.setText("Placa");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 110, 70, 17);

        txtPlaca.setEditable(false);
        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPlaca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtPlaca);
        txtPlaca.setBounds(10, 130, 110, 30);

        txtNombreChofer.setEditable(false);
        txtNombreChofer.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreChofer.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreChofer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtNombreChofer);
        txtNombreChofer.setBounds(10, 70, 210, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel10.setText("Chofer");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(100, 20, 40, 14);

        jLabel17.setText("Nombres y apellidos");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(10, 60, 100, 14);

        jLabel18.setText("Placa");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(10, 140, 30, 14);
        jPanel4.add(jTextField3);
        jTextField3.setBounds(10, 170, 110, 30);
        jPanel4.add(jTextField4);
        jTextField4.setBounds(10, 90, 210, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 0, 0);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 250, 240));

        btnRegresar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 130, 40));

        lblUsuario.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 80, 20));

        btnLimpiarDatos.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnLimpiarDatos.setText("LIMPIAR DATOS");
        btnLimpiarDatos.setBorder(null);
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 130, 40));

        jLabel30.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel30.setText("Usuario:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 50, 20));

        txtcarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MEMORIA ROM.jpg"))); // NOI18N
        getContentPane().add(txtcarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 420));

        btnBoleta.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnBoleta.setText("BOLETA");
        btnBoleta.setBorder(null);
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, 130, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        toggleButtonColorAndText(btn21, "B21");
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        toggleButtonColorAndText(btn22, "A22");
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        toggleButtonColorAndText(btn24, "A24");
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        toggleButtonColorAndText(btn25, "B25");
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        toggleButtonColorAndText(btn23, "B23");
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        toggleButtonColorAndText(btn26, "A26");
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        toggleButtonColorAndText(btn28, "A28");
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        toggleButtonColorAndText(btn27, "B27");
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        toggleButtonColorAndText(btn30, "A30");
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        toggleButtonColorAndText(btn29, "B29");
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        toggleButtonColorAndText(btn32, "A32");
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        toggleButtonColorAndText(btn31, "B31");
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        toggleButtonColorAndText(btn34, "A34");
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        toggleButtonColorAndText(btn33, "B33");
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        toggleButtonColorAndText(btn36, "A36");
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        toggleButtonColorAndText(btn35, "B35");
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        toggleButtonColorAndText(btn40, "C40");
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        toggleButtonColorAndText(btn38, "C38");
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        toggleButtonColorAndText(btn37, "C37");
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        toggleButtonColorAndText(btn2, "B02");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        toggleButtonColorAndText(btn4, "B04");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        toggleButtonColorAndText(btn1, "A01");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        toggleButtonColorAndText(btn3, "A03");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        toggleButtonColorAndText(btn6, "B06");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        toggleButtonColorAndText(btn8, "B08");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        toggleButtonColorAndText(btn10, "B10");
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        toggleButtonColorAndText(btn12, "B12");
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        toggleButtonColorAndText(btn14, "B14");
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        toggleButtonColorAndText(btn16, "B16");
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        toggleButtonColorAndText(btn18, "B18");
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        toggleButtonColorAndText(btn17, "A17");
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        toggleButtonColorAndText(btn15, "A15");
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        toggleButtonColorAndText(btn13, "A13");
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        toggleButtonColorAndText(btn11, "A11");
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        toggleButtonColorAndText(btn9, "A09");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        toggleButtonColorAndText(btn7, "A07");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        toggleButtonColorAndText(btn5, "A05");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        toggleButtonColorAndText(btn39, "C39");
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        toggleButtonColorAndText(btn20, "A20");
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        toggleButtonColorAndText(btn19, "B19");
    }//GEN-LAST:event_btn19ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmPrincipal2 frm_principal = new FrmPrincipal2();
        frm_principal.setVisible(false);
        this.dispose();

        //Viaje
        txtAsiento.setText("");

        //Pasajero
        txtApellidoPasajero.setText("");
        txtNombrePasajero.setText("");
        txtDniPasajero.setText("");

        //Pago
        txtTotal.setText("");
        cbxMetodoDePago.setSelectedIndex(0);
        cbxTipoPago.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        //Viaje
        txtAsiento.setText("");

        //Pasajero
        txtApellidoPasajero.setText("");
        txtNombrePasajero.setText("");
        txtDniPasajero.setText("");

        //Pago
        txtTotal.setText("");
        cbxMetodoDePago.setSelectedIndex(0);
        cbxTipoPago.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        try {
            //validacion de cada campo (validar por grupos en un LinkerdhHasMap)
            Map<JTextField, String> validationMap = new LinkedHashMap<>();
            validationMap.put(txtAsiento, "Seleccione un asiento");
            validationMap.put(txtNombrePasajero, "Ingrese el nombre del pasajero");
            validationMap.put(txtApellidoPasajero, "Ingrese el apellido del pasajero");
            validationMap.put(txtDniPasajero, "Ingrese el DNI del pasajero");
            validationMap.put(txtTotal, "Ingrese el total a pagar");

            //mostrar advertenciasi no se agrega
            for (Map.Entry<JTextField, String> entry : validationMap.entrySet()) {
                if (entry.getKey().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, entry.getValue(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            // Validación para cbxMetodoDePago
            if (cbxMetodoDePago.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un método de pago", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

           // Validación para JComboBox cbxTipoPago
            if (cbxTipoPago.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un tipo de pago", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Recopila la información ingresada de la interfaz
            // Datos del chofer
            String placa = txtPlaca.getText();
            String usuario = lblUsuario.getText();

            // Datos del viaje
            String origen = txtOrigen.getText();
            String destino = txtDestino.getText();
            String asiento = txtAsiento.getText();
            String fechaSalida = txtFechaSalida.getText();
            String hora = txtHora.getText();

            // Datos del pasajero
            String apellidoPasajero = txtApellidoPasajero.getText();
            String nombrePasajero = txtNombrePasajero.getText();
            String dniPasajero = txtDniPasajero.getText();

            // Datos del pago
            double total = Double.parseDouble(txtTotal.getText());
            String metodoPago = cbxMetodoDePago.getSelectedItem().toString();
            String tipoPago = cbxTipoPago.getSelectedItem().toString();

            // Almacena los datos en el objeto boleta los que luego se mostraran en la boleta
            boleta.setOrigen(origen);
            boleta.setDestino(destino);
            boleta.setAsiento(asiento);
            boleta.setFechaSalida(fechaSalida);
            boleta.setHora(hora);
            boleta.setPlaca(placa);
            boleta.setApellidoPasajero(apellidoPasajero);
            boleta.setNombrePasajero(nombrePasajero);
            boleta.setDniPasajero(dniPasajero);
            boleta.setMetodoPago(metodoPago);
            boleta.setTipoPago(tipoPago);
            boleta.setTotal(total);
            boleta.setUsuario(usuario);

            FrmBoleta2 frmBoleta = new FrmBoleta2(null, rootPaneCheckingEnabled);
            frmBoleta.setDatos(boleta);
            frmBoleta.setVisible(true);

        } catch (Exception e) {
            System.out.println("0");
        }


    }//GEN-LAST:event_btnBoletaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPasaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPasaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPasaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPasaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPasaje2 dialog = new FrmPasaje2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cbxMetodoDePago;
    private javax.swing.JComboBox cbxTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellidoPasajero;
    private javax.swing.JTextField txtAsiento;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDniPasajero;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombreChofer;
    private javax.swing.JTextField txtNombrePasajero;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtcarro;
    // End of variables declaration//GEN-END:variables
}
