package Interfaces;
import Classes.Bebidas;
import Classes.Carta;
import Classes.Platos;
import Conector.bd_Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author EiruonzOK
 */
public class frm_Menu extends javax.swing.JFrame {

   
    public frm_Menu() {
        initComponents();
        setSize(694,794);
        setResizable(false);
        setTitle("Menu");
        setLocationRelativeTo(null);
        //para evitar que el programa finalice al cerrar la interfaz de registro de usuario
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
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

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox_Peperoni = new javax.swing.JComboBox<>();
        jComboBox_Hawaiana = new javax.swing.JComboBox<>();
        jComboBox_Champinones = new javax.swing.JComboBox<>();
        jComboBox_PepChamp = new javax.swing.JComboBox<>();
        jComboBox_Queso = new javax.swing.JComboBox<>();
        jComboBox_Suprema = new javax.swing.JComboBox<>();
        jComboBox_OrillaQueso = new javax.swing.JComboBox<>();
        jComboBox_CF = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox_JNaranja = new javax.swing.JComboBox<>();
        jComboBox_JManzana = new javax.swing.JComboBox<>();
        jComboBox_JUva = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox_RINV = new javax.swing.JComboBox<>();
        jComboBox_R2LTS = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jComboBox_ASabor = new javax.swing.JComboBox<>();
        jComboBox_ANatural = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PIZZA PEPERONI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("$70");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PIZZA HAWAIANA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("$90");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PIZZA CHAMPIÑONES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$ 80");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PIZZA PEPERONI CHAMP");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 200, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("$120");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("PIZZA QUESO");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("$90");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PIZZA SUPREMA");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("$150");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PIZZA ORILLA DE QUESO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("$130");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PIZZA CARNES FRIAS");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("$150");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

        jComboBox_Peperoni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_Peperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jComboBox_Hawaiana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_Hawaiana, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jComboBox_Champinones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_Champinones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jComboBox_PepChamp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_PepChamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        jComboBox_Queso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_Queso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jComboBox_Suprema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_Suprema, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        jComboBox_OrillaQueso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_OrillaQueso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, -1));

        jComboBox_CF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(jComboBox_CF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("PIZZAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("BEBIDAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("JUGOS");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("NARANJA");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("MANZANA");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("UVA");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("$20");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("$15");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("$15");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        jComboBox_JNaranja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_JNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jComboBox_JManzana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_JManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        jComboBox_JUva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_JUva, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("REFRESCOS");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("INDIVIDUAL");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("2 LITROS");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("$15");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("$30");
        jLabel37.setToolTipText("");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, 20));

        jComboBox_RINV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_RINV, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));

        jComboBox_R2LTS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_R2LTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("AGUAS");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("SABOR");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("NATURAL");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, -1));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("$25");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, -1, 20));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("$10");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, -1, 20));

        jComboBox_ASabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_ASabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, -1));

        jComboBox_ANatural.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        getContentPane().add(jComboBox_ANatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("TERMINAR ORDEN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 160, 30));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //variables para recuperar datos
        String txt = "";
        int comboBox=0,comboBox1=0,comboBox2=0,comboBox3=0,comboBox4=0,comboBox5=0,comboBox6=0,comboBox7=0;
        int comboBox8=0,comboBox9=0,comboBox10=0,comboBox11=0,comboBox12=0,comboBox13=0,comboBox14=0;
        int cantidad = 0;
        double precio= 0;
        double monto= 0;
        int numerocarta=0;     
        Platos platos1 = new Platos();
        Carta carta1 = new Carta();
        Platos platos2 = new Platos();
        Carta carta2 = new Carta();
        Platos platos3 = new Platos();
        Carta carta3 = new Carta();
        Platos platos4 = new Platos();
        Carta carta4 = new Carta();
        Platos platos5 = new Platos();
        Carta carta5 = new Carta();
        Platos platos6 = new Platos();
        Carta carta6 = new Carta();
        Platos platos7 = new Platos();
        Carta carta7 = new Carta();
        Platos platos8 = new Platos();
        Carta carta8 = new Carta();
        Bebidas bebida1 = new Bebidas();
        Carta carta9 = new Carta ();
        Bebidas bebida2 = new Bebidas();
        Carta carta10 = new Carta ();
        Bebidas bebida3 = new Bebidas();
        Carta carta11 = new Carta ();
        Bebidas bebida4 = new Bebidas();
        Carta carta12 = new Carta ();
        Bebidas bebida5 = new Bebidas();
        Carta carta13 = new Carta ();
        Bebidas bebida6 = new Bebidas();
        Carta carta14 = new Carta ();
        Bebidas bebida7 = new Bebidas();
        Carta carta15 = new Carta ();
        //se obtiene el indice del comboBox
        if(jComboBox_Peperoni.getSelectedIndex()> 0){
            comboBox= jComboBox_Peperoni.getSelectedIndex();
            if (comboBox==1) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 1;
                precio = 70;
                int numero = 1;
            } else if (comboBox==2) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 2;
                precio = 70;
            }else if (comboBox==3) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 3;
                precio = 70;
            }else if (comboBox==4) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 4;
                precio = 70;
            }else if (comboBox==5) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 5;
                precio = 70;
            }
            else if (comboBox==6) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 6;
                precio = 70;
            }else if (comboBox==7) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 7;
                precio = 70;
            }else if (comboBox==8) {
                txt = "PIZZA DE PEPERONI";
                cantidad = 8;
                precio = 70;
            }
            //ingresando datos a la clase
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            //iNGRESANDO DATOS A LA CLASE
            platos1.setDescripcion(txt);
            carta1.setDescripcion(txt);
            platos1.setCantidad(cantidad);
            carta1.setCantidad(cantidad);
            platos1.setPrecio(precio);
            carta1.setPrecio(precio);
            platos1.setMonto(monto);
            carta1.setMonto(monto);
            if ( con.insertarPlato(platos1)&con.insertarPedido(carta1) ) {
                //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //segundo comboBOx
        if(jComboBox_Hawaiana.getSelectedIndex()>0){
            comboBox1= jComboBox_Hawaiana.getSelectedIndex();
            if (comboBox1==1) {
                txt = "PIZZA HAWAIANA";
                cantidad = 1;
                precio = 90;
            } else if (comboBox1==2) {
                txt = "PIZZA HAWAIANA";
                cantidad = 2;
                precio = 90;
            }else if (comboBox1==3) {
                txt = "PIZZA HAWAIANA";
                cantidad = 3;
                precio = 90;
            }else if (comboBox1==4) {
                txt = "PIZZA HAWAIANA";
                cantidad = 4;
                precio = 90;
            }else if (comboBox1==5) {
                txt = "PIZZA HAWAIANA";
                cantidad = 5;
                precio = 90;
            }
            else if (comboBox1==6) {
                txt = "PIZZA HAWAIANA";
                cantidad = 6;
                precio = 90;
            }else if (comboBox1==7) {
                txt = "PIZZA HAWAIANA";
                cantidad = 7;
                precio = 90;
            }else if (comboBox1==8) {
                txt = "PIZZA HAWAIANA";
                cantidad = 8;
                precio = 90;
            }

            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos2.setDescripcion(txt);
            carta2.setDescripcion(txt);
            platos2.setCantidad(cantidad);
            carta2.setCantidad(cantidad);
            platos2.setPrecio(precio);
            carta2.setPrecio(precio);
            platos2.setMonto(monto);
            carta2.setMonto(monto);
            if ( con.insertarPlato(platos2)&con.insertarPedido(carta2) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //tercer combobox
        if(jComboBox_Champinones.getSelectedIndex()>0){
            comboBox2= jComboBox_Champinones.getSelectedIndex();
            if (comboBox2==1) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 1;
                precio = 80;
            } else if (comboBox2==2) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 2;
                precio = 80;
            }else if (comboBox2==3) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 3;
                precio = 80;
            }else if (comboBox2==4) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 4;
                precio = 80;
            }else if (comboBox2==5) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 5;
                precio = 80;
            }
            else if (comboBox2==6) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 6;
                precio = 80;
            }else if (comboBox2==7) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 7;
                precio = 80;
            }else if (comboBox2==8) {
                txt = "PIZZA DE CHAMPIÑONES";
                cantidad = 8;
                precio = 80;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos3.setDescripcion(txt);
            carta3.setDescripcion(txt);
            platos3.setCantidad(cantidad);
            carta3.setCantidad(cantidad);
            platos3.setPrecio(precio);
            carta3.setPrecio(precio);
            platos3.setMonto(monto);
            carta3.setMonto(monto);
            if ( con.insertarPlato(platos3)&con.insertarPedido(carta3) ) {
               //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //cuarto combobox
        if(jComboBox_PepChamp.getSelectedIndex()>0){
            comboBox3=jComboBox_PepChamp.getSelectedIndex();
            if (comboBox3==1) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 1;
                precio = 120;
            } else if (comboBox3==2) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 2;
                precio = 120;
            }else if (comboBox3==3) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 3;
                precio = 120;
            }else if (comboBox3==4) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 4;
                precio = 120;
            }else if (comboBox3==5) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 5;
                precio = 120;
            }
            else if (comboBox3==6) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 6;
                precio = 120;
            }else if (comboBox3==7) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 7;
                precio = 120;
            }else if (comboBox3==8) {
                txt = "PIZZA PEPERONI CHAMP";
                cantidad = 8;
                precio = 120;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos4.setDescripcion(txt);
            carta4.setDescripcion(txt);
            platos4.setCantidad(cantidad);
            carta4.setCantidad(cantidad);
            platos4.setPrecio(precio);
            carta4.setPrecio(precio);
            platos4.setMonto(monto);
            carta4.setMonto(monto);
            if ( con.insertarPlato(platos4)&con.insertarPedido(carta4) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //quinto combobox
        if(jComboBox_Queso.getSelectedIndex()>0){
            comboBox4=jComboBox_Queso.getSelectedIndex();
            if (comboBox4==1) {
                txt = "PIZZA DE QUESO";
                cantidad = 1;
                precio = 90;
            } else if (comboBox4==2) {
                txt = "PIZZA DE QUESO";
                cantidad = 2;
                precio = 90;
            }else if (comboBox4==3) {
                txt = "PIZZA DE QUESO";
                cantidad = 3;
                precio = 90;
            }else if (comboBox4==4) {
                txt = "PIZZA DE QUESO";
                cantidad = 4;
                precio = 90;
            }else if (comboBox4==5) {
                txt = "PIZZA DE QUESO";
                cantidad = 5;
                precio = 90;
            }
            else if (comboBox4==6) {
                txt = "PIZZA DE QUESO";
                cantidad = 6;
                precio = 90;
            }else if (comboBox4==7) {
                txt = "PIZZA DE QUESO";
                cantidad = 7;
                precio = 90;
            }else if (comboBox4==8) {
                txt = "PIZZA DE QUESO";
                cantidad = 8;
                precio = 90;
            }
        //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos5.setDescripcion(txt);
            carta5.setDescripcion(txt);
            platos5.setCantidad(cantidad);
            carta5.setCantidad(cantidad);
            platos5.setPrecio(precio);
            carta5.setPrecio(precio);
            platos5.setMonto(monto);
            carta5.setMonto(monto);
            if ( con.insertarPlato(platos5)&con.insertarPedido(carta5) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //sexto combobox
        if(jComboBox_Suprema.getSelectedIndex()>0){
            comboBox5=jComboBox_Suprema.getSelectedIndex();
            if (comboBox5==1) {
                txt = "PIZZA SUPREMA";
                cantidad = 1;
                precio = 150;
            } else if (comboBox5==2) {
                txt = "PIZZA SUPREMA";
                cantidad = 2;
                precio = 150;
            }else if (comboBox5==3) {
                txt = "PIZZA SUPREMA";
                cantidad = 3;
                precio = 150;
            }else if (comboBox5==4) {
                txt = "PIZZA SUPREMA";
                cantidad = 4;
                precio = 150;
            }else if (comboBox5==5) {
                txt = "PIZZA SUPREMA";
                cantidad = 5;
                precio = 150;
            }
            else if (comboBox5==6) {
                txt = "PIZZA SUPREMA";
                cantidad = 6;
                precio = 150;
            }else if (comboBox5==7) {
                txt = "PIZZA SUPREMA";
                cantidad = 7;
                precio = 150;
            }else if (comboBox5==8) {
                txt = "PIZZA SUPREMA";
                cantidad = 8;
                precio = 150;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos6.setDescripcion(txt);
            carta6.setDescripcion(txt);
            platos6.setCantidad(cantidad);
            carta6.setCantidad(cantidad);
            platos6.setPrecio(precio);
            carta6.setPrecio(precio);
            platos6.setMonto(monto);
            carta6.setMonto(monto);
            if ( con.insertarPlato(platos6)&con.insertarPedido(carta6) ) {
                //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //septimo combobox
        if(jComboBox_OrillaQueso.getSelectedIndex()>0){
            comboBox6=jComboBox_OrillaQueso.getSelectedIndex();
            if (comboBox6==1) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 1;
                precio = 130;
            } else if (comboBox6==2) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 2;
                precio = 130;
            }else if (comboBox6==3) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 3;
                precio = 130;
            }else if (comboBox6==4) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 4;
                precio = 130;
            }else if (comboBox6==5) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 5;
                precio = 130;
            }
            else if (comboBox6==6) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 6;
                precio = 130;
            }else if (comboBox6==7) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 7;
                precio = 130;
            }else if (comboBox6==8) {
                txt = "PIZZA ORILLA DE QUESO";
                cantidad = 8;
                precio = 130;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            carta7.setNumerocarta(numerocarta);
            platos7.setDescripcion(txt);
            carta7.setDescripcion(txt);
            platos7.setCantidad(cantidad);
            carta7.setCantidad(cantidad);
            platos7.setPrecio(precio);
            carta7.setPrecio(precio);
            platos7.setMonto(monto);
            carta7.setMonto(monto);
            if ( con.insertarPlato(platos7)&con.insertarPedido(carta7) ) {
               // JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //octavo combobox
        if(jComboBox_CF.getSelectedIndex()>0){
            comboBox7=jComboBox_CF.getSelectedIndex();
            if (comboBox7==1) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 1;
                precio = 150;
            } else if (comboBox7==2) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 2;
                precio = 150;
            }else if (comboBox7==3) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 3;
                precio = 150;
            }else if (comboBox7==4) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 4;
                precio = 150;
            }else if (comboBox7==5) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 5;
                precio = 150;
            }
            else if (comboBox7==6) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 6;
                precio = 150;
            }else if (comboBox7==7) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 7;
                precio = 150;
            }else if (comboBox7==8) {
                txt = "PIZZA CARNES FRIAS";
                cantidad = 8;
                precio = 150;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto = cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            platos8.setDescripcion(txt);
            carta8.setDescripcion(txt);
            platos8.setCantidad(cantidad);
            carta8.setCantidad(cantidad);
            platos8.setPrecio(precio);
            carta8.setPrecio(precio);
            platos8.setMonto(monto);
            carta8.setMonto(monto);
            if ( con.insertarPlato(platos8)&con.insertarPedido(carta8) ) {
                //JOptionPane.showMessageDialog(null, "Plato Registrado corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }     
        }
        //noveno combobox
        if(jComboBox_JNaranja.getSelectedIndex()>0){
            comboBox8=jComboBox_JNaranja.getSelectedIndex();
            if (comboBox8==1) {
                txt = "JUGO DE NARANJA";
                cantidad = 1;
                precio = 20;
            } else if (comboBox8==2) {
                txt = "JUGO DE NARANJA";
                cantidad = 2;
                precio = 20;
            }else if (comboBox8==3) {
                txt = "JUGO DE NARANJA";
                cantidad = 3;
                precio = 20;
            }else if (comboBox8==4) {
                txt = "JUGO DE NARANJA";
                cantidad = 4;
                precio = 20;
            }else if (comboBox8==5) {
                txt = "JUGO DE NARANJA";
                cantidad = 5;
                precio = 20;
            }
            else if (comboBox8==6) {
                txt = "JUGO DE NARANJA";
                cantidad = 6;
                precio = 20;
            }else if (comboBox8==7) {
                txt = "JUGO DE NARANJA";
                cantidad = 7;
                precio = 20;
            }else if (comboBox8==8) {
                txt = "JUGO DE NARANJA";
                cantidad = 8;
                precio = 20;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida1.setDescripcion(txt);
            carta9.setDescripcion(txt);
            bebida1.setCantidad(cantidad);
            carta9.setCantidad(cantidad);
            bebida1.setPrecio(precio);
            carta9.setPrecio(precio);
            bebida1.setMonto(monto);
            carta9.setMonto(monto);
            if (con.insertarBebida(bebida1)&con.insertarPedido(carta9) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //decimo combobox
        if(jComboBox_JManzana.getSelectedIndex()>0){
            comboBox9=jComboBox_JManzana.getSelectedIndex();
            if (comboBox9==1) {
                txt = "JUGO DE MANZANA";
                cantidad = 1;
                precio = 15;
            } else if (comboBox9==2) {
                txt = "JUGO DE MANZANA";
                cantidad = 2;
                precio = 15;
            }else if (comboBox9==3) {
                txt = "JUGO DE MANZANA";
                cantidad = 3;
                precio = 15;
            }else if (comboBox9==4) {
                txt = "JUGO DE MANZANA";
                cantidad = 4;
                precio = 15;
            }else if (comboBox9==5) {
                txt = "JUGO DE MANZANA";
                cantidad = 5;
                precio = 15;
            }
            else if (comboBox9==6) {
                txt = "JUGO DE MANZANA";
                cantidad = 6;
                precio = 15;
            }else if (comboBox9==7) {
                txt = "JUGO DE MANZANA";
                precio = 15;
                cantidad = 7;
            }else if (comboBox9==8) {
                txt = "JUGO DE MANZANA";
                cantidad = 8;
                precio = 15;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida2.setDescripcion(txt);
            carta10.setDescripcion(txt);
            bebida2.setCantidad(cantidad);
            carta10.setCantidad(cantidad);
            bebida2.setPrecio(precio);
            carta10.setPrecio(precio);
            bebida2.setMonto(monto);
            carta10.setMonto(monto);
            if (con.insertarBebida(bebida2)&con.insertarPedido(carta10) ) {
               // JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //onceavo combobox
        if(jComboBox_JUva.getSelectedIndex()>0){
            comboBox10=jComboBox_JUva.getSelectedIndex();
            if (comboBox10==1) {
                txt = "JUGO DE UVA";
                cantidad = 1;
                precio = 15;
            } else if (comboBox10==2) {
                txt = "JUGO DE UVA";
                cantidad = 2;
                precio = 15;
            }else if (comboBox10==3) {
                txt = "JUGO DE UVA";
                cantidad = 3;
                precio = 15;
            }else if (comboBox10==4) {
                txt = "JUGO DE UVA";
                precio = 15;
                cantidad = 4;
            }else if (comboBox10==5) {
                txt = "JUGO DE UVA";
                cantidad = 5;
                precio = 15;
            }
            else if (comboBox10==6) {
                txt = "JUGO DE UVA";
                cantidad = 6;
                precio = 15;
            }else if (comboBox10==7) {
                txt = "JUGO DE UVA";
                cantidad = 7;
                precio = 15;
            }else if (comboBox10==8) {
                txt = "JUGO DE UVA";
                cantidad = 8;
                precio = 15;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida3.setDescripcion(txt);
            carta11.setDescripcion(txt);
            bebida3.setCantidad(cantidad);
            carta11.setCantidad(cantidad);
            bebida3.setPrecio(precio);
            carta11.setPrecio(precio);
            bebida3.setMonto(monto);
            carta11.setMonto(monto);
            if (con.insertarBebida(bebida3)&con.insertarPedido(carta11) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //doceavo combobox
        if(jComboBox_RINV.getSelectedIndex()>0){
            comboBox11=jComboBox_RINV.getSelectedIndex();
            if (comboBox11==1) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 1;
                precio = 15;
            } else if (comboBox11==2) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 2;
                precio = 15;
            }else if (comboBox11==3) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 3;
                precio = 15;
            }else if (comboBox11==4) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 4;
                precio = 15;
            }else if (comboBox11==5) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 5;
                precio = 15;
            }
            else if (comboBox11==6) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 6;
                precio = 15;
            }else if (comboBox11==7) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 7;
                precio = 15;
            }else if (comboBox11==8) {
                txt = "REFRESCO INDIVIDUAL";
                cantidad = 8;
                precio = 15;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida4.setDescripcion(txt);
            carta12.setDescripcion(txt);
            bebida4.setCantidad(cantidad);
            carta12.setCantidad(cantidad);
            bebida4.setPrecio(precio);
            carta12.setPrecio(precio);
            bebida4.setMonto(monto);
            carta12.setMonto(monto);
            if (con.insertarBebida(bebida4)&con.insertarPedido(carta12) ) {
              //  JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //treceavo combobox
        if(jComboBox_R2LTS.getSelectedIndex()>0){
            comboBox12=jComboBox_R2LTS.getSelectedIndex();
            if (comboBox12==1) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 1;
                precio = 30;
            } else if (comboBox12==2) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 2;
                precio = 30;
            }else if (comboBox12==3) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 3;
                precio = 30;
            }else if (comboBox12==4) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 4;
                precio = 30;
            }else if (comboBox12==5) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 5;
                precio = 30;
            }
            else if (comboBox12==6) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 6;
                precio = 30;
            }else if (comboBox12==7) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 7;
                precio = 30;
            }else if (comboBox12==8) {
                txt = "REFRESCO DE 2 LITROS";
                cantidad = 8;
                precio = 30;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida5.setDescripcion(txt);
            carta13.setDescripcion(txt);
            bebida5.setCantidad(cantidad);
            carta13.setCantidad(cantidad);
            bebida5.setPrecio(precio);
            carta13.setPrecio(precio);
            bebida5.setMonto(monto);
            carta13.setMonto(monto);
            if (con.insertarBebida(bebida5)&con.insertarPedido(carta13) ) {
               // JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //catorceavo combobox
        if(jComboBox_ASabor.getSelectedIndex()>0){
            comboBox13=jComboBox_ASabor.getSelectedIndex();
            if (comboBox13==1) {
                txt = "AGUA DE SABOR";
                cantidad = 1;
                precio = 25;
            } else if (comboBox13==2) {
                txt = "AGUA DE SABOR";
                cantidad = 2;
                precio =25;
            }else if (comboBox13==3) {
                txt = "AGUA DE SABOR";
                cantidad = 3;
                precio = 25;
            }else if (comboBox13==4) {
                txt = "AGUA DE SABOR";
                cantidad = 4;
                precio = 25;
            }else if (comboBox13==5) {
                txt = "AGUA DE SABOR";
                cantidad = 5;
                precio = 25;
            }
            else if (comboBox13==6) {
                txt = "AGUA DE SABOR";
                cantidad = 6;
                precio = 25;
            }else if (comboBox13==7) {
                txt = "AGUA DE SABOR";
                cantidad = 7;
                precio = 25;
            }else if (comboBox13==8) {
                txt = "AGUA DE SABOR";
                cantidad = 8;
                precio = 25;
            }
            //iNGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida6.setDescripcion(txt);
            carta14.setDescripcion(txt);
            bebida6.setCantidad(cantidad);
            carta14.setCantidad(cantidad);
            bebida6.setPrecio(precio);
            carta14.setPrecio(precio);
            bebida6.setMonto(monto);
            carta14.setMonto(monto);
            if (con.insertarBebida(bebida6)&con.insertarPedido(carta14) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //quinceavo combobox
        if(jComboBox_ANatural.getSelectedIndex()>0){
            comboBox14=jComboBox_ANatural.getSelectedIndex();
            if (comboBox14==1) {
                txt = "AGUA NATURAL";
                cantidad = 1;
                precio = 10;
            } else if (comboBox14==2) {
                txt = "AGUA NATURAL";
                cantidad = 2;
                precio = 10;
            }else if (comboBox14==3) {
                txt = "AGUA NATURAL";
                cantidad = 3;
                precio =10;
            }else if (comboBox14==4) {
                txt = "AGUA NATURAL";
                cantidad = 4;
                precio = 10;
            }else if (comboBox14==5) {
                txt = "AGUA NATURAL";
                cantidad = 5;
                precio = 10;
            }
            else if (comboBox14==6) {
                txt = "AGUA NATURAL";
                cantidad = 6;
                precio = 10;
            }else if (comboBox14==7) {
                txt = "AGUA NATURAL";
                cantidad = 7;
                precio = 10;
            }else if (comboBox14==8) {
                txt = "AGUA NATURAL";
                cantidad = 8;
                precio = 10;
            } 
            //INGRESANDO DATOS A LA CLASE
            monto=cantidad*precio;
            bd_Conexion con = new bd_Conexion();
            bebida7.setDescripcion(txt);
            carta15.setDescripcion(txt);
            bebida7.setCantidad(cantidad);
            carta15.setCantidad(cantidad);
            bebida7.setPrecio(precio);
            carta15.setPrecio(precio);
            bebida7.setMonto(monto);
            carta15.setMonto(monto);
            if (con.insertarBebida(bebida7)&con.insertarPedido(carta15) ) {
                //JOptionPane.showMessageDialog(null, "Bebida Registrada corecctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        if (comboBox==0 && comboBox1==0 && comboBox2==0 && comboBox3==0 && comboBox4==0 && comboBox5==0 && comboBox6==0 && comboBox7==0
                && comboBox8==0 && comboBox9==0 && comboBox10==0 && comboBox11==0 && comboBox12==0 && comboBox13==0 && comboBox14==0) {
            JOptionPane.showMessageDialog(null, "NO PUEDES TERMINAR COMPRA SIN HABER ELEGIDO ALGUN PLATO/BEBIDA DEL MENU");
        }else{
            JOptionPane.showMessageDialog(null, "Pedido Registrado Correctamente");
            frm_OpcionesOrden orden = new frm_OpcionesOrden();
            orden.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
         jButton1.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        
         jButton1.setBackground(new Color(60,63,65));
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_ANatural;
    private javax.swing.JComboBox<String> jComboBox_ASabor;
    private javax.swing.JComboBox<String> jComboBox_CF;
    private javax.swing.JComboBox<String> jComboBox_Champinones;
    private javax.swing.JComboBox<String> jComboBox_Hawaiana;
    private javax.swing.JComboBox<String> jComboBox_JManzana;
    private javax.swing.JComboBox<String> jComboBox_JNaranja;
    private javax.swing.JComboBox<String> jComboBox_JUva;
    private javax.swing.JComboBox<String> jComboBox_OrillaQueso;
    private javax.swing.JComboBox<String> jComboBox_PepChamp;
    private javax.swing.JComboBox<String> jComboBox_Peperoni;
    private javax.swing.JComboBox<String> jComboBox_Queso;
    private javax.swing.JComboBox<String> jComboBox_R2LTS;
    private javax.swing.JComboBox<String> jComboBox_RINV;
    private javax.swing.JComboBox<String> jComboBox_Suprema;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
