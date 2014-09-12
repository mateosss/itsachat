package Interfaz;

import Logica.SaveLoad;
import Logica.ClientProperties;
import Logica.FTP;
import Logica.MensajeFormateado;
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
            this.nombre.setText((String) datos[2]);
            this.estado.setText((String) datos[3]);
            this.puertoServer.setText((String) datos[4]);
            this.userFtp.setText((String) datos[5]);
            this.pswFtp.setText((String) datos[6]);
            this.rutaDes.setText((String) datos[7]);
            this.rutaFtp.setText((String) datos[8]);
            this.inicio.setSelected((boolean) datos[9]);
            this.ipServer.setText((String) datos[10]);

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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        puertoServer = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ipServer = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        userFtp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pswFtp = new javax.swing.JTextField();
        rutaDes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        descargas1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        rutaFtp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        inicio = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        about = new javax.swing.JButton();
        guardarConf = new javax.swing.JButton();
        ip = new javax.swing.JLabel();
        historialConf = new javax.swing.JButton();

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

        nombre.setText("Cliente");
        nombre.setToolTipText("Nombre");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        estado.setText("Usando ITSaChat");
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

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(239, 239, 239));
        jLabel11.setText("Puerto del Server:");
        jLabel11.setFocusable(false);

        puertoServer.setText("9000");
        puertoServer.setToolTipText("puerto del servidor ftp");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(239, 239, 239));
        jLabel12.setText("IP del Server:");
        jLabel12.setFocusable(false);

        ipServer.setText("127.0.0.1");
        ipServer.setToolTipText("puerto del servidor ftp");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(239, 239, 239));
        jLabel13.setText("Usuario FTP:");
        jLabel13.setFocusable(false);

        userFtp.setText("asd");
        userFtp.setToolTipText("puerto del servidor ftp");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(239, 239, 239));
        jLabel14.setText("Contraseña FTP:");
        jLabel14.setFocusable(false);

        pswFtp.setText("asd");
        pswFtp.setToolTipText("puerto del servidor ftp");

        rutaDes.setText("$HOME/");
        rutaDes.setToolTipText("puerto del servidor ftp");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(239, 239, 239));
        jLabel15.setText("Ruta de Descargas:");
        jLabel15.setFocusable(false);

        descargas1.setBackground(new java.awt.Color(52, 84, 101));
        descargas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/mas.png"))); // NOI18N
        descargas1.setToolTipText("Cambiar Carpeta de Descargas");
        descargas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descargas1.setMaximumSize(new java.awt.Dimension(64, 64));
        descargas1.setMinimumSize(new java.awt.Dimension(64, 64));
        descargas1.setPreferredSize(new java.awt.Dimension(64, 64));
        descargas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargas1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(239, 239, 239));
        jLabel16.setText("Ruta de Archivos FTP:");
        jLabel16.setFocusable(false);

        rutaFtp.setText("/ITSaChat/Archivos/");
        rutaFtp.setToolTipText("puerto del servidor ftp");

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(239, 239, 239));
        jLabel17.setText("Iniciar al conectarse a la red ITSaChat:");
        jLabel17.setFocusable(false);

        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

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
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(avatarConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ipFtp, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puertoFtp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puertoServer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ipServer))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userFtp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswFtp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaDes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descargas1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaFtp, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inicio)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ipServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(puertoServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avatarConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rutaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descargas1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaFtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("Básico", jPanel1);

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

        historialConf.setBackground(new java.awt.Color(52, 84, 101));
        historialConf.setForeground(new java.awt.Color(52, 84, 101));
        historialConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/conversaciones.png"))); // NOI18N
        historialConf.setToolTipText("Obtener Conversaciones");
        historialConf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialConf.setMaximumSize(new java.awt.Dimension(64, 64));
        historialConf.setMinimumSize(new java.awt.Dimension(64, 64));
        historialConf.setPreferredSize(new java.awt.Dimension(64, 64));
        historialConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialConfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(historialConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(ip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarConf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(historialConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarConf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ip)
                        .addGap(11, 11, 11))))
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

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void avatarConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatarConfActionPerformed
        JOptionPane.showMessageDialog(null, "Característica no disponible en la versión no Premium", "Usted no me ha pagado!", 0);
    }//GEN-LAST:event_avatarConfActionPerformed

    private void descargas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargas1ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showSaveDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoElegido = fc.getSelectedFile();
            this.rutaDes.setText(archivoElegido.getPath() + "/");
        }    }//GEN-LAST:event_descargas1ActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioActionPerformed

    private void guardarConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarConfActionPerformed
        String ipFtp = this.ipFtp.getText();
        ClientProperties.setIpFtp(ipFtp);

        String puertoFtp = this.puertoFtp.getText();
        ClientProperties.setPuertoFtp(puertoFtp);

        String nombre = this.nombre.getText();
        ClientProperties.setNombre(nombre);

        String estado = this.estado.getText();
        ClientProperties.setEstado(estado);

        String puertoServer = this.puertoServer.getText();
        ClientProperties.setPuerto(puertoServer);

        String userFtp = this.userFtp.getText();
        ClientProperties.setUserFtp(userFtp);

        String pswFtp = this.pswFtp.getText();
        ClientProperties.setPswFtp(pswFtp);

        String rutaDes = this.rutaDes.getText();
        ClientProperties.setRutaDes(rutaDes);

        String rutaFtp = this.rutaFtp.getText();
        ClientProperties.setRutaFtp(rutaFtp);

        boolean inicio = this.inicio.isSelected();
        ClientProperties.setInicio(inicio);

        String ipServer = this.ipServer.getText();
        ClientProperties.setIpServer(ipServer);

        Object[] datos = {ipFtp, puertoFtp, nombre, estado, puertoServer, userFtp, pswFtp, rutaDes, rutaFtp, inicio, ipServer};

        ClientProperties.setFirst(true);
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

    private void historialConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialConfActionPerformed
        Runnable exec = new Runnable() {
            @Override
            public void run() {
                try {
                    FTP.bajar(ClientProperties.getIpFtp(), ClientProperties.getUserFtp(), ClientProperties.getPswFtp(), ClientProperties.getRutaDes() + "historial.hs", "/ITSaChat/Interno/Historial/historial.hs");
                } catch (IOException ex) {
                    System.out.println("error descargando el historial");                }

            }
        };
        new Thread(exec, "Descargar").start();

    }//GEN-LAST:event_historialConfActionPerformed

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
    private javax.swing.JButton descargas1;
    private javax.swing.JTextField estado;
    private javax.swing.JButton guardarConf;
    private javax.swing.JButton historialConf;
    private javax.swing.JCheckBox inicio;
    private javax.swing.JLabel ip;
    private javax.swing.JTextField ipFtp;
    private javax.swing.JTextField ipServer;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
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
    // End of variables declaration//GEN-END:variables
}
