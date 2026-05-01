/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import bd.ConexionDB;
import controlador.DataTableControl;
import modelo.Animal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author yeferson
 */
public class AnimalDAO {
    
    DataTableControl tablaControl = new DataTableControl();
    Animal an =  null;
    
    public boolean registrar(Animal an){
        String query = "INSERT INTO animal(nombre_animal, tipo_animal, genero_animal, estado_animal,"
                     + "fecha_entrada, cuidador_id) VALUES(?,?,?,?,?,?);";
        boolean registrado = false;
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, an.getNombre());
            ps.setString(2, an.getTipo());
            ps.setString(3, an.getGeneroA());
            ps.setString(4, an.getEstadoA());
            ps.setDate(5, new Date(an.getfEntrada().getTime()));
            ps.setLong(6, an.getIdCuidador());
            
            int resultado = ps.executeUpdate();
            registrado = resultado > 0;
            
        }catch(SQLException ex){
            System.out.println("Error al registrar animal");
            ex.printStackTrace();
        }
        
        
        return registrado;
    }
    
    
    public void listar(JTable tabla){
        String query = "SELECT * FROM animal ORDER BY id_animal ASC";
        tablaControl.generarTabla(query, tabla);
    }
    
    public Animal buscar(long id){
        
        String query = "SELECT * FROM animal WHERE id_animal = ?";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setLong(1, id);
            
            ResultSet rs  = ps.executeQuery();
            
            while(rs.next()){
                an = new Animal();
                an.setIdA(rs.getLong("id_animal"));
                an.setNombre(rs.getString("nombre_animal"));
                an.setGeneroA(rs.getString("genero_animal"));
                an.setTipo(rs.getString("tipo_animal"));
                an.setEstadoA(rs.getString("estado_animal"));
                an.setIdCuidador(rs.getLong("cuidador_id"));
                Date fechaUtil = new Date( rs.getDate("fecha_entrada").getTime());
                an.setfEntrada(fechaUtil);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return an;
    }
    
    public boolean actualizar(String nombre, String tipo, String genero, String estado, long idCuidador, java.util.Date fecha){
        boolean actualizado = false;
        String query = "UPDATE animal SET nombre_animal = ?, tipo_animal = ?, genero_animal = ?, estado_animal = ?, "
                     + "cuidador_id = ?, fecha_entrada = ? WHERE id_animal = ?";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, nombre);
            ps.setString(2, tipo);
            ps.setString(3, genero);
            ps.setString(4, estado);
            ps.setLong(5, idCuidador);
            ps.setDate(6, new Date( fecha.getTime()));
            ps.setLong(7, an.getIdA());
            
            int resultado = ps.executeUpdate();
            
            actualizado = resultado > 0;
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
        return actualizado;
    }
    
}
