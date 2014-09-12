/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Client;
import Logica.ClientProperties;
import Logica.FTP;
import Logica.SaveLoad;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import sun.awt.WindowClosingListener;

public class ITSaChatClient extends javax.swing.JFrame {

    boolean salir = true;

    Client client;

    public ITSaChatClient() throws IOException, ClassNotFoundException {
        initComponents();
        mensaje.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    enviarActionPerformed(null);
                }
            }
        }
        );
        ClientProperties.setFirst(true);
        Image icon = new ImageIcon(getClass().getResource("/Resource/logo.png")).getImage();
        setIconImage(icon);

        Object[] datos = SaveLoad.load();
        if (datos != null) {
            ClientProperties.setIpFtp((String) datos[0]);
            ClientProperties.setPuertoFtp((String) datos[1]);
            ClientProperties.setNombre((String) datos[2]);
            ClientProperties.setEstado((String) datos[3]);
            ClientProperties.setPuerto((String) datos[4]);
            ClientProperties.setUserFtp((String) datos[5]);
            ClientProperties.setPswFtp((String) datos[6]);
            ClientProperties.setRutaDes((String) datos[7]);
            ClientProperties.setRutaFtp((String) datos[8]);
            ClientProperties.setInicio((boolean) datos[9]);
            ClientProperties.setIpServer((String) datos[10]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enviar = new javax.swing.JButton();
        archivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ocultar = new javax.swing.JButton();
        foto = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        opciones = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        archivos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextPane();
        mensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITSaChat");
        setBackground(new java.awt.Color(52, 84, 101));
        setForeground(new java.awt.Color(52, 84, 101));
        setIconImage(getIconImage());
        setName("ITSaChatServer"); // NOI18N

        enviar.setBackground(new java.awt.Color(52, 84, 101));
        enviar.setFont(new java.awt.Font("Ubuntu", 0, 8)); // NOI18N
        enviar.setForeground(new java.awt.Color(52, 84, 101));
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/enviar.png"))); // NOI18N
        enviar.setToolTipText("Enviar");
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.setFocusCycleRoot(true);
        enviar.setName(""); // NOI18N
        enviar.setSelected(true);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        archivo.setBackground(new java.awt.Color(52, 84, 101));
        archivo.setFont(new java.awt.Font("Ubuntu", 0, 7)); // NOI18N
        archivo.setForeground(new java.awt.Color(52, 84, 101));
        archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/enviarArchivo.png"))); // NOI18N
        archivo.setToolTipText("Enviar Archivo");
        archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        archivo.setFocusable(false);
        archivo.setMaximumSize(new java.awt.Dimension(128, 64));
        archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(52, 84, 101));
        jPanel2.setForeground(new java.awt.Color(52, 84, 101));
        jPanel2.setFocusable(false);

        ocultar.setBackground(new java.awt.Color(52, 84, 101));
        ocultar.setForeground(new java.awt.Color(52, 84, 101));
        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/ocultar.png"))); // NOI18N
        ocultar.setToolTipText("Ocultar Chat");
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultar.setFocusable(false);
        ocultar.setMaximumSize(new java.awt.Dimension(64, 64));
        ocultar.setMinimumSize(new java.awt.Dimension(64, 64));
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });

        foto.setBackground(new java.awt.Color(52, 84, 101));
        foto.setForeground(new java.awt.Color(52, 84, 101));
        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/camOff.png"))); // NOI18N
        foto.setToolTipText("Activar Videochat");
        foto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto.setFocusable(false);
        foto.setMaximumSize(new java.awt.Dimension(64, 64));
        foto.setMinimumSize(new java.awt.Dimension(64, 64));
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });

        grabar.setBackground(new java.awt.Color(52, 84, 101));
        grabar.setForeground(new java.awt.Color(52, 84, 101));
        grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/micOff.png"))); // NOI18N
        grabar.setToolTipText("Activar Micrófono");
        grabar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grabar.setFocusable(false);
        grabar.setMaximumSize(new java.awt.Dimension(64, 64));
        grabar.setMinimumSize(new java.awt.Dimension(64, 64));
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });

        opciones.setBackground(new java.awt.Color(52, 84, 101));
        opciones.setForeground(new java.awt.Color(52, 84, 101));
        opciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/ajustes.png"))); // NOI18N
        opciones.setToolTipText("Opciones");
        opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opciones.setFocusable(false);
        opciones.setMaximumSize(new java.awt.Dimension(64, 64));
        opciones.setMinimumSize(new java.awt.Dimension(64, 64));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        iniciar.setBackground(new java.awt.Color(52, 84, 101));
        iniciar.setForeground(new java.awt.Color(52, 84, 101));
        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/iniciarServer.png"))); // NOI18N
        iniciar.setToolTipText("Conectarse al Server");
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar.setFocusable(false);
        iniciar.setMaximumSize(new java.awt.Dimension(64, 64));
        iniciar.setMinimumSize(new java.awt.Dimension(64, 64));
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        archivos.setBackground(new java.awt.Color(52, 84, 101));
        archivos.setForeground(new java.awt.Color(52, 84, 101));
        archivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/archivosCompartidos.png"))); // NOI18N
        archivos.setToolTipText("Archivos Compartidos");
        archivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        archivos.setFocusable(false);
        archivos.setMaximumSize(new java.awt.Dimension(64, 64));
        archivos.setMinimumSize(new java.awt.Dimension(64, 64));
        archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(archivos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(archivos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        chat.setEditable(false);
        chat.setFont(new java.awt.Font("Ubuntu", 0, 8)); // NOI18N
        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        chat.setDragEnabled(true);
        jScrollPane3.setViewportView(chat);

        mensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(archivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensaje, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (client != null) {
            String texto = this.mensaje.getText();
            if (ClientProperties.isFirst()) {
                client.enviarMensaje("/usuario " + ClientProperties.getNombre());
                ClientProperties.setFirst(false);
            }

            client.enviarMensaje(texto);
            this.mensaje.setText("");
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoActionPerformed
        if (client != null) {
            JFileChooser fc = new JFileChooser();
            int respuesta = fc.showOpenDialog(this);
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                File archivoElegido = fc.getSelectedFile();
                client.enviarMensaje("/archivo " + archivoElegido.getPath());

            }

        }
    }//GEN-LAST:event_archivoActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        try {
            new Opciones().setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ITSaChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opcionesActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        ClientProperties.setExit(false);
        client = new Client("Cliente", this);
        client.start();
        this.iniciar.setEnabled(false);
        this.iniciar.setToolTipText("Te has conectado al Servidor. Cierra la ventana para desconectarte.");
        this.iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/servidorIniciado.png")));

    }//GEN-LAST:event_iniciarActionPerformed

    private void archivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivosActionPerformed
        String[] firefox = {"firefox", "ftp://" + ClientProperties.getUserFtp() + ":" + ClientProperties.getPswFtp() + "@" + ClientProperties.getIpFtp() + ":" + ClientProperties.getPuertoFtp() + "/ITSaChat/Archivos/"};
        String[] chromium = {"chromium-browser", "ftp://" + ClientProperties.getUserFtp() + ":" + ClientProperties.getPswFtp() + "@" + ClientProperties.getIpFtp() + ":" + ClientProperties.getPuertoFtp() + "/ITSaChat/Archivos/"};
        String[] chrome = {"google-chrome", "ftp://" + ClientProperties.getUserFtp() + ":" + ClientProperties.getPswFtp() + "@" + ClientProperties.getIpFtp() + ":" + ClientProperties.getPuertoFtp() + "/ITSaChat/Archivos/"};

        try {
            Runtime.getRuntime().exec(firefox);
        } catch (Exception ex) {
            try {
                Runtime.getRuntime().exec(chromium);
            } catch (Exception ex1) {
                try {
                    Runtime.getRuntime().exec(chrome);
                } catch (Exception ex2) {

                }
            }
        }
    }//GEN-LAST:event_archivosActionPerformed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Característica no disponible en la versión No Premium", "Usted no es Premium", 0);        // TODO add your handling code here:
    }//GEN-LAST:event_ocultarActionPerformed

    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Característica no disponible en la versión No Premium", "Usted no es Premium", 0);    }//GEN-LAST:event_fotoActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Característica no disponible en la versión No Premium", "Usted no es Premium", 0);    }//GEN-LAST:event_grabarActionPerformed

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
            java.util.logging.Logger.getLogger(ITSaChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new ITSaChatClient().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(ITSaChatClient.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    public JEditorPane getChat() {

        return this.chat;
    }

    public StyledDocument getChatDocument() {
        return this.chat.getStyledDocument();

    }

    public void insertComponent(Component objeto) {
        try {
            //this.chat.getDocument().insertString(this.chat.getDocument().getLength(), "\n", null);
            this.chat.setCaretPosition(this.chat.getDocument().getLength());
            this.chat.insertComponent(objeto);
            this.chat.getDocument().insertString(this.chat.getDocument().getLength(), "\n", null);
        } catch (BadLocationException ex) {
            System.err.println(ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivo;
    private javax.swing.JButton archivos;
    private javax.swing.JTextPane chat;
    private javax.swing.JButton enviar;
    private javax.swing.JButton foto;
    private javax.swing.JButton grabar;
    private javax.swing.JButton iniciar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mensaje;
    private javax.swing.JButton ocultar;
    private javax.swing.JButton opciones;
    // End of variables declaration//GEN-END:variables
}
