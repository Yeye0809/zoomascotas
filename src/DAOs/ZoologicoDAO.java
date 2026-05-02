/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import controlador.DataTableControl;
import modelo.Zoologico;
import bd.ConexionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JComboBox;

import javax.swing.JTable;
/**
 *
 * @author yeyeh
 */
public class ZoologicoDAO {
    DataTableControl tableControl = new DataTableControl();
    
    Zoologico zoo = null;
    
    public boolean registrar( Zoologico zoo){
        boolean registrado =  false;
        String query = "INSERT INTO zoologico(nombre, ciudad, direccion, telefono, email) VALUES(?,?,?,?,?)";
        try( Connection conn =  ConexionDB.conectar();
             PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, zoo.getNombre());
            ps.setString(2, zoo.getCiudad());
            ps.setString(3, zoo.getDireccion());
            ps.setLong(4, zoo.getTelefono());
            ps.setString(5, zoo.getEmail());
            
            int result = ps.executeUpdate();
            registrado = result > 0;
            
        }catch(SQLException ex){
            System.out.println("Error al registrar");
            ex.printStackTrace();
        }            
        return registrado;
    };
    
    public void listar( JTable tabla ){
        String query = "SELECT * FROM zoologico";
        tableControl.generarTabla(query, tabla);
    }
    
    public Zoologico buscar(long idZoologico){
        String query = "SELECT * FROM zoologico WHERE zoologico_id = ?;";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setLong(1, idZoologico);
            
            ResultSet rs  = ps.executeQuery();
            
            while( rs.next() ){
                zoo = new Zoologico();
                zoo.setId(rs.getLong("zoologico_id"));
                zoo.setNombre(rs.getString("nombre"));
                zoo.setCiudad(rs.getString("ciudad"));
                zoo.setDireccion(rs.getString("direccion"));
                zoo.setTelefono(rs.getLong("telefono"));
                zoo.setEmail(rs.getString("email"));
                Date fechaUtil = new Date( rs.getDate("fecha_registro").getTime());
                zoo.setFechaRegistro(fechaUtil);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return zoo;
    }
    
    public boolean actualizar(String nombre, String ciudad, String direccion, String email, long telefono){
        boolean actualizado = false;
        String query = "UPDATE zoologico SET nombre = ?, ciudad = ?, direccion = ?, "
                     + "telefono = ?, email = ? WHERE zoologico_id = ? ";
        
        try(Connection conn =  ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, nombre);
            ps.setString(2, ciudad);
            ps.setString(3, direccion);
            ps.setLong(4, telefono);
            ps.setString(5, email);
            ps.setLong(6, zoo.getId());
            
            int resultado = ps.executeUpdate();
            actualizado = resultado > 0; 
            
        }catch(SQLException ex){
            System.out.println("Error al actualizar");
            ex.printStackTrace();
        }        
        return actualizado;
        
    }
    
    public void cargarZoo(JComboBox combo){
        String query = "SELECT * FROM zoologico ORDER BY zoologico_id ASC;";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ResultSet rs  = ps.executeQuery();
            
            while( rs.next() ){
                Zoologico zoologico = new Zoologico();
                zoologico.setId(rs.getLong("zoologico_id"));
                zoologico.setNombre(rs.getString("nombre"));
                zoologico.setCiudad(rs.getString("ciudad"));
                zoologico.setDireccion(rs.getString("direccion"));
                zoologico.setTelefono(rs.getLong("telefono"));
                zoologico.setEmail(rs.getString("email"));
                Date fechaUtil = new Date( rs.getDate("fecha_registro").getTime());
                zoologico.setFechaRegistro(fechaUtil);
                
                combo.addItem(zoologico);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
