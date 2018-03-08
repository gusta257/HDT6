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
public class MapFactory<E> {
    public static Map getMap(String entry) {
    // seleccion de la implementacion a utilizar:
    if (entry.equalsIgnoreCase("HashMap")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio HashMap");
        return new HashMap();
    }//regresa ArrayList
    if (entry.equalsIgnoreCase("TreeMap")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio TreeMap");
        return new TreeMap();
    }//regresa ArrayList
    if (entry.equalsIgnoreCase("LinkedHashMap")){
       System.out.println("-------------------------------------------------------------------------------------");
       System.out.println("Usted escogio LinkedHashMap");
        return new LinkedHashMap();
    }//regresa ArrayList
    else{
        System.out.println("Usted escrbio mal xd");
    }
       return null;
   }
    
}
