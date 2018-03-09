/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author Gustavo
 */
public class Main {
    private static MapFactory mFactory = new MapFactory();
    private static boolean ciclo = true;
    private static String nombre;
    
    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Deck mazo = new Deck();
        
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
        

        
        Map<String, Carta> deck = mFactory.getMap(rpt);
        try {
            String sCadena;
            //Funcion para abrir y leer el documento 
            FileReader fr = new FileReader("cards_desc.txt");
            BufferedReader bf = new BufferedReader(fr);
            //bucle para hacer las funciones dependiendo de las lineas del documento
            while ((sCadena = bf.readLine())!=null) { 
                String[] cartaN = sCadena.split("\\|");
                String nombre = cartaN[0];
                String tipo = cartaN[1];
                Carta  nueva = new Carta(nombre, tipo, 0);
                deck.put(nombre, nueva);
                
            } 
            while(ciclo == true){
                System.out.println("Escriba el numero que quiere hacer");
                System.out.println("0. Salir");
                System.out.println("1. Agregar");
                System.out.println("2. Buscar carta por nombre");
                System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta");
                System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta, ordenadas por tipo");
                System.out.println("5. Mostrar el nombre y tipo de todas las cartas");
                System.out.println("6. Mostrar el nombre y tipo de todas las cartas, ordenadas por tipo.");
                String opt = teclado.nextLine();

                switch(opt){ 
                    case"0":{
                        ciclo = false;
                        break;
                    }
                    case "1":{
                        
                        /*System.out.print("Ingrese el nombre de la carta que quiere agregar ");
                        String nombreCarta = teclado.nextLine();
                        yugi.agregarCarta(nombreCarta, cartas, deck, cantidadDeck, tipoNombreDeck);
                        System.out.println("*****************************");
*/

                        break;
                    }
                    case "2":{
                        System.out.println("Ingrese el nombre de la carta que desea buscar:");
                        nombre = teclado.nextLine();
                        nombre = teclado.nextLine();
                        String tapu  = mazo.buscar(nombre, deck);
                        System.out.println(tapu);
                        break;
                    }
                    case "3":{
                        break;
                    }
                    case "4":{
                      
                    
                        break;
                    }
                    case "6":{
                        //metodos.showAllCards(deck);
                        break;
                    }
                        
            }    
                
            }
            
            
        //Sirve si algun dato del documento no sirva
        }catch(Exception e){
            System.out.println("Documento no encontrado o dañado :( por favor verificar");
            }
        System.out.println("Gracias por esperar");
    }
}