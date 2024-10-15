package Interfaces;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import static javax.swing.BorderFactory.createTitledBorder;

/**
 *
 * @author EiruonzOK
 */
public class frm_Admin extends javax.swing.JFrame {
    String user, nombre_usuario;
    public static int session_usuario;//enviar datos entre interfaces
    /*FondoPanel fondo = new FondoPanel();*/
    public frm_Admin() {
        initComponents();
        user = frm_Login.user;
        session_usuario = 1;//bandera 
        /*setSize(650, 430);*/
        setResizable(true);
        setTitle("Administrador - Sesión " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al ser cerrada el programa dejara de ejecutarla(evita que se ejecute en segundo plano)
        /*setContentPane(fondo);*/
    }
    //cambiar la imagen del logo de la taza 
    //Inicio
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        return retValue;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Menu = new javax.swing.JButton();
        jButton_RegistrarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_Reportes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_AcercaDe = new javax.swing.JButton();
        jButton_Factura = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Menu.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restaurant_menu_96px.png"))); // NOI18N
        jButton_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_MenuMouseExited(evt);
            }
        });
        jButton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 140, 120));

        jButton_RegistrarUsuario.setBackground(new java.awt.Color(255, 255, 102));
        jButton_RegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add_user_male_96px.png"))); // NOI18N
        jButton_RegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RegistrarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RegistrarUsuarioMouseExited(evt);
            }
        });
        jButton_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 120));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrar Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menu ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambiar de cuenta");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Acerca de");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, -1, -1));

        jButton_Reportes.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/statistics_100px.png"))); // NOI18N
        jButton_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_ReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_ReportesMouseExited(evt);
            }
        });
        jButton_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReportesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 140, 120));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar comprobante");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reportes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        jButton_AcercaDe.setBackground(new java.awt.Color(255, 255, 102));
        jButton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man_in_blue_jacket_information_100px.png"))); // NOI18N
        jButton_AcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AcercaDeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_AcercaDeMouseExited(evt);
            }
        });
        jButton_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AcercaDeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 140, 120));

        jButton_Factura.setBackground(new java.awt.Color(255, 255, 102));
        jButton_Factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bill_100px.png"))); // NOI18N
        jButton_Factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_FacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_FacturaMouseExited(evt);
            }
        });
        jButton_Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FacturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, 120));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoDeHome.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 740, 1240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioActionPerformed
       //Cuando el usuario da click en el boton abrira esta  ventana
        frm_RegistrarOpciones ro=new  frm_RegistrarOpciones();
        ro.setVisible(true);    
    }//GEN-LAST:event_jButton_RegistrarUsuarioActionPerformed

    private void jButton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuActionPerformed
       //Cuando el usuario da click en el boton abrira esta  ventana
        frm_Menu menu = new frm_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton_MenuActionPerformed

    private void jButton_FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacturaActionPerformed
       //Cuando el usuario da click en el boton abrira esta  ventana
        frm_BoletaOFactura CV = new frm_BoletaOFactura();
        CV.setVisible(true);
    }//GEN-LAST:event_jButton_FacturaActionPerformed

    private void jButton_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AcercaDeActionPerformed
       //Cuando el usuario da click en el boton abrira esta  ventana
        frm_AcercaDe acerca=new frm_AcercaDe();
        acerca.setVisible(true);
    }//GEN-LAST:event_jButton_AcercaDeActionPerformed

    private void jButton_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReportesActionPerformed
      //Cuando el usuario da click en el boton abrira esta  ventana 
       frm_Reportes rp = new frm_Reportes();
       rp.setVisible(true);
               
    }//GEN-LAST:event_jButton_ReportesActionPerformed

    private void jButton_RegistrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioMouseEntered
        // TODO add your handling code here:
        jButton_RegistrarUsuario.setBackground(new Color(255, 87, 51));
    }//GEN-LAST:event_jButton_RegistrarUsuarioMouseEntered

    private void jButton_RegistrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioMouseExited
        // TODO add your handling code here:
        jButton_RegistrarUsuario.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jButton_RegistrarUsuarioMouseExited

    private void jButton_MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MenuMouseEntered
        // TODO add your handling code here:
        jButton_Menu.setBackground(new Color(255, 87, 51));
    }//GEN-LAST:event_jButton_MenuMouseEntered

    private void jButton_MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MenuMouseExited
        // TODO add your handling code here:
        jButton_Menu.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jButton_MenuMouseExited

    private void jButton_FacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FacturaMouseEntered
        // TODO add your handling code here:
        jButton_Factura.setBackground(new Color(255, 87, 51));
    }//GEN-LAST:event_jButton_FacturaMouseEntered

    private void jButton_FacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FacturaMouseExited
        // TODO add your handling code here:
        jButton_Factura.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jButton_FacturaMouseExited

    private void jButton_ReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ReportesMouseEntered
        // TODO add your handling code here:
        jButton_Reportes.setBackground(new Color(255, 87, 51));
    }//GEN-LAST:event_jButton_ReportesMouseEntered

    private void jButton_ReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ReportesMouseExited
        // TODO add your handling code here:
         jButton_Reportes.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jButton_ReportesMouseExited

    private void jButton_AcercaDeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AcercaDeMouseEntered
        // TODO add your handling code here:
        jButton_AcercaDe.setBackground(new Color(255, 87, 51));
    }//GEN-LAST:event_jButton_AcercaDeMouseEntered

    private void jButton_AcercaDeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AcercaDeMouseExited
        // TODO add your handling code here:
        jButton_AcercaDe.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jButton_AcercaDeMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        frm_Login login = new frm_Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setBackground(Color.green);
        jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
         jLabel1.setBackground(new Color(187,187,187));
         jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseExited

    
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
            java.util.logging.Logger.getLogger(frm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Factura;
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JButton jButton_Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /* class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/FondoDeHome.jpeg")).getImage();
            
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
    class FondoPanel extends JPanel{
        private Image imagen;
        
        public FondoPanel(){
            imagen = new ImageIcon(getClass().getResource("/imagenes/FondoDeHome.jpeg")).getImage();
        }
        
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }*/
    
    
}
