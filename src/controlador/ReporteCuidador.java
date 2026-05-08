/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import DAOs.AnimalDAO;
import DAOs.CuidadorDAO;
import java.util.Date;
import java.util.LinkedList;
import modelo.Animal;
import modelo.Cuidador;

/**
 *
 * @author yeferson
 */
public class ReporteCuidador {
    
    CuidadorDAO cuDAO = new CuidadorDAO();
    AnimalDAO anDAO = new AnimalDAO();
    
    String query = "SELECT * FROM cuidador";
    
     //Este metodo genera un archivo con el reporte de todos los cuidadores de la lista
    public void reporteCuidadores( String nombre, String deli ){
        String cad = ""; 
        LinkedList<Cuidador> lisCu = cuDAO.consultaReporte(query);
        for( Cuidador cu : lisCu ){
            cad += cu.getCedula() + deli + cu.getNombre() + deli + cu.getApellido() + deli + cu.getGenero() + deli + cu.getTelefono() + deli + cu.getEmail() + deli + cu.getFNaciFormat() + "\n";
        }
        
        if( Archivo.generarArchivo(nombre, cad) )
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
        
    }
    
    //Este metodo genera un archivo con el reporte de los cuidadores segun el genero pasado por parametro
    public void reporteGeneroCu( String nombre, String genero, String deli){
        String cad = "";
        LinkedList<Cuidador> lisCu = cuDAO.consultaReporte(query);
        for( Cuidador cu : lisCu ){
            if( genero.equals( cu.getGenero()) )
                cad += cu.getCedula() + deli + cu.getNombre() + deli + cu.getApellido() + deli + cu.getGenero() + deli + cu.getTelefono() + deli + cu.getEmail() + deli + cu.getFNaciFormat() + "\n";
        }
        
        if( Archivo.generarArchivo(nombre, cad) )
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
        
    }
    
    //Este metodo genera un archivo con el reporte de los cuidadores que cumplen años de una fecha(inicio) a otra(fin)
    public void reporteCumpleCu( String nombre, Date FechaInicio, Date FechaFin, String deli){
        java.sql.Date inicio = new java.sql.Date(FechaInicio.getTime());
        java.sql.Date fin = new java.sql.Date(FechaFin.getTime());
        String cad = "";
        String queryCumple ="SELECT * FROM cuidador WHERE TO_CHAR(fecha_nacimiento_cuidador, 'MM-DD') "
                           + "BETWEEN TO_CHAR(?::DATE, 'MM-DD ') "
                           + "AND TO_CHAR(?::DATE, 'MM-DD')";
        
        LinkedList<Cuidador> lisCu = cuDAO.consultaReporte(queryCumple, inicio, fin);
        for( Cuidador cu : lisCu ){
                 cad += cu.getCedula() + deli + cu.getNombre() + deli + cu.getApellido() + deli + cu.getGenero() + deli + cu.getTelefono() + deli + cu.getEmail() + deli + cu.getFNaciFormat() + "\n";
            
        }
        
        if( Archivo.generarArchivo(nombre, cad) )
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
        
    }
    
    public void reporteAnACargo( String nombre, Cuidador cu, String deli ){
        String queryAn = "SELECT * FROM animal WHERE  cuidador_id = " + cu.getCedula();
        String cad = "";
        LinkedList<Animal> lisAn = anDAO.consultaReporte(queryAn);
        for( Animal an : lisAn ){
            if( an.getIdCuidador() == cu.getCedula() )
                cad += an.getIdA_string() + deli + an.getNombre() + deli + an.getTipo() + deli +an.getGeneroA() + deli + an.getEstadoA() + deli + an.getIdCuidador() + "\n";
        }
        
        if( Archivo.generarArchivo(nombre, cad))
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
        
    }
    
}
