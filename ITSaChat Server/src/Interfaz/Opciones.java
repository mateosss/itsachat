package Interfaz;

import Logica.FTP;
import Logica.MensajeFormateado;
import Logica.SaveLoad;
import Logica.ServerProperties;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Opciones extends javax.swing.JFrame {

    public Opciones() throws IOException, ClassNotFoundException {
        initComponents();
        Object[] datos = SaveLoad.load();

        //QUE HAGAA ESTOO LA VENTAAA NAAA PRINCIPALL----------_##########_123!"&!/$&/
        try {
            this.ipFtp.setText((String) datos[0]);
            this.puertoFtp.setText((String) datos[1]);
            this.blacklist.setText((String) datos[2]);
            this.blacklistOn.setSelected((boolean) datos[3]);
            this.whitelist.setText((String) datos[4]);
            this.whitelistOn.setSelected((boolean) datos[5]);
            this.nombre.setText((String) datos[6]);
            this.estado.setText((String) datos[7]);
            this.puertoServer.setText((String) datos[8]);
            this.userFtp.setText((String) datos[9]);
            this.pswFtp.setText((String) datos[10]);
            this.rutaDes.setText((String) datos[11]);
            this.rutaFtp.setText((String) datos[12]);
            this.inicio.setSelected((boolean) datos[13]);

        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Archivo de configuración dañando, cargando valores predeterminados");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        avatarConf = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        ipFtp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        puertoFtp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        blacklist = new javax.swing.JTextArea();
        blacklistOn = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        whitelist = new javax.swing.JTextArea();
        whitelistOn = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        puertoServer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userFtp = new javax.swing.JTextField();
        pswFtp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rutaDes = new javax.swing.JTextField();
        historialConf1 = new javax.swing.JButton();
        descargas = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        inicio = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        rutaFtp = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        about = new javax.swing.JButton();
        guardarConf = new javax.swing.JButton();
        ip = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setTitle("Perfil");
        setBackground(new java.awt.Color(52, 84, 101));
        setForeground(new java.awt.Color(52, 84, 101));
        setType(java.awt.Window.Type.UTILITY);

        jTabbedPane1.setBackground(new java.awt.Color(52, 84, 101));
        jTabbedPane1.setForeground(new java.awt.Color(52, 84, 101));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel1.setBackground(new java.awt.Color(52, 84, 101));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(52, 84, 101));

        avatarConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/logo.png"))); // NOI18N
        avatarConf.setToolTipText("Cambiar Avatar");
        avatarConf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        avatarConf.setMaximumSize(new java.awt.Dimension(64, 64));
        avatarConf.setMinimumSize(new java.awt.Dimension(64, 64));
        avatarConf.setPreferredSize(new java.awt.Dimension(64, 64));
        avatarConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatarConfActionPerformed(evt);
            }
        });

        nombre.setText("Servidor");
        nombre.setToolTipText("Nombre");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        estado.setText("Manejando los hilos del chat");
        estado.setToolTipText("Estado");
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        ipFtp.setText("192.168.0.3");
        ipFtp.setToolTipText("IP del servidor ftp");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 239, 239));
        jLabel1.setText("FTP IP:");
        jLabel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 239, 239));
        jLabel2.setText("Puerto:");
        jLabel2.setFocusable(false);

        puertoFtp.setText("3721");
        puertoFtp.setToolTipText("puerto del servidor ftp");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 239, 239));
        jLabel3.setText("Blacklist");
        jLabel3.setFocusable(false);

        blacklist.setColumns(20);
        blacklist.setRows(5);
        blacklist.setText("El penca3,El penca 2,Eterochilenoo,");
        blacklist.setToolTipText("Lista de usuarios no bienvenidos");
        jScrollPane2.setViewportView(blacklist);

        blacklistOn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        blacklistOn.setForeground(new java.awt.Color(249, 249, 249));
        blacklistOn.setText("Activar");
        blacklistOn.setToolTipText("Activar esta lista como filtro");
        blacklistOn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blacklistOnStateChanged(evt);
            }
        });

        whitelist.setColumns(20);
        whitelist.setRows(5);
        whitelist.setText("El bueno,el invitado,el amigo\n");
        whitelist.setToolTipText("Lista de usuarios bienvenidos al chat");
        jScrollPane4.setViewportView(whitelist);

        whitelistOn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        whitelistOn.setForeground(new java.awt.Color(249, 249, 249));
        whitelistOn.setText("Activar");
        whitelistOn.setToolTipText("Activar esta lista como filtro");
        whitelistOn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                whitelistOnStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(239, 239, 239));
        jLabel5.setText("Whitelist");
        jLabel5.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addGap(294, 294, 294))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(avatarConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ipFtp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puertoFtp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(blacklistOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(214, 214, 214))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(whitelistOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(puertoFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blacklistOn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whitelistOn))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avatarConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jTabbedPane1.addTab("Básico", jPanel1);

        jPanel2.setBackground(new java.awt.Color(52, 84, 101));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(52, 84, 101));

        puertoServer.setText("9000");
        puertoServer.setToolTipText("puerto del servidor ftp");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 239, 239));
        jLabel4.setText("Puerto del Server:");
        jLabel4.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(239, 239, 239));
        jLabel6.setText("Usuario FTP:");
        jLabel6.setFocusable(false);

        userFtp.setText("asd");
        userFtp.setToolTipText("puerto del servidor ftp");

        pswFtp.setText("asd");
        pswFtp.setToolTipText("puerto del servidor ftp");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(239, 239, 239));
        jLabel7.setText("Contraseña FTP:");
        jLabel7.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(239, 239, 239));
        jLabel8.setText("Ruta de Descargas:");
        jLabel8.setFocusable(false);

        rutaDes.setText("$HOME/");
        rutaDes.setToolTipText("puerto del servidor ftp");

        historialConf1.setBackground(new java.awt.Color(52, 84, 101));
        historialConf1.setForeground(new java.awt.Color(52, 84, 101));
        historialConf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/conversaciones.png"))); // NOI18N
        historialConf1.setToolTipText("Obtener Conversaciones");
        historialConf1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialConf1.setMaximumSize(new java.awt.Dimension(64, 64));
        historialConf1.setMinimumSize(new java.awt.Dimension(64, 64));
        historialConf1.setPreferredSize(new java.awt.Dimension(64, 64));
        historialConf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialConf1ActionPerformed(evt);
            }
        });

        descargas.setBackground(new java.awt.Color(52, 84, 101));
        descargas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/mas.png"))); // NOI18N
        descargas.setToolTipText("Cambiar Carpeta de Descargas");
        descargas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descargas.setMaximumSize(new java.awt.Dimension(64, 64));
        descargas.setMinimumSize(new java.awt.Dimension(64, 64));
        descargas.setPreferredSize(new java.awt.Dimension(64, 64));
        descargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(239, 239, 239));
        jLabel9.setText("Iniciar al conectarse a la red ITSaChat:");
        jLabel9.setFocusable(false);

        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(239, 239, 239));
        jLabel10.setText("Ruta de Archivos FTP:");
        jLabel10.setFocusable(false);

        rutaFtp.setText("/ITSaChat/Archivos/");
        rutaFtp.setToolTipText("puerto del servidor ftp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puertoServer))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userFtp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswFtp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaDes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descargas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(historialConf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inicio)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaFtp, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puertoServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(descargas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(historialConf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Otros", jPanel2);

        jPanel3.setBackground(new java.awt.Color(52, 84, 101));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        about.setBackground(new java.awt.Color(52, 84, 101));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/acerca.png"))); // NOI18N
        about.setToolTipText("Acerca del Desarrollador");
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.setMaximumSize(new java.awt.Dimension(64, 64));
        about.setMinimumSize(new java.awt.Dimension(64, 64));
        about.setPreferredSize(new java.awt.Dimension(64, 64));
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        guardarConf.setBackground(new java.awt.Color(52, 84, 101));
        guardarConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/aceptar.png"))); // NOI18N
        guardarConf.setToolTipText("Guardar Preferencias");
        guardarConf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarConf.setMaximumSize(new java.awt.Dimension(64, 64));
        guardarConf.setMinimumSize(new java.awt.Dimension(64, 64));
        guardarConf.setPreferredSize(new java.awt.Dimension(64, 64));
        guardarConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarConfActionPerformed(evt);
            }
        });

        ip.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarConf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(guardarConf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(ip)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarConfActionPerformed
        String ipFtp = this.ipFtp.getText();
        ServerProperties.setIpFtp(ipFtp);

        String puertoFtp = this.puertoFtp.getText();
        ServerProperties.setPuertoFtp(puertoFtp);

        String blacklist = this.blacklist.getText();
        ServerProperties.setBlacklist(blacklist);

        boolean blacklistOn = this.blacklistOn.isSelected();
        ServerProperties.setBlacklistOn(blacklistOn);

        String whitelist = this.whitelist.getText();
        ServerProperties.setWhitelist(whitelist);

        boolean whitelistOn = this.whitelistOn.isSelected();
        ServerProperties.setWhitelistOn(whitelistOn);

        String nombre = this.nombre.getText();
        ServerProperties.setNombre(nombre);

        String estado = this.estado.getText();
        ServerProperties.setEstado(estado);

        String puertoServer = this.puertoServer.getText();
        ServerProperties.setPuerto(puertoServer);

        String userFtp = this.userFtp.getText();
        ServerProperties.setUserFtp(userFtp);

        String pswFtp = this.pswFtp.getText();
        ServerProperties.setPswFtp(pswFtp);

        String rutaDes = this.rutaDes.getText();
        ServerProperties.setRutaDes(rutaDes);

        String rutaFtp = this.rutaFtp.getText();
        ServerProperties.setRutaFtp(rutaFtp);

        boolean inicio = this.inicio.isSelected();
        ServerProperties.setInicio(inicio);

        Object[] datos = {ipFtp, puertoFtp, blacklist, blacklistOn, whitelist, whitelistOn, nombre, estado, puertoServer, userFtp, pswFtp, rutaDes, rutaFtp, inicio};
        try {
            SaveLoad.save(datos);
        } catch (IOException e) {
            System.out.println("Error al guardar las opciones");
        }
        this.setVisible(false);
    }//GEN-LAST:event_guardarConfActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Visite mi mi github! www.github.com/mateosss", "Acerca del desarrollador", 1);
    }//GEN-LAST:event_aboutActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void avatarConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatarConfActionPerformed
        JOptionPane.showMessageDialog(null, "Característica no disponible en la versión no Premium", "Usted no me ha pagado!", 0);
    }//GEN-LAST:event_avatarConfActionPerformed

    private void descargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargasActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showSaveDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoElegido = fc.getSelectedFile();
            this.rutaDes.setText(archivoElegido.getPath()+"/");
        }


    }//GEN-LAST:event_descargasActionPerformed

    private void blacklistOnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blacklistOnStateChanged
        if (this.blacklistOn.isSelected()) {
            this.whitelistOn.setSelected(false);
        }
    }//GEN-LAST:event_blacklistOnStateChanged

    private void whitelistOnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_whitelistOnStateChanged
        if (this.whitelistOn.isSelected()) {
            this.blacklistOn.setSelected(false);
        }
    }//GEN-LAST:event_whitelistOnStateChanged

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Característica no disponible en la versión No Premium", "Usted no es Premium", 0);
    }//GEN-LAST:event_inicioActionPerformed

    private void historialConf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialConf1ActionPerformed
        Runnable exec = new Runnable() {
            @Override
            public void run() {
                try {
                    FTP.bajar(ServerProperties.getIpFtp(), ServerProperties.getUserFtp(), ServerProperties.getPswFtp(), ServerProperties.getRutaDes()+"historial.hs", "/ITSaChat/Interno/Historial/historial.hs");
                } catch (IOException ex) {
                    Logger.getLogger(MensajeFormateado.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        new Thread(exec, "Descargar").start();
     }//GEN-LAST:event_historialConf1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Opciones().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton avatarConf;
    private javax.swing.JTextArea blacklist;
    private javax.swing.JCheckBox blacklistOn;
    private javax.swing.JButton descargas;
    private javax.swing.JTextField estado;
    private javax.swing.JButton guardarConf;
    private javax.swing.JButton historialConf1;
    private javax.swing.JCheckBox inicio;
    private javax.swing.JLabel ip;
    private javax.swing.JTextField ipFtp;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pswFtp;
    private javax.swing.JTextField puertoFtp;
    private javax.swing.JTextField puertoServer;
    private javax.swing.JTextField rutaDes;
    private javax.swing.JTextField rutaFtp;
    private javax.swing.JTextField userFtp;
    private javax.swing.JTextArea whitelist;
    private javax.swing.JCheckBox whitelistOn;
    // End of variables declaration//GEN-END:variables
}
