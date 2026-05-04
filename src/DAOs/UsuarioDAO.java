/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import bd.ConexionDB;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yeferson
 */
public class UsuarioDAO {
    
    public boolean loginUser(String user, String pass){
        String query = "SELECT * FROM usuario WHERE usuario = ? AND password = ?";
        
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ResultSet rs= ps.executeQuery();
            
            return rs.next();
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean registerUser(String user, String pass){
        String query = "INSERT INTO usuario(usuario, password) VALUES(?,?)";
        try(Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, user);
            ps.setString(2, pass);
            
            int resultado = ps.executeUpdate();
            
            return resultado > 0;
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public int obtenerIdUsuario(String user) {

        String query = "SELECT id FROM usuario WHERE usuario = ?";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }
}
