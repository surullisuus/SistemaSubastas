/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import models.Producto;
import models.Subasta;
import servicios.ProductoServices;
import servicios.SubastaServices;

/**
 *
 * @author juand
 */
public class VistaAdministrador extends javax.swing.JFrame {
    ProductoServices objClienteServices= new ProductoServices();
    SubastaServices objSubastaServices= new SubastaServices();
    List<Producto> listaDeClientes= objClienteServices.listarProductos();
    
    /**
     * Creates new form VistaAdministrador
     */
    public VistaAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtAreaListar = new java.awt.TextArea();
        btnListarProductos = new javax.swing.JButton();
        btnRegistrarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSubastar = new javax.swing.JButton();
        btnNoSubastar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCambiarSubasta = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Administrador");

        btnAtras1.setText("Cerrar Sesion");
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAreaListar.setEditable(false);

        btnListarProductos.setText("Listar");
        btnListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProductosActionPerformed(evt);
            }
        });

        btnRegistrarProducto.setText("Agregar");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarProductos)
                    .addComponent(btnRegistrarProducto))
                .addGap(35, 35, 35)
                .addComponent(txtAreaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListarProductos)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarProducto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAreaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSubastar.setText("Subastar");
        btnSubastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubastarActionPerformed(evt);
            }
        });

        btnNoSubastar.setText("No Subastar");
        btnNoSubastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoSubastarActionPerformed(evt);
            }
        });

        jLabel3.setText("Editar Subasta");

        jLabel4.setText("Digite id del producto que desea cambiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(txtIdCambiarSubasta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSubastar)
                        .addGap(79, 79, 79)
                        .addComponent(btnNoSubastar))
                    .addComponent(jLabel4))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdCambiarSubasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubastar)
                    .addComponent(btnNoSubastar))
                .addGap(41, 41, 41))
        );

        btnActualizar.setText("Actualizar");
        btnActualizar.setActionCommand("");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        InicioSesion inicioSesion=new InicioSesion();
        inicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        // TODO add your handling code here:
        InicioSesion inicioSesion=new InicioSesion();
        inicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtras1ActionPerformed
    private static String imprimirProString(Producto cliente){
        return cliente.getNombre()+ "\n"
                + String.valueOf(cliente.getValorOferta())+ "\n\n";
                
    }
    private void btnListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProductosActionPerformed
        // TODO add your handling code here:
        txtAreaListar.setText(" ");
        for (Producto cliente : listaDeClientes) {
            txtAreaListar.append(imprimirProString(cliente));
        }
    }//GEN-LAST:event_btnListarProductosActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        // TODO add your handling code here:
        RegistrarProducto registrarproducto = new RegistrarProducto();
        registrarproducto.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnSubastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubastarActionPerformed
        // TODO add your handling code here:
        
        System.out.println("\n actualizando una subasta");
        Subasta objClienteConsultado=objSubastaServices.consultarSubasta(Integer.valueOf(txtIdCambiarSubasta.getText()));
	Subasta objClienteActualizado= new Subasta();
        objClienteActualizado.setProductId(objClienteConsultado.getProductId());
        objClienteActualizado.setAbierto(true);
        objClienteActualizado.setValorSubasta(objClienteConsultado.getValorSubasta());
        Subasta objClienteAtualizado2=objSubastaServices.actualizarSubasta(objClienteActualizado, Integer.valueOf(txtIdCambiarSubasta.getText()) );
        JOptionPane.showMessageDialog(this, "Se ha abierto una subasta para este producto");
    }//GEN-LAST:event_btnSubastarActionPerformed

    private void btnNoSubastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoSubastarActionPerformed
        // TODO add your handling code here:
        System.out.println("\n actualizando una subasta");
        Subasta objClienteConsultado=objSubastaServices.consultarSubasta(Integer.valueOf(txtIdCambiarSubasta.getText()));
	Subasta objClienteActualizado= new Subasta();
        objClienteActualizado.setProductId(objClienteConsultado.getProductId());
        objClienteActualizado.setAbierto(false);
        objClienteActualizado.setValorSubasta(objClienteConsultado.getValorSubasta());
        Subasta objClienteAtualizado2=objSubastaServices.actualizarSubasta(objClienteActualizado, Integer.valueOf(txtIdCambiarSubasta.getText()) );
        JOptionPane.showMessageDialog(this, "Se ha CERRADO la subasta para este producto");
    }//GEN-LAST:event_btnNoSubastarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        VistaAdministrador vistacliente =new VistaAdministrador();
        vistacliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnListarProductos;
    private javax.swing.JButton btnNoSubastar;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnSubastar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextArea txtAreaListar;
    private javax.swing.JTextField txtIdCambiarSubasta;
    // End of variables declaration//GEN-END:variables
}