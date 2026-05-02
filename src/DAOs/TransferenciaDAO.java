/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import bd.ConexionDB;
import modelo.Transferencia;
import controlador.DataTableControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JTable;
/**
 *
 * @author yeferson
 */
public class TransferenciaDAO {
    
    DataTableControl controlTabla = new DataTableControl();
    Transferencia tr;
    
    public boolean registrar(Transferencia tr){
        boolean registrado = false;
        String query = "INSERT INTO transferencia(animal_id, zoologico_id, fecha_salida) VALUES(?,?,?)";
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setLong(1, tr.getIdAn());
            ps.setLong(2, tr.getIdZoo());
            ps.setDate(3, new Date( tr.getFSalida().getTime()));
            
            int resultado = ps.executeUpdate();
            registrado = resultado > 0;
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return registrado;
    }
    
    public void listar(JTable tabla){
        String query = "SELECT * FROM transferencia";
        controlTabla.generarTabla(query, tabla);
    }
    
    public Transferencia buscar(long id){
        String query = "SELECT * FROM transferencia WHERE transferencia_id = ?";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            ps.setLong(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() ){
                tr = new Transferencia();
                tr.setId(rs.getLong("transferencia_id"));
                tr.setIdAn(rs.getLong("animal_id"));
                tr.setIdZoo(rs.getLong("zoologico_id"));
                java.util.Date fechaUtil = new java.util.Date( rs.getDate("fecha_salida").getTime());
                tr.setFSalida(fechaUtil);                
            }
            
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return tr;
    }
}
