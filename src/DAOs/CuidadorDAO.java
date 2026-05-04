/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import modelo.Cuidador;
import bd.ConexionDB;
import controlador.DataTableControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JComboBox;

import javax.swing.JTable;


/**
 *
 * @author yeferson
 */
public class CuidadorDAO {
    
     DataTableControl controlData = new DataTableControl();
     Cuidador cu = null;
    
    public boolean registrar(Cuidador cuidador){
        boolean registrado = false;
        String query = "INSERT INTO cuidador(cedula, nombre_cuidador, apellido_cuidador, genero_cuidador, telefono_cuidador,"
                     + "email_cuidador, fecha_nacimiento_cuidador) VALUES(?,?,?,?,?,?,?,?)";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setLong(1, cuidador.getCedula());
            ps.setString(2, cuidador.getNombre());
            ps.setString(3, cuidador.getApellido());
            ps.setString(4, cuidador.getGenero());
            ps.setLong(5, cuidador.getTelefono());
            ps.setString(6, cuidador.getEmail());
            ps.setDate(7, new Date( cuidador.getfNaci().getTime()));
           
            
            int resultado = ps.executeUpdate();
            registrado = resultado > 0;
                        
        }catch(SQLException e){
            System.out.println("Error al registrar cuidador");
            e.printStackTrace();
        }
        return registrado;
    }
    
    public void listar(JTable tabla){
        String query = "SELECT * FROM cuidador;";        
        controlData.generarTabla(query, tabla);
    }
    
    public Cuidador buscar(long idCu){
        String query = "SELECT * FROM cuidador WHERE cedula = ?;";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
           
            ps.setLong(1, idCu);
            ResultSet rs = ps.executeQuery();
              while( rs.next() ){
                    cu = new Cuidador();
                    cu.setCedula(rs.getLong("cedula"));
                    cu.setNombre(rs.getString("nombre_cuidador"));
                    cu.setApellido(rs.getString("apellido_cuidador"));
                    cu.setGenero(rs.getString("genero_cuidador"));
                    cu.setTelefono(rs.getLong("telefono_cuidador"));
                    cu.setEmail(rs.getString("email_cuidador"));
                    java.util.Date fechaUtil = new java.util.Date(rs.getDate("fecha_nacimiento_cuidador").getTime());
                    cu.setfIngreso(fechaUtil);
                    
                    return cu;
                    
                }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return cu;
    }
    
    public boolean actualizar(String nombre, String apellido, String genero, long telefono, String email, java.util.Date fechaNacimiento){
        boolean actualizado = false;
        String query = "UPDATE cuidador SET nombre_cuidador = ?, apellido_cuidador = ?, genero_cuidador = ?,"
                     + " telefono_cuidador = ?, email_cuidador = ?, fecha_nacimiento_cuidador = ? WHERE cedula = ?";
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, genero);
            ps.setLong(4, telefono);
            ps.setString(5, email);
            ps.setDate(6, new Date(fechaNacimiento.getTime()));
            ps.setLong(7, cu.getCedula());
             int resultado = ps.executeUpdate();
            actualizado = resultado > 0;
        }catch(SQLException ex){
            System.out.println("Error al actualizar");
            ex.printStackTrace();
        }
        
        return actualizado;
    }
    
    public void cargarCuidadoresCb( JComboBox combo){
        String query ="SELECT * FROM cuidador";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Cuidador cu = new Cuidador();
                cu.setCedula(rs.getLong("cedula"));
                cu.setNombre(rs.getString("nombre_cuidador"));
                cu.setApellido(rs.getString("apellido_cuidador"));
                cu.setGenero(rs.getString("genero_cuidador"));
                cu.setTelefono(rs.getLong("telefono_cuidador"));
                cu.setEmail(rs.getString("email_cuidador"));
                java.util.Date fechaUtil = new java.util.Date(rs.getDate("fecha_nacimiento_cuidador").getTime());
                cu.setfIngreso(fechaUtil);
                
                combo.addItem(cu);
            }
            
            
        }catch(SQLException ex){
            System.out.println("Fallo al cargar cuidadores");
            ex.printStackTrace();
        }
                
    }
    
}
