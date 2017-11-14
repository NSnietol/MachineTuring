/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automata2017;

import java.util.Observable;

/**
 * Lo puse así para saber en todo momento donde se encuentra el apuntador por el uso de referencia en Memoria
 * @author ns
 */
public class Apuntador  extends Observable {
    private int referencia ;

    public Apuntador(int ref) {
        referencia=ref;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
                //Marcamos el objeto observable como objeto que ha cambiado
        setChanged();
        //Notificamos a los observadores y le enviamos el nuevo valor
        // notifyObservers(mensaje);
        notifyObservers(this);
        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
        
    }
    
    
    
}
