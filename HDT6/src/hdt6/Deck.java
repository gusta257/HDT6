/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt6;
import java.util.*;

/**
 *
 * @author Gustavo
 */
public class Deck {
    private MapFactory mFactory = new MapFactory();
    
   
    /*public void agregar(String nombre, Map ) {
        
        
    }*/
    
    public String buscar(String nombre, Map<String, Carta> mapa ){
        String carta = "";
        if(mapa.containsKey(nombre)){
            Carta c = mapa.get(nombre);
            
            carta = "La carta " + c.getNombre() + " es tipo" + c.getTipo() ;
        }else{ 
            carta = "Esta carta no existe";
        }
        
        return carta;
        
        
    }
    
}
