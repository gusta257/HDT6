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
    private static Deck deck;
    public static Deck getInstance(){ 
      if (deck == null){ 
          deck = new Deck();
      }
      return deck;
  }
    MapFactory mFactory = new MapFactory();
    
   
    public void agregar(String nombre, Map carta, Map deck,  String rpt) {
        Map<String, Integer> mapa = mFactory.getMap(rpt);

        
        //Ciclo para recorrer el archivo caracter por caracter
        for (int i = 0; i < exp.length(); i++) {
            
       
        }
    }
    
}
