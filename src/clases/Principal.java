/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.Stack;

/**
 *
 * @author rmorales1
 */
public class Principal {
    public static void main(String[] args) {
      Cola c = new Cola();
      
      c.agregar("Primera_Persona");
      c.agregar("Segunda_Persona");
      c.agregar("Tercera_Persona");
      mostrar(c);
      c.sacar();
      mostrar(c);
        
        /*Stack<String> pila = new Stack();
      pila.push("Moneda 1");
      pila.push("Moneda 2");
      pila.push("Moneda 3");
      mostrar(pila);
      pila.pop();
      mostrar(pila);
      */
      
      
        
        /*  Pila p = new Pila();
        p.agregar("Moneda 1");
        p.agregar("Moneda 2");
        p.agregar("Moneda 3");
        mostrar(p);
        p.sacar();
        mostrar(p);*/
        
        
    }
    
    public static void mostrar(Pila p){
        System.out.println("Esta es la Pila: ");
        for (int i = p.getPila().size()-1; i >= 0; i--) {
            System.out.println(p.getPila().get(i));
            
        }
    }
    
     public static void mostrar(Cola c){
        System.out.println("");
         System.out.println("Esta es la Cola: ");
        for (int i = 0; i < c.getCola().size(); i++) {
            System.out.print(c.getCola().get(i)+" ");
        }
         
    }
    
    public static void mostrar(Stack<String> p){
        System.out.println("Esta es la Pila: ");
        for (int i = p.size()-1; i >= 0; i--) {
            System.out.println(p.get(i));
            
        }
    }
}
