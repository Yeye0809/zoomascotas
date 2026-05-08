/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import DAOs.AnimalDAO;
import java.util.LinkedList;
import modelo.Animal;
import modelo.Cuidador;

/**
 *
 * @author yeferson
 */
public class ReporteAnimal {
    
    AnimalDAO anDAO = new AnimalDAO();
    
    
    
     //Este metodo genera un archivo con el reporte de todos los animales de la lista
    public void reporteAnimales( String nombre, String deli ){
        String query = "SELECT * FROM animal;";
        String cad = "";
        LinkedList<Animal> listaAn = anDAO.consultaReporte(query);
        for( Animal an : listaAn ){
            cad += an.getIdA_string() + deli + an.getNombre() + deli + an.getTipo() + deli +an.getGeneroA() + deli + an.getEstadoA() + deli + an.getIdCuidador() + "\n";
        }
        
        if( Archivo.generarArchivo(nombre, cad))
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo");
    }
    
    //Este metodo genera un archivo con el reporte de los animales segun el genero pasado por parametro
    public void reporteGeneroAn( String nombre, String genero, String deli ){
        String query = "SELECT * FROM animal WHERE genero_animal = ?;";
        String cad = "";
        LinkedList<Animal> listaAn = anDAO.consultaReporte(query, genero);
        for( Animal an : listaAn ){
                cad += an.getIdA_string() + deli + an.getNombre() + deli + an.getTipo() + deli +an.getGeneroA() + deli + an.getEstadoA() + deli + an.getIdCuidador() + "\n";
        }
        
         if( Archivo.generarArchivo(nombre, cad))
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo");        
        
    }
    
    //Este metodo genera un archivo con el reporte de los animales segun el estado del animal pasado por parametro
    public void reporteEstadoAn( String nombre, String estado, String deli){
        String query = "SELECT * FROM animal WHERE estado_animal = ?;";
        String cad = "";
        LinkedList<Animal> listaAn = anDAO.consultaReporte(query, estado);
        for( Animal an : listaAn ){
            cad += an.getIdA_string() + deli + an.getNombre() + deli + an.getTipo() + deli +an.getGeneroA() + deli + an.getEstadoA() + deli + an.getIdCuidador() + "\n";
        }
        
         if( Archivo.generarArchivo(nombre, cad))
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo");        
        
    }
    
    //Este metodo genera un archivo con el reporte de los animales segun el tipo de animal pasado por parametro
    public void reporteTipoAn( String nombre, String tipo, String deli ){
         String query = "SELECT * FROM animal WHERE tipo_animal = ?;";
        String cad = "";
        LinkedList<Animal> listaAn = anDAO.consultaReporte(query, tipo);
        for( Animal an : listaAn ){
            cad += an.getIdA_string() + deli + an.getNombre() + deli + an.getTipo() + deli +an.getGeneroA() + deli + an.getEstadoA() + deli + an.getIdCuidador() + "\n";
                       
        }
        
        if( Archivo.generarArchivo(nombre, cad))
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
        
    }
    
    //Este metodo genera un archivo con el reporte de los animales que estan a cargo de un cuidador
    public void reporteAnACargo( String nombre, Cuidador cu, String deli ){
         String query = "SELECT * FROM animal WHERE genero_animal = ?;";
        String cad = "";
        LinkedList<Animal> listaAn = anDAO.consultaReporte(query);
        for( Animal an : listaAn ){
            if( an.getIdCuidador() == cu.getCedula() )
                cad += an.getIdA_string() + deli + an.getNombre() + deli + an.getTipo() + deli +an.getGeneroA() + deli + an.getEstadoA() + deli + an.getIdCuidador() + "\n";
        }
        
        if( Archivo.generarArchivo(nombre, cad))
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
        
    }
    
    
}
