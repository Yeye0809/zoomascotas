/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yeferson
 */
public class ShowCard {
    
     public static  void showCard(String card,JPanel pnl){
        CardLayout cl = (CardLayout)pnl.getLayout();
        cl.show(pnl, card);
    }
}
