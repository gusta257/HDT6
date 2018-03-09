/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Bienvenido");
        //Calculadora calc = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del MAP que desea usar:");
          System.out.println("HashMap");
          System.out.println("TreeMap");
          System.out.println("LinkedHashMap");
          System.out.println("-------------------------------------------------------------------------------------");
          String rpt = teclado.nextLine();
        
        int contador=0;
        try {
            String sCadena;
            //Funcion para abrir y leer el documento 
            FileReader fr = new FileReader("cards_desc.txt");
            BufferedReader bf = new BufferedReader(fr);
            //bucle para hacer las funciones dependiendo de las lineas del documento
            while ((sCadena = bf.readLine())!=null) { 
                String[] separar = sCadena.split("|");
                contador=contador+1;
                //System.out.println(contador+(")Su resultado es: ")+calc.calcular(sCadena,rpt));
            } 
        //Sirve si algun dato del documento no sirva
        }catch(Exception e){
            System.out.println("Documento no encontrado o dañado :( por favor verificar");
            }
        System.out.println("Gracias por esperar");
    }
}