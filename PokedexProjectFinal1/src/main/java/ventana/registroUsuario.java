/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import controlador.ClsRegistroUsuarios;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import modelos.MdRegistro;

/**
 *
 * @author HP
 */
public class registroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form registroUsuario
     */
    public registroUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        UserReg = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        PasswordReg = new javax.swing.JTextField();
        ConfirmarPass = new javax.swing.JTextField();
        Reggristrado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        UserReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserReg.setForeground(new java.awt.Color(204, 204, 255));
        UserReg.setText("Name Entrenadores");

        Correo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Correo.setForeground(new java.awt.Color(204, 204, 255));
        Correo.setText("Correo Electronico");

        PasswordReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordReg.setForeground(new java.awt.Color(204, 204, 255));
        PasswordReg.setText("Password");

        ConfirmarPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConfirmarPass.setForeground(new java.awt.Color(204, 204, 255));
        ConfirmarPass.setText("Confirmed Password");

        Reggristrado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reggristrado.setText("Registrarse");
        Reggristrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReggristradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserReg)
                            .addComponent(Correo)
                            .addComponent(PasswordReg)
                            .addComponent(ConfirmarPass, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Reggristrado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reggristrado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void ReggristradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReggristradoActionPerformed
        
        Login Jframe = new Login();
        Jframe.setVisible(true);
        this.setVisible(false);
        MdRegistro mod = new MdRegistro();
        ClsRegistroUsuarios Registro = new ClsRegistroUsuarios();
        
        String pass = PasswordReg.getText();
        String conpass = ConfirmarPass.getText();
        
        if(pass.equals(conpass)){
            
            mod.setUsuario(UserReg.getText());
            mod.setCorreo_electronico(Correo.getText());
            mod.setContrase??a(pass);
            
            if(Registro.registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
       try {         
        Properties props = new Properties ();
        props.setProperty("mail.smtp.host","smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable","true");
        props.setProperty("mail.smtp.port","587");
        props.setProperty("mail.smtp.auth","true");
        
        Session session = Session.getDefaultInstance(props);
        
        String correoRemitente = "pokedexumgproyect@gmail.com";
        String passwordRemitente = "Steven783836";
        String correoReceptor = Correo.getText();
        String asunto = "Usted esta registrado para usar la pokedex";
        String mensaje = "tu usuario de inicio de sesion y tu contrase??a es = " + UserReg.getText()+ PasswordReg.getText();
        
        MimeMessage message = new MimeMessage(session);
                
                    message.setFrom(new InternetAddress(correoRemitente));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                    message.setSubject(asunto);
                    message.setText(mensaje);
        
        Transport t = session.getTransport("smtp");
        t.connect(correoRemitente, passwordRemitente);
        t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        t.close();
                    
                    
                } catch (AddressException ex) {
                    Logger.getLogger(registroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MessagingException ex) {
                    Logger.getLogger(registroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        JOptionPane.showMessageDialog(null, "Se envio un correo revise su bandeja de entrada");

            } else {
                JOptionPane.showMessageDialog(null, "Registro no se guardo ERROR");
            }
            
        } else { 
            JOptionPane.showMessageDialog(null, "las contrase??as no coinciden");
        }
    }//GEN-LAST:event_ReggristradoActionPerformed

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
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmarPass;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField PasswordReg;
    private javax.swing.JButton Reggristrado;
    private javax.swing.JTextField UserReg;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
