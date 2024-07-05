package view;

import model.InfoViaje;
import daoImpl.GestorDeChoferesImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FrmPrincipal2 extends javax.swing.JFrame {

    //JframeInternal enlace
    JfrmInformeVentas oinInformeVentas;
    JfrmHistorial oHistorial;
    JfrmGestionEmpleado oEmpleado;
    JfrmReporteEmpleados oJfrmReporteEmpleados;
    JfrmInfoRutas oInfoRutas;
    JfrmGestionChoferes oChofer;

    //Instancias frmpasajes
    private FrmPasaje2 frmPasajes = new FrmPasaje2(this, rootPaneCheckingEnabled);
    private InfoViaje viaje = new InfoViaje();
    String placa;
    String choferes;

    public FrmPrincipal2(String usuario) {
        initComponents();
        setLocationRelativeTo(null);
        lblUsuario.setText(usuario);
    }

    //gestion choferes a principal
    public void setDatos(String nombre, String placa) {
        txtNombreChofer.setText(nombre);
        txtPlaca.setText(placa);
    }

    public void setUsuario(String usuario) {
        lblUsuario.setText("Usuario: " + usuario);
    }

    //obtener el usuario ingresado en login
    public String getVendedorText() {
        return lblUsuario.getText();

    }

    FrmPrincipal2() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxSede = new javax.swing.JComboBox();
        cbxOrigen = new javax.swing.JComboBox();
        txtFecha = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtNombreChofer = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        cbxDestino = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnChoferes = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro boleta");

        DesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel5.setText("Informacion");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel2.setText("GRUPO EMPRESARIAL DEL CHIRA S.A");

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(246, 255, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel7.setText("Destinos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel9.setText("Sede");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel10.setText("Origen");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel11.setText("Destino");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel12.setText("Fecha");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel13.setText("Hora");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel14.setText("Chofer");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel15.setText("Placa");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        cbxSede.setBackground(new java.awt.Color(247, 243, 243));
        cbxSede.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        cbxSede.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "Piura", "Sullana" }));
        cbxSede.setBorder(null);
        jPanel2.add(cbxSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 30));

        cbxOrigen.setBackground(new java.awt.Color(247, 243, 243));
        cbxOrigen.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        cbxOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "Piura", "Sullana" }));
        cbxOrigen.setBorder(null);
        jPanel2.add(cbxOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 150, 30));

        txtFecha.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 140, 30));

        txtPlaca.setEditable(false);
        txtPlaca.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtPlaca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 30));

        txtNombreChofer.setEditable(false);
        txtNombreChofer.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombreChofer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtNombreChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 320, 30));

        btnIngresar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/angulo-pequeno-derecho.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 40));

        cbxDestino.setBackground(new java.awt.Color(247, 243, 243));
        cbxDestino.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        cbxDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "Piura", "Sullana" }));
        cbxDestino.setBorder(null);
        jPanel2.add(cbxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, 30));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/basura.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 140, 40));

        btnChoferes.setText("SELECCIONAR");
        btnChoferes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoferesActionPerformed(evt);
            }
        });
        jPanel2.add(btnChoferes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 90, 110, 30));

        txtHora.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ACTIVIDAD 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout DesktopPane1Layout = new javax.swing.GroupLayout(DesktopPane1);
        DesktopPane1.setLayout(DesktopPane1Layout);
        DesktopPane1Layout.setHorizontalGroup(
            DesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DesktopPane1Layout.setVerticalGroup(
            DesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        jMenu7.setBackground(new java.awt.Color(255, 255, 255));
        jMenu7.setBorder(null);
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bolsa-de-la-compra.png"))); // NOI18N
        jMenu7.setText("Informe de ventas");
        jMenu7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/estadisticas.png"))); // NOI18N
        jMenuItem3.setText("Informe");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuBar1.add(jMenu7);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setBorder(null);
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/busqueda.png"))); // NOI18N
        jMenu5.setText("Historial de boletos");
        jMenu5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/monedas.png"))); // NOI18N
        jMenuItem2.setText("Historial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuarios-alt.png"))); // NOI18N
        jMenu3.setText("Gestion de empleado");
        jMenu3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/votacion.png"))); // NOI18N
        jMenuItem6.setText("Informacion");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lista.png"))); // NOI18N
        jMenu4.setText("Informacion de rutas");
        jMenu4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coche-alternativo.png"))); // NOI18N
        jMenuItem7.setText("Rutas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            // Obtener la información ingresada
            String origen = cbxOrigen.getSelectedItem().toString();
            String destino = cbxDestino.getSelectedItem().toString();
            String fechaSalida = txtFecha.getText();
            String hora = txtHora.getText();
            String nombre = txtNombreChofer.getText();
            String placa = txtPlaca.getText();
            String usuario = lblUsuario.getText();

            // validar en bloque con un Arraylist
            List<Pair<Object, String>> validacionesPrincipal = new ArrayList<>();

            validacionesPrincipal.add(new Pair<>(cbxSede, "Seleccione sede"));
            validacionesPrincipal.add(new Pair<>(cbxOrigen, "Seleccione origen"));
            validacionesPrincipal.add(new Pair<>(cbxDestino, "Seleccione destino"));
            validacionesPrincipal.add(new Pair<>(fechaSalida, "Ingrese fecha de salida."));
            validacionesPrincipal.add(new Pair<>(hora, "Ingrese hora de viaje"));
            validacionesPrincipal.add(new Pair<>(nombre, "Ingrese un chofer asignado"));
            validacionesPrincipal.add(new Pair<>(placa, "Ingrese placa"));

            // Realizar las validaciones y mostrar mensaje si no se ingresa
            for (Pair<Object, String> validacion : validacionesPrincipal) {
                if (validacion.getKey() instanceof JComboBox) {
                    JComboBox comboBox = (JComboBox) validacion.getKey();
                    if (comboBox.getSelectedIndex() <= 0) {
                        JOptionPane.showMessageDialog(this, validacion.getValue(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    //validacion de llaves
                } else {
                    String value = (String) validacion.getKey();
                    if (value == null || value.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(this, validacion.getValue(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            // Validar si el formato de le fecha ingresada es coreccta "dd/MM/yyyy"
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            boolean fechaValida = true;
            try {
                dateFormat.parse(fechaSalida);
            } catch (ParseException e) {
                fechaValida = false;
            }

            // Validar si el formato de la hora es valido "HH:mm"
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            timeFormat.setLenient(false);
            boolean horaValida = true;
            try {
                timeFormat.parse(hora);
            } catch (ParseException ex) {
                horaValida = false;
            }

            // Realizar las validaciones y mostrar mensaje
            if (!fechaValida) {
                JOptionPane.showMessageDialog(this, "Ingrese una fecha válida en formato dd/MM/yyyy", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (!horaValida) {
                JOptionPane.showMessageDialog(this, "Ingrese una hora válida en formato HH:mm", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // establecer las propiedades para viaje (leer lo ingresado)
            viaje.setDatosViaje(origen, destino, nombre, placa, fechaSalida, hora, usuario);

            // Establecer los datos y mostrar el formulario de pasajes
            frmPasajes.setDatos(viaje);
            frmPasajes.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //ver cuando se abre la ventana desde menu y mostrarlo en el desktop
        try {
            if (oinInformeVentas == null || oinInformeVentas.isClosed()) {
                oinInformeVentas = new JfrmInformeVentas();
                DesktopPane1.add(oinInformeVentas);
                oinInformeVentas.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //ver cuando se abre la ventana desde menu y mostrarlo en el desktop
        try {
            if (oHistorial == null || oHistorial.isClosed()) {
                oHistorial = new JfrmHistorial();
                DesktopPane1.add(oHistorial);
                oHistorial.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("0");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cbxSede.setSelectedIndex(0);
        cbxOrigen.setSelectedIndex(0);
        cbxDestino.setSelectedIndex(0);
        txtFecha.setText("");
        txtNombreChofer.setText("");
        txtPlaca.setText("");
        txtNombreChofer.setText("");
        cbxSede.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //ver cuando se abre la ventana desde menu y mostrarlo en el desktop
        try {
            if (oEmpleado == null || oEmpleado.isClosed()) {
                oEmpleado = new JfrmGestionEmpleado();
                DesktopPane1.add(oEmpleado);
                oEmpleado.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // rutas
        try {
            if (oInfoRutas == null || oInfoRutas.isClosed()) {
                oInfoRutas = new JfrmInfoRutas();
                DesktopPane1.add(oInfoRutas);
                oInfoRutas.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void btnChoferesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoferesActionPerformed
        JfrmGestionChoferes gestionChoferes = new JfrmGestionChoferes(this);
        DesktopPane1.add(gestionChoferes);
        gestionChoferes.setVisible(true);

    }//GEN-LAST:event_btnChoferesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane1;
    private javax.swing.JButton btnChoferes;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbxDestino;
    private javax.swing.JComboBox cbxOrigen;
    private javax.swing.JComboBox cbxSede;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombreChofer;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
