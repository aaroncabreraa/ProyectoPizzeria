package Interfaces;
import Classes.Cargar;
import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author EiruonzOK
 */
public class frm_ImagenDInicio extends javax.swing.JFrame {

    Cargar hilo;
    
    public frm_ImagenDInicio() {
        initComponents();
        iniciar();
        
        setSize(608,400);
        setResizable(false);
        setTitle("Cargando...");
        setLocationRelativeTo(null);
         
    }

//////    //cambiar la imagen del logo de la taza 
//////    //Inicio 
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/atilatinos.jpeg"));
       return retValue;
    }
    public void iniciar() {
        setLocationRelativeTo(null);
        hilo = new Cargar(getProgress());
        hilo.start();
        hilo = null;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 610, 40));

        progress.setBackground(new java.awt.Color(204, 0, 0));
        progress.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progressStateChanged(evt);
            }
        });
        getContentPane().add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 610, 25));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevoBienvenido.jpeg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, -40, 910, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progressStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progressStateChanged
        if (progress.getValue() == 100) {

            frm_Login login = new frm_Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_progressStateChanged

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
            java.util.logging.Logger.getLogger(frm_ImagenDInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ImagenDInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ImagenDInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ImagenDInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ImagenDInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables


    /**
     * @return the progress
     */
    public javax.swing.JProgressBar getProgress() {
        return progress;
    }
}
