/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import DAOs.TransferenciaDAO;
import java.util.Date;
import java.util.LinkedList;
import modelo.Transferencia;

/**
 *
 * @author yeferson
 */
public class ReporteTraslados {
    
    TransferenciaDAO trDAO = new TransferenciaDAO();
     ////Este metodo genera un archivo con el reporte de las transferencias realizadas
    public void reporteTr( String nombre, String deli ){
        String query = "SELECT * FROM transferencia;";
        String cad = "";
        LinkedList<Transferencia> listaTr = trDAO.consultaReporte(query);
        for( Transferencia tr : listaTr ){
            cad += tr.getId_string() + deli + tr.getIdAn_string() + deli + tr.getIdZoo_string() + deli + tr.getFSalida_string() + "\n";
        }
        
        if( Archivo.generarArchivo(nombre, cad))
            javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
    }
    
    //Este metodo genera un archivo con el reporte de las transferencias realizadas de una fecha(inicio) a otra(fin)
    public void reporteFechasTr( String nombre, Date inicio, Date fin, String deli ){
        java.sql.Date fechaInicio = new java.sql.Date(inicio.getTime());
        java.sql.Date fechaFin = new java.sql.Date(fin.getTime());
        String query ="SELECT * FROM transferencia WHERE TO_CHAR(fecha_salida, 'MM-DD') "
                           + "BETWEEN TO_CHAR(?::DATE, 'MM-DD ') "
                           + "AND TO_CHAR(?::DATE, 'MM-DD')";
        String cad = "";
        LinkedList<Transferencia> listaTr = trDAO.consultaReporte(query, fechaInicio, fechaFin);
        for( Transferencia tr : listaTr ){
           
                cad += tr.getId_string() + deli + tr.getIdAn_string() + deli + tr.getIdZoo_string() + deli + tr.getFSalida_string() + "\n";
        }
         if( Archivo.generarArchivo(nombre, cad))
                javax.swing.JOptionPane.showMessageDialog(null, "Archivo generado");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo generar el archivo"); 
    }
}
