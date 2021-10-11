/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ventana.Filtros;

/**
 *
 * @author HP
 */
public class ClsFiltros implements ActionListener {
    
    Filtros filtros = new Filtros ();
    DefaultTableModel modelo = new DefaultTableModel ();
    
    Statement estado;
    ResultSet resultadoConsulta;
    Connection conexion;
    
    public ClsFiltros (Filtros v) {
        this.filtros = v;
        this.filtros.filhabitat.addActionListener(this);
        this.filtros.filcolor.addActionListener(this);
        this.filtros.rate.addActionListener(this);
        this.filtros.base.addActionListener(this);
        this.filtros.btn_reporte.addActionListener(this);
        habitat(filtros.Filtabla);
        color(filtros.Filtabla);
        ratio_captura(filtros.Filtabla);
        exp_base(filtros.Filtabla);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_URL="jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC"; 
            conexion = DriverManager.getConnection(JDBC_URL, "root", "783836");
            estado = conexion.createStatement();
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == filtros.filhabitat){
            habitat(filtros.Filtabla);
        }
    }
    
    public void habitat (JTable tabla) {
        String query = "Select * from pokemon order by habitat asc";
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("id");
        modelo.addColumn("name");
        modelo.addColumn("habitat");
        Object[] lista = new Object[3];
        try {
            resultadoConsulta = estado.executeQuery(query);
            while (resultadoConsulta.next()){
                lista[0] = resultadoConsulta.getString(1);
                lista[1] = resultadoConsulta.getString(2);
                lista[2] = resultadoConsulta.getString(15);
                modelo.addRow(lista);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        filtros.Filtabla.setModel(modelo);
        }
    
    public void color (JTable tabla){
                String query = "Select * from pokemon order by color asc";
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("id");
        modelo.addColumn("name");
        modelo.addColumn("color");
        Object[] lista = new Object[3];
        try {
            resultadoConsulta = estado.executeQuery(query);
            
            while (resultadoConsulta.next()){
                lista[0] = resultadoConsulta.getString(1);
                lista[1] = resultadoConsulta.getString(2);
                lista[2] = resultadoConsulta.getString(13);
                modelo.addRow(lista);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        filtros.Filtabla.setModel(modelo);
    }
    
    public void ratio_captura (JTable tabla) {
                String query = "Select * from pokemon order by capture_rate asc";
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("id");
        modelo.addColumn("name");
        modelo.addColumn("ratio_captura");
        Object[] lista = new Object[3];
        try {
            resultadoConsulta = estado.executeQuery(query);
            
            while (resultadoConsulta.next()){
                lista[0] = resultadoConsulta.getString(1);
                lista[1] = resultadoConsulta.getString(2);
                lista[2] = resultadoConsulta.getString(17);
                modelo.addRow(lista);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        filtros.Filtabla.setModel(modelo);
    }
    
        public void exp_base (JTable tabla) {
                String query = "Select * from pokemon order by base_experience asc";
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("id");
        modelo.addColumn("name");
        modelo.addColumn("experiencia base");
        Object[] lista = new Object[3];
        try {
            resultadoConsulta = estado.executeQuery(query);
            
            while (resultadoConsulta.next()){
                lista[0] = resultadoConsulta.getString(1);
                lista[1] = resultadoConsulta.getString(2);
                lista[2] = resultadoConsulta.getString(18);
                modelo.addRow(lista);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        filtros.Filtabla.setModel(modelo);
    }
    
}
    