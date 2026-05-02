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
public class Transferencia {
    private long id;
    private long idAn;
    private long idZoo;
    private Date fSalida;
    
    private static long countId = 1001;
    
    public Transferencia(){};
    
    public Transferencia(long idAn, long idZoo, Date fSalida){
        id = countId;
        this.idAn = idAn;
        this.idZoo = idZoo;
        this.fSalida = fSalida;
        
        countId++;
    }
    
    public long getId(){
        return id;
    }
    
    public String getId_string(){
        return "TR - " + id;
    }
    
    public void setId( long id ){
        this.id = id;
    }
    
    public long getIdAn(){
        return idAn;
    }
    public String getIdAn_string(){
        return "AN - " + idAn;
    }
    
    public void setIdAn( long idAn ){
        this.idAn = idAn;
    }
    
    public long getIdZoo(){
        return idZoo;
    }
    
    public String getIdZoo_string(){
        return "ZOO - " + idZoo;
    }
    
    public void setIdZoo( long idZoo ){
        this.idZoo = idZoo;
    }
    
    public Date getFSalida(){
        return this.fSalida;
    }
    
    public String getFSalida_string(){
        SimpleDateFormat fSalidaF = new SimpleDateFormat("dd/MM/yyyy");
        return fSalidaF.format(fSalida);
    }
    
    public void setFSalida(Date fSalida){
        this.fSalida = fSalida;
    }
}
