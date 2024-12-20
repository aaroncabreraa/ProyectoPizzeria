/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Cliente;
import Classes.Factura;
import Conector.bd_Conexion;
import Conector.conexion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author EiruonzOK
 */
public class frm_InformacionCliente extends javax.swing.JFrame {

    String user_update = "";
    int ID;

    /**
     * Creates new form frm_InformationCustomer
     */
    public frm_InformacionCliente() {
        initComponents();
        user_update = frm_BuscarClientes.user_update;
        setTitle("Editar Cliente");
        setSize(630,439);//mantener el tamaño de la interfaz para que no se pueda editar
        setResizable(false);//para que no se pueda editar 
        setLocationRelativeTo(null);//centrar la interfaz para cuando se ejecute
        //para evitar que el programa finalice al cerrar la interfaz de registro de usuario
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        try {

            Connection cn = conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from clientes where nombre ='" + user_update + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ID = rs.getInt("idclientes");
                txt_nombre.setText(rs.getString("nombre"));
                txt_dni.setText(rs.getString("dni"));
                txt_ruc.setText(rs.getString("ruc"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_correo.setText(rs.getString("correo"));
                txt_ciudad.setText(rs.getString("ciudad"));
            } else {
                System.out.println("nota");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("error en cargar usuario" + e);
            JOptionPane.showMessageDialog(null, "Error contacte con el Admin");

        }

    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_ruc = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_ciudad = new javax.swing.JTextField();
        btn_Actualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Editar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setText("Dni:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setText("Ruc:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 20));

        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel6.setText("Ciudad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 190, -1));

        txt_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rucKeyTyped(evt);
            }
        });
        getContentPane().add(txt_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 190, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 190, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 190, -1));

        txt_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ciudadKeyTyped(evt);
            }
        });
        getContentPane().add(txt_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 190, -1));

        btn_Actualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Actualizar.setText("Actualizar Cliente");
        btn_Actualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 170, 70));

        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        // TODO add your handling code here:

        String nombre, ruc, correo, ciudad, dni, telefono;
        //Datos Obtenidos de las casillas del diseño de los txt
        // montoTotal =Double.parseDouble(txtPrecioTotal.getText());

        nombre = txt_nombre.getText();
        correo = txt_correo.getText();
        ciudad = txt_ciudad.getText();
        int validacion = 0;
        ruc = txt_ruc.getText();
        dni = txt_dni.getText();
        telefono = txt_telefono.getText();
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        } else {
            txt_nombre.setBackground(Color.white);
        }
        if (ruc.equals("")) {
            txt_ruc.setBackground(Color.red);
            validacion++;
        } else {
            txt_ruc.setBackground(Color.white);
        }
        if (dni.equals("")) {
            txt_dni.setBackground(Color.red);
            validacion++;
        } else {
            txt_ruc.setBackground(Color.white);
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        } else {
            txt_telefono.setBackground(Color.white);
        }
        if (correo.equals("")) {
            txt_correo.setBackground(Color.red);
            validacion++;
        } else {
            txt_correo.setBackground(Color.white);
        }
        if (ciudad.equals("")) {
            txt_ciudad.setBackground(Color.red);
            validacion++;
        } else {
            txt_ciudad.setBackground(Color.white);
        }

        if (validacion == 0) {
            
            try {
                Connection cn = conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "update clientes set nombre=?,dni=?,ruc=?,telefono=?,correo=?,ciudad=?"
                            + "where idclientes = '"+ ID+"'");
                pst.setString(1, nombre);
                pst.setString(2, dni);
                pst.setString(3, ruc);
                pst.setString(4, telefono);
                pst.setString(5, correo);
                pst.setString(6, ciudad);
                pst.executeUpdate();
                
                cn.close();
                JOptionPane.showMessageDialog(null, "Modificacion correcta");
            } catch (Exception e) {
            }
            
            Limpiar();
    }//GEN-LAST:event_btn_ActualizarActionPerformed
    }
    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_ciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ciudadKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ciudadKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        int can = txt_telefono.getText().length();
        int tam = 11;
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || can >= tam) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rucKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        int can = txt_ruc.getText().length();
        int tam = 11;
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || can >= tam) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txt_rucKeyTyped

    private void txt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        int can = txt_dni.getText().length();
        int tam = 8;
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || can >= tam) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txt_dniKeyTyped
  
    

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
            java.util.logging.Logger.getLogger(frm_InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_InformacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_ruc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_nombre.setText("");
        txt_ruc.setText("");
        txt_dni.setText("");
        txt_ciudad.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");

    }
}
