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
public class Cuidador {
    private long cedula;
    private long telefono;
    private String nombre;
    private String apellido;
    private String genero;
    private String email;
    private Date fNaci;
    
    public Cuidador(){};

    public Cuidador(long cedula, long telefono, String nombre, String apellido, String genero, String email, Date fNaci) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.email = email;
        this.fNaci = fNaci;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getfNaci() {
        return fNaci;
    }
    public String getFNaciFormat(){
        SimpleDateFormat fNacimiento = new SimpleDateFormat("dd/MM/yyyy");
        return fNacimiento.format(fNaci);
    }

    public void setfIngreso(Date fIngreso) {
        this.fNaci = fIngreso;
    }
    
    @Override
    public String toString(){
        return  cedula + " - " + nombre + " " + apellido;
    }
}
