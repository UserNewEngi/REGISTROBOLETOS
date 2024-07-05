package view;

import model.InfoBoleta;
import model.InfoFactura;
import connection.GuardarDatos;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class FrmBoleta2 extends javax.swing.JDialog {

    private FrmPasaje2 frmPasajesReferencia;
    private static int contador = 0;
    
    public FrmBoleta2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actualizarNumeroBoleta();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void setFrmPasajesReferencia(FrmPasaje2 frmPasajes) {
        this.frmPasajesReferencia = frmPasajes;
    }

    private void actualizarNumeroBoleta() {
        lblNumeroBoleta.setText("N°: " + contador);
        contador++;
    }

    public void setVendedorText(String text) {
        lblVendedor.setText(text);
    }

    public void setDatos(InfoBoleta infoBoleta) throws ParseException {
        
        InfoFactura calculo = new InfoFactura(infoBoleta.getTotal());

        String nombreCompletoPasajero = infoBoleta.getNombrePasajero() + " " + infoBoleta.getApellidoPasajero();

        // Datos del chofer
        lblPlaca.setText(infoBoleta.getPlaca());
        lblVendedor.setText(infoBoleta.getUsuario());

        // Datos del viaje
        lblOrigen.setText(infoBoleta.getOrigen());
        lblDestino.setText(infoBoleta.getDestino());
        lblAsiento.setText(infoBoleta.getAsiento());
        lblFecha.setText(infoBoleta.getFechaSalida());
        lblHora.setText(infoBoleta.getHora());

        // Datos del pasajero
        lblDniPasajero.setText(infoBoleta.getDniPasajero());
        lblNombrePasajero.setText(nombreCompletoPasajero);
        lblCliente.setText(nombreCompletoPasajero);

        // Detalles de pago y factura
        lblMetodoPago.setText(infoBoleta.getMetodoPago());
        lblTipoPago.setText(infoBoleta.getTipoPago());

        lblProducto.setText("Pje." + infoBoleta.getOrigen() + "-" + infoBoleta.getDestino());
        String precio = String.format("%.2f", infoBoleta.getTotal());
        lblPrecio.setText(precio);
        lblImporte.setText(precio);
        lblCantidad.setText("1");

        // Detalles de métodos de pago
        lblOpExonerada.setText(precio);
        lblOpInafecta.setText(String.format("%.2f", calculo.getOpInafecta()));
        lblOpGravada.setText(String.format("%.2f", calculo.getSubTotal()));
        lblIGV.setText(String.format("%.2f", calculo.getIGV()));
        lblSubTotal.setText(String.format("%.2f", calculo.getSubTotal()));
        lblTotal.setText(String.format("%.2f", calculo.getTotal()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        lblCantidad = new javax.swing.JLabel();
        lblOpGravada = new javax.swing.JLabel();
        lblOpInafecta = new javax.swing.JLabel();
        lblTipoPago = new javax.swing.JLabel();
        lblOpExonerada = new javax.swing.JLabel();
        lblNumeroBoleta = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        lblAsiento = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblDniPasajero = new javax.swing.JLabel();
        lblNombrePasajero = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblIGV = new javax.swing.JLabel();
        lblMetodoPago = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Boleta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel4.setText("ZONA INDUSTRIAL 2da. ETAPA Mz. SN Lte. 9 PI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel6.setText("Nro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel11.setText("Placa:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel7.setText("BOLETA ELECTRONICA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel13.setText("IMPORTE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel14.setText("PRODUCTO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel15.setText("CNT.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel17.setText("Op.Gravada   S/  :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel18.setText("Sub Total    S/  :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel19.setText("Igv 18%      S/  :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel20.setText("Total        S/  :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel21.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel21.setText("Op.Inafecta  S/  :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel22.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel22.setText("Op.Exonerada S/  :");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel16.setText("PRECIO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel12.setText("Vendedor:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel10.setText("Asiento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel25.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel25.setText("DNI:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jLabel26.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel26.setText("PASAJERO:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel27.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel27.setText("ORIGEN:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel28.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel28.setText("DESTINO:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel9.setText("Fecha y Hora:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel8.setText("PIURA - PIURA - 26 DE OCTUBRE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 380, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 380, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 380, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 380, 30));

        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 380, 10));

        lblCantidad.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 20, 20));

        lblOpGravada.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOpGravada.setText("jLabel31");
        getContentPane().add(lblOpGravada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        lblOpInafecta.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOpInafecta.setText("jLabel31");
        getContentPane().add(lblOpInafecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        lblTipoPago.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblTipoPago.setText("jLabel31");
        getContentPane().add(lblTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 100, 20));

        lblOpExonerada.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOpExonerada.setText("jLabel31");
        getContentPane().add(lblOpExonerada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        lblNumeroBoleta.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblNumeroBoleta.setText("jLabel31");
        getContentPane().add(lblNumeroBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        lblFecha.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblFecha.setText("jLabel31");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        lblPlaca.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblPlaca.setText("jLabel31");
        getContentPane().add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        lblVendedor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblVendedor.setText("jLabel31");
        getContentPane().add(lblVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        lblAsiento.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblAsiento.setText("jLabel31");
        getContentPane().add(lblAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel30.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel30.setText("validarlo en www.nubefact.com/buscar");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 300, -1));

        lblImporte.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblImporte.setText("jLabel31");
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblPrecio.setText("jLabel31");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        lblProducto.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblProducto.setText("jLabel31");
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 130, -1));

        jLabel29.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel29.setText("Representacion Impresa del CPE");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 250, -1));

        lblSubTotal.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblSubTotal.setText("jLabel31");
        getContentPane().add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        lblDniPasajero.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblDniPasajero.setText("jLabel31");
        getContentPane().add(lblDniPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        lblNombrePasajero.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblNombrePasajero.setText("jLabel31");
        getContentPane().add(lblNombrePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));

        lblOrigen.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOrigen.setText("jLabel31");
        getContentPane().add(lblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, -1));

        lblDestino.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblDestino.setText("jLabel31");
        getContentPane().add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        lblCliente.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblCliente.setText("jLabel31");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        lblIGV.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblIGV.setText("jLabel31");
        getContentPane().add(lblIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        lblMetodoPago.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        getContentPane().add(lblMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 230, 20));

        jLabel31.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel31.setText("Tipo Pago:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        lbl21.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lbl21.setText("Metodo Pago:");
        getContentPane().add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        lblTotal.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblTotal.setText("jLabel31");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, -1, -1));

        jLabel24.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel24.setText("Cliente:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setText("EMPRESA DE TRANSPORTE DEL CHIRA S.A");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setText("RUC: 20228323102");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        lblHora.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblHora.setText("jLabel31");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 700));

        jLabel5.setText("ZONA INDUSTRIAL 2da. ETAPA Mz. SN Lte. 9 PI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Restaurar la visibilidad del formulario de pasajes si es necesario
        if (frmPasajesReferencia != null) {
            frmPasajesReferencia.setVisible(true);
        }

        // Ocultar este formulario
        this.setVisible(false);

        // Recolectar la información ingresada en el formulario
        String numeroBoleta = lblNumeroBoleta.getText();
        String fechaText = lblFecha.getText();
        String horaText = lblHora.getText();
        String asientoStr = lblAsiento.getText();
        String vendedor = lblVendedor.getText();
        String placa = lblPlaca.getText();
        String tipoPago = lblTipoPago.getText();
        String metodoPago = lblMetodoPago.getText();
        String cliente = lblCliente.getText();
        String dni = lblDniPasajero.getText();
        String origen = lblOrigen.getText();
        String destino = lblDestino.getText();

//Suponemos que tienes campos para el detalle de la boleta
        String producto = lblProducto.getText();
        //cambiar a formato aceptado en sql server
        float precio = (float) Double.parseDouble(lblPrecio.getText().replace(',', '.'));
        float importe = (float) Double.parseDouble(lblImporte.getText().replace(',', '.'));
        String tipoOperacion = lblOpExonerada.getText() + "-" + lblOpInafecta.getText() + "-" + lblOpGravada.getText() + "-" + lblSubTotal.getText() + "-" + lblIGV.getText();
        float monto = (float) Double.parseDouble(lblTotal.getText().replace(',', '.'));
        
        
        // Inicialización de la variable para almacenar el ID de la boleta
        int boletaId = -1;
        int asientoNum = 0;
        try {

            asientoNum = Integer.parseInt(asientoStr.substring(1));

            // Llamada al método guardarBoleta con los tipos de datos correctos
            boletaId = GuardarDatos.guardarBoleta(numeroBoleta, metodoPago, tipoPago, origen, destino, asientoNum, horaText, fechaText, vendedor, cliente, dni, placa);
            

            if (boletaId != -1) {  // si el ID es diferente de -1, se ha creado la boleta con éxito
                
                boletaId = GuardarDatos.reportesVentas(producto, precio, importe, tipoOperacion, monto, fechaText);

            } else {
                JOptionPane.showMessageDialog(this, "Error al obtener el ID de la boleta después de guardar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ParseException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FrmBoleta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBoleta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBoleta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBoleta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmBoleta2 dialog = new FrmBoleta2(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lblAsiento;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblDniPasajero;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIGV;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblMetodoPago;
    private javax.swing.JLabel lblNombrePasajero;
    private javax.swing.JLabel lblNumeroBoleta;
    private javax.swing.JLabel lblOpExonerada;
    private javax.swing.JLabel lblOpGravada;
    private javax.swing.JLabel lblOpInafecta;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTipoPago;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVendedor;
    // End of variables declaration//GEN-END:variables
}
