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
public class MapFactory<K, V> {
    public static Map getMap(String entry) {
    // seleccion de la implementacion a utilizar:
    if (entry.equalsIgnoreCase("HashMap")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio HashMap");
        return new HashMap();
    }//regresa HashMap
    if (entry.equalsIgnoreCase("TreeMap")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio TreeMap");
        return new TreeMap();
    }//regresa TreeMap
    if (entry.equalsIgnoreCase("LinkedHashMap")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio LinkedHashMap");
        return new LinkedHashMap();
    }//regresa LinkedHashMap
    else{
        System.out.println("Usted escrbio mal xd");
    }
       return null;
   }
    
}
