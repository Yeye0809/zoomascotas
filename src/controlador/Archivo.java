/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author yeferson
 */
public class Archivo {
    
    public static boolean generarArchivo(String nombre, String cadena){
        boolean generado = false;
        FileWriter escribirArchivo = null;
        
        try{
            File archivo = new File(nombre);
            
            escribirArchivo = new FileWriter(archivo);
            escribirArchivo.write(cadena);
            generado = true;
        }catch(IOException e){
             System.getLogger(Archivo.class.getName()).log(System.Logger.Level.ERROR, (String) null, e);
        }finally{
            try {
                //close cerramos el archivo y guardamos
                escribirArchivo.close();
            } catch (Exception e) {
                System.getLogger(Archivo.class.getName()).log(System.Logger.Level.ERROR, (String) null, e);
            }
        }
        return generado;
    }
}
