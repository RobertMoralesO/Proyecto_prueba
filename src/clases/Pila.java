/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.ArrayList;

/**
 *
 * @author rmorales1
 */
public class Pila {
    private ArrayList<String> pila;
    public Pila(){
        pila = new ArrayList();
    }
    
    public void agregar(String a){
        pila.add(a);
    }
    
    public String sacar(){
        return pila.remove(pila.size()-1);
    }

    public ArrayList<String> getPila() {
        return pila;
    }

    public void setPila(ArrayList<String> pila) {
        this.pila = pila;
    }
            
}
