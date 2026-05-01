/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author yeyeh
 */
public class Design {
    
    private FrZoomascotas vista;
    
    public Design(FrZoomascotas vista){
        this.vista = vista;
    }
    
    public void design(){        
        vista.getPnlMenu().setBackground(Color.decode("#1E3A5F"));
        vista.getBgPnlContent().setBackground(Color.decode("#F3F4F6"));
        vista.getPnlCardLayout().setBackground(Color.WHITE);
       
        vista.getPnlTablas().setBackground(Color.WHITE);
    }
    
}
