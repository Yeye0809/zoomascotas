/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.ConexionDB;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author yeferson
 */
public class DataTableControl {   
        
    //Inserta los metadatos en la tabla dinamicamente segun el query enviado
    public void generarTabla(String query, JTable tabla){
        DefaultTableModel modelo;
        try( Connection conn = ConexionDB.conectar();
             PreparedStatement ps = conn.prepareStatement(query)){
           
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            
            //crea una matriz vacia
            String data[][] = {};
            //crea un vector vacio con la cantidad de columnas que hayan en la tabla de la base de datos
            //Segun el query pasado
            String[] col = new String[rsm.getColumnCount()];
            
            //extrae los nombres de las columnas de la tabla de la BD y los guarda en el vector
            for(int i = 0; i < col.length; i++){
                col[i] = rsm.getColumnName(i + 1);
            }
            
            //se crea un numeo modelo de Jtable
            modelo = new DefaultTableModel(data, col);
            
            tabla.setModel(modelo);
            
            //Se carga los datos de la tabla de la BD en el JTable
            while( rs.next() ){
                modelo.insertRow(0, new Object[]{});
                for( int i = 0; i < col.length; i++ ){
                    modelo.setValueAt( rs.getString(i+1), 0, i);
                }
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error al generar tabla");

        }
    }
}
