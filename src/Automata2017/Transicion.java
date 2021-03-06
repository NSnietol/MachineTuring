package Automata2017;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NSnietol
 */
public class Transicion implements Estandar {

    private String evaluar;
    private String reemplazo;
    private int movimiento;
    private Nodo destino;

    public Transicion(String evaluar, String reemplazo, int movimiento, Nodo destino) {
        this.evaluar = evaluar;
        this.reemplazo = reemplazo;
        this.movimiento = movimiento;
        this.destino = destino;
    }

    private String mostrar(ArrayList<String> cade) {

       String cadena="";
        for (String string : cade) {
           cadena+=string;
        
        }
        cadena+="\n";
        return cadena;
    }

    public Nodo Operar(ArrayList<String> cadena, Apuntador referencia) {

        
        System.out.println("------------------------------------------");
        System.out.println("Apuntador en : " + referencia.getReferencia());
        System.out.println("Cinta : "+mostrar(cadena));
        System.out.print(cadena.toArray()[referencia.getReferencia()] + ">");
        System.out.println((String) cadena.toArray()[referencia.getReferencia()]);
        System.out.println("------------------------------------------");
       

   

        // Cadena es un ArrayList, así que para modificar un valor solo se necesita la posición y el nuevo valor 
        cadena.set(referencia.getReferencia(), reemplazo);

        // De acuerdo al movimiento que requeria el cabeza así es realizado
        asignarReferencia(referencia);
        // O sea si tenia que moverse a la derecha, se suma +1 o a la izquierda se resta 1

      

        try {
            System.out.println("\t\tVelocidad : "+vista.PanelMaquina.velocidad);
            Thread.sleep(vista.PanelMaquina.velocidad);
            // El proceso ocurre muy rápido si transcurre sin un descanso, por eso se colocó este Sleep

        } catch (InterruptedException ex) {
            Logger.getLogger(Transicion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.destino;

    }

    private boolean asignarReferencia(Apuntador ref) {

        switch (movimiento) {
            case DERECHA:
                ref.setReferencia(ref.getReferencia() + 1);
                break;
            case IZQUIERDA:
                ref.setReferencia(ref.getReferencia() - 1);
                break;
            case DETENER:
                ref.setReferencia(ref.getReferencia());
                break;
            default:
                System.err.println("Error al mover el Apuntador");
                break;
        }
        return true;
    }

    public String getEvaluar() {
        return evaluar;
    }

    public void setEvaluar(String evaluar) {
        this.evaluar = evaluar;
    }

    public String getReemplazo() {
        return reemplazo;
    }

    public void setReemplazo(String reemplazo) {
        this.reemplazo = reemplazo;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public void transicion() {
        System.out.println(evaluar + " / " + reemplazo + "," + movimiento);
    }

}
