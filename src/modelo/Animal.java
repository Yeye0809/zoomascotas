/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yeferson
 */

public class Animal {
    
    private long idA;
    private long idCuidador;
    private String nombre;
    private String tipo;
    private String generoA;
    private String estadoA;
    private Date fEntrada; 
    
    
    public Animal(){};   

    public Animal( long idCuidador, String nombre, String tipo, String generoA, String estadoA, Date fEntrada) {
        
        this.idCuidador = idCuidador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.generoA = generoA;
        this.estadoA = estadoA;
        this.fEntrada = fEntrada;
        
    }

    public long getIdA() {
        return idA;
    }

    public String getIdA_string(){
        return "AN - " + idA;
    }
            
    public void setIdA(long idA) {
        this.idA = idA;
    }

    public long getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(long idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGeneroA() {
        return generoA;
    }

    public void setGeneroA(String generoA) {
        this.generoA = generoA;
    }

    public String getEstadoA() {
        return estadoA;
    }

    public void setEstadoA(String estadoA) {
        this.estadoA = estadoA;
    }

    public Date getfEntrada() {
        return fEntrada;
    }
    
    public String getfEntradaFormato(){
        SimpleDateFormat fEntradaF = new SimpleDateFormat("dd/MM/yyyy");
        
        return fEntradaF.format(fEntrada);
    }

    public void setfEntrada(Date fEntrada) {
        this.fEntrada = fEntrada;
    }
    
    @Override
    public String toString(){
        return idA + " - " + nombre; 
    }
    
}
