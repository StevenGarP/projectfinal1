/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.MdRegistro;
import ventana.registroUsuario;

/**
 *
 * @author HP
 */
public class ClsRegistroUsuarios {
    
    PreparedStatement estado;
    ResultSet resultadoConsulta;
    Connection conexion;
    
    
    public ClsRegistroUsuarios (){
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_URL="jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC"; 
            conexion = DriverManager.getConnection(JDBC_URL, "root", "783836");
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    
}
    
    public boolean registrar (MdRegistro reg){
        String query ="INSERT INTO test.tb_entrenadores (usuario, correo_electronico, contraseña) VALUES (?, ?, ?)";
        
        try {
            estado = conexion.prepareStatement(query);
            estado.setString(1, reg.getUsuario());
            estado.setString(2, reg.getCorreo_electronico());
            estado.setString(3, reg.getContraseña());
            estado.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClsRegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
