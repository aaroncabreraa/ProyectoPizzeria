/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conector.conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author EiruonzOK
 */
public class frm_ClientesBuscDesc extends javax.swing.JFrame {

    /**
     * Creates new form frm_ChooseCustomersOption
     */
    public frm_ClientesBuscDesc() {
        initComponents();
        setTitle("Elegir Opcion");
        setSize(400,199);//mantener el tamaño de la interfaz para que no se pueda editar
        setResizable(true);//para que no se pueda editar 
        setResizable(true);
        setLocationRelativeTo(null);//centrar la interfaz para cuando se ejecute
        //para evitar que el programa finalice al cerrar la interfaz de registro de usuario
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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
        cmbMesero = new javax.swing.JComboBox<>();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elige una opción");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        cmbMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------------------", "Buscar Clientes", "Descargar Clientes" }));
        cmbMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMeseroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opcionR.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMeseroActionPerformed
        // TODO add your handling code here:
        int cmb;
        cmb = cmbMesero.getSelectedIndex()+1;
        if (cmb==2) {
            frm_BuscarClientes sw =new frm_BuscarClientes();
            sw.setVisible(true);
        }else if (cmb==3) {
           try {
            conexion con = new conexion();
            Connection conn = con.Conectar();

            JasperReport reporte = null;
            String path = "src\\reportes\\Clientes.jasper";

            /*reporte = (JasperReport) JRLoader.loadObjectFromFile(path);*/
            reporte = (JasperReport) JRLoader.loadObject(path);
            //llenado del reporte 
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
            //vista del reporte
            JasperViewer view = new JasperViewer(jprint, false);
            //para que se cierrecuando se preciona el boton X
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(frm_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_cmbMeseroActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ClientesBuscDesc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ClientesBuscDesc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ClientesBuscDesc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ClientesBuscDesc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ClientesBuscDesc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbMesero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}