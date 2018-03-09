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
    
   
    public Carta obtenerCarta(String nombre,  Map<String, Carta> mapa  ) {

        if(mapa.containsKey(nombre)){
            Carta c = mapa.get(nombre);
            return c;
        }
        else{
      
            return null;
        }
    }
    
    
    public String buscar(String nombre, Map<String, Carta> mapa ){
        String carta = "";
        if(mapa.containsKey(nombre)){
            Carta cartas = mapa.get(nombre);
            
            carta = "La carta " + cartas.getNombre() + " es tipo "+ cartas.getTipo()  ;
        }else{ 
            carta = "Esta carta no existe";
        }

        return carta;

    }
     public void mostarTodas(Map<String, Carta> mapa){ 
        for (Map.Entry<String, Carta> entry : mapa.entrySet()){ 
                    System.out.println("Nombre de carta: " + entry.getKey() + " Tipo de Carta: " + entry.getValue().getTipo());
        }
    }
    
}
