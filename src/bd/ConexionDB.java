/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author yeferson
 */
public class ConexionDB {
 
    private static final String url = "jdbc:postgresql://localhost:5432/zoomascotas";
    private static final String usuario = "postgres";
    private static final String password = "2468";
    
    public static Connection conectar(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion exitosa");
        }catch(SQLException e){
            System.out.println("Fallo en la conexion");
            e.printStackTrace();
        }
        return conexion;
    }
}
