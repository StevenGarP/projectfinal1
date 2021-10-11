/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EquipoPokemon extends javax.swing.JFrame {
    
    BufferedImage buffer1 = null;
    Image imagen1 = null;
    int contador = 0;
    
    Statement estado;
    PreparedStatement st;
    ResultSet resultadoConsulta;
    Connection conexion;

    @Override
    public void paint(Graphics g){
        super.paintComponents(g);
        
        Graphics2D  g2 = (Graphics2D) verPokemon.getGraphics();
        
        g2.drawImage(buffer1,0,0,verPokemon.getWidth(),
                verPokemon.getHeight(),null);
    }
    
    
    public EquipoPokemon() {
        initComponents();
        
        try {
            
            imagen1 = ImageIO.read(new File("C:\\Users\\HP\\Desktop\\progra 2\\PokedexProjectFinal1\\datos\\imagenes\\black-white.png"));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        buffer1 = (BufferedImage) verPokemon.createImage(
        verPokemon.getWidth(),
        verPokemon.getHeight()
        );
        
        Graphics2D g2 = buffer1.createGraphics();
        
        dibujaElPokemonQueEstaEnLaPosicion(30);
        
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_URL="jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC"; 
            conexion = DriverManager.getConnection(JDBC_URL,"root","783836");
            estado = conexion.createStatement();
        
        
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        }
    }
    
    
    private void dibujaElPokemonQueEstaEnLaPosicion (int posicion){
        
        int fila = posicion / 31;
        int columna = posicion % 31;
        Graphics2D g2 = (Graphics2D) buffer1.getGraphics();
        g2.setColor(Color.black);
        g2.fillRect(0, 0, //pinta el fondo del jpanel negro
                verPokemon.getWidth(),
                verPokemon.getHeight()); 
        
        g2.drawImage(imagen1,
                0,  //posicion X inicial dentro del jpanel 
                0,  // posicion Y inicial dentro del jpanel
                verPokemon.getWidth(), //ancho del jpanel
                verPokemon.getHeight(), //alto del jpanel
                columna*96, //posicion inicial X dentro de la imagen de todos los pokemon
                fila*96, //posicion inicial Y dentro de la imagen de todos los pokemon
                columna*96 + 96, //posicion final X
                fila*96 + 96, //posicion final Y
                null  //si no lo pones no va
                );
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Liberar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        verPokemon = new javax.swing.JPanel();
        der = new javax.swing.JButton();
        izq = new javax.swing.JButton();
        IDpokemon = new javax.swing.JLabel();
        NPokemon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        Liberar.setText("Ya no me gusta el pokemon");
        Liberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiberarActionPerformed(evt);
            }
        });

        regresar.setText("< == Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verPokemonLayout = new javax.swing.GroupLayout(verPokemon);
        verPokemon.setLayout(verPokemonLayout);
        verPokemonLayout.setHorizontalGroup(
            verPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        verPokemonLayout.setVerticalGroup(
            verPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        der.setBackground(new java.awt.Color(0, 0, 0));
        der.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        der.setForeground(new java.awt.Color(0, 255, 204));
        der.setText("== >");
        der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derActionPerformed(evt);
            }
        });

        izq.setBackground(new java.awt.Color(0, 0, 0));
        izq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        izq.setForeground(new java.awt.Color(0, 255, 204));
        izq.setText("< == ");
        izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izqActionPerformed(evt);
            }
        });

        IDpokemon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        IDpokemon.setText("ID");
        IDpokemon.setToolTipText("");

        NPokemon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NPokemon.setText("Nombre Pokemon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(IDpokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regresar)
                            .addComponent(verPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Liberar, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(der, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(izq, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(der)
                        .addGap(18, 18, 18)
                        .addComponent(izq))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Liberar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(verPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDpokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(NPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void borrar (String id){
        String query ="delete from tb_favoritos where id = ? ";
        
        try {
            st = conexion.prepareStatement(query);
            st.setString(1, id);
            st.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(EquipoPokemon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean redireccionar (String Nombre, String id){
        
        String query ="INSERT INTO test.tb_nogustan (entrenador, id_pokemon) VALUES (?, ?)";
        
        try {
            st = conexion.prepareStatement(query);
            st.setString(1, Nombre);
            st.setString(2, id);
            st.execute();
            return true;
            } catch (SQLException ex) {
            Logger.getLogger(PokedesInicial.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        
    }
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
            PokedesInicial Jframe = new PokedesInicial();
            Jframe.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void LiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiberarActionPerformed
        PokedesInicial pokes = new PokedesInicial();
        String usuario = pokes.getUsuario();
        if(redireccionar(usuario, IDpokemon.getText())){
            borrar(IDpokemon.getName());
            JOptionPane.showMessageDialog(null, "Registro Redireccionado");
        }else{
            JOptionPane.showMessageDialog(null, "Algo salio mal intentelo de nuevo ");
        }
    }//GEN-LAST:event_LiberarActionPerformed

    private void izqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izqActionPerformed
        
        String cuerito = "Select * from tb_favoritos where id_favorito ="+ (contador -1);
        
        
        try {
            resultadoConsulta = estado.executeQuery(cuerito);
            if (resultadoConsulta.next()){
                IDpokemon.setText(resultadoConsulta.getString(1));
                NPokemon.setText(resultadoConsulta.getString(3));
            } else {
                NPokemon.setText("Este chucho no esta en el pokedex");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Clavo con sql");
        }
        
        contador --;
        if(contador <=0){
            contador = -1;
        }
        
       dibujaElPokemonQueEstaEnLaPosicion(contador -1);
    }//GEN-LAST:event_izqActionPerformed

    private void derActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derActionPerformed
        dibujaElPokemonQueEstaEnLaPosicion(contador );
        String cuerito = "Select * from tb_favoritos where id_favorito ="+ (contador +1);
        
        
        
       
        try {
            resultadoConsulta = estado.executeQuery(cuerito);
            if (resultadoConsulta.next()){
                IDpokemon.setText(resultadoConsulta.getString(1));
                NPokemon.setText(resultadoConsulta.getString(3));
            } else {
                NPokemon.setText("Este chucho no esta en el pokedex");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Clavo con sql");
        }
        
        contador++;
        if (contador >=649){
            contador = 649;
        }
    }//GEN-LAST:event_derActionPerformed

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
            java.util.logging.Logger.getLogger(EquipoPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipoPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipoPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipoPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquipoPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDpokemon;
    private javax.swing.JButton Liberar;
    private javax.swing.JLabel NPokemon;
    private javax.swing.JButton der;
    private javax.swing.JButton izq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    private javax.swing.JPanel verPokemon;
    // End of variables declaration//GEN-END:variables
}
