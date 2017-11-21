/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automata2017;

import java.util.ArrayList;

/**
 *
 * @author NSnietol
 */
public class Maquina implements Estandar {

    private final ArrayList<String> cinta;

    private final ArrayList<Nodo> nodos;

    private ArrayList<String> convertir(String cad) {

        ArrayList<String> list = null;
        if (cad.length() > 0) {
            list = new ArrayList<>();
            for (int i = 0; i < cad.length(); i++) {
                list.add(String.valueOf(cad.charAt(i)));
            }

        }

        return list;

    }

    public Maquina(String cadena) {

        this.cinta= (convertir(cadena));

        nodos = new ArrayList<>();
        Nodo q0 = new Nodo(0);
        Nodo q1 = new Nodo(1);
        Nodo q2 = new Nodo(2);
        Nodo q3 = new Nodo(3);
        Nodo q4 = new Nodo(4);
        Nodo q5 = new Nodo(5);
        Nodo q6 = new Nodo(6);
        Nodo q7 = new Nodo(7);
        Nodo q8 = new Nodo(8);
        Nodo q9 = new Nodo(9);
        Nodo q10 = new Nodo(10);
        Nodo q11 = new Nodo(11);
        Nodo q12 = new Nodo(12);
        Nodo q13 = new Nodo(13);
        Nodo q14 = new Nodo(14);
        Nodo q15 = new Nodo(15);
        Nodo q16 = new Nodo(16);
        Nodo q17 = new Nodo(17, true);

        //Qo
        Transicion t1 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, DERECHA, q1);
        q0.getTransiciones().add(t1);

        //Q1
        Transicion t2 = new Transicion("1", "1", DERECHA, q1);
        Transicion t3 = new Transicion("0", "0", DERECHA, q1);
        Transicion t4 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, IZQUIERDA, q2);

        q1.getTransiciones().add(t2);
        q1.getTransiciones().add(t3);
        q1.getTransiciones().add(t4);

        //Q2
        Transicion t5 = new Transicion("0", CARACTERINTERMEDIO, DERECHA, q3);
        Transicion t6 = new Transicion("1", CARACTERINTERMEDIO, DERECHA, q9);

        q2.getTransiciones().add(t5);
        q2.getTransiciones().add(t6);

        //Q3
        Transicion t7 = new Transicion("1", "1", DERECHA, q4);
        Transicion t8 = new Transicion("0", "0", DERECHA, q4);
        Transicion t9 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, DERECHA, q3);

        q3.getTransiciones().add(t7);
        q3.getTransiciones().add(t8);
        q3.getTransiciones().add(t9);

        //Q4
        Transicion t10 = new Transicion("1", "1", DERECHA, q4);
        Transicion t11 = new Transicion("0", "0", DERECHA, q4);
        Transicion t12 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, IZQUIERDA, q5);
        Transicion t13 = new Transicion(CARACTERESPECIAL, CARACTERESPECIAL, IZQUIERDA, q5);

        q4.getTransiciones().add(t10);
        q4.getTransiciones().add(t11);
        q4.getTransiciones().add(t12);
        q4.getTransiciones().add(t13);

        //Q5
        Transicion t14 = new Transicion("0", CARACTERINTERMEDIO, DERECHA, q6);
        Transicion t15 = new Transicion("1", CARACTERINTERMEDIO, DERECHA, q7);

        q5.getTransiciones().add(t14);
        q5.getTransiciones().add(t15);

        //Q6
        Transicion t16 = new Transicion(CARACTERINTERMEDIO, "0", IZQUIERDA, q8);
        Transicion t17 = new Transicion(CARACTERESPECIAL, "1", IZQUIERDA, q8);

        q6.getTransiciones().add(t16);
        q6.getTransiciones().add(t17);

        //Q7
        Transicion t18 = new Transicion(CARACTERINTERMEDIO, "1", IZQUIERDA, q8);
        Transicion t19 = new Transicion(CARACTERESPECIAL, "0", IZQUIERDA, q13);

        q7.getTransiciones().add(t18);
        q7.getTransiciones().add(t19);

        //Q8
        Transicion t20 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, IZQUIERDA, q8);
        Transicion t21 = new Transicion(CARACTERVACIO, CARACTERVACIO, DERECHA, q16);
        Transicion t22 = new Transicion("0", "0", IZQUIERDA, q15);
        Transicion t23 = new Transicion("1", "1", IZQUIERDA, q15);

        q8.getTransiciones().add(t20);
        q8.getTransiciones().add(t21);
        q8.getTransiciones().add(t22);
        q8.getTransiciones().add(t23);
        // Q9

        Transicion t24 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, DERECHA, q9);
        Transicion t25 = new Transicion("0", "0", DERECHA, q10);
        Transicion t26 = new Transicion("1", "1", DERECHA, q10);

        q9.getTransiciones().add(t24);
        q9.getTransiciones().add(t25);
        q9.getTransiciones().add(t26);

        //Q10
        Transicion t30 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, IZQUIERDA, q11);
        Transicion t27 = new Transicion(CARACTERESPECIAL, CARACTERESPECIAL, IZQUIERDA, q11);
        Transicion t28 = new Transicion("0", "0", DERECHA, q10);
        Transicion t29 = new Transicion("1", "1", DERECHA, q10);

        q10.getTransiciones().add(t29);
        q10.getTransiciones().add(t27);
        q10.getTransiciones().add(t28);
        q10.getTransiciones().add(t30);

        // Q11
        Transicion t31 = new Transicion("1", CARACTERINTERMEDIO, DERECHA, q12);
        Transicion t32 = new Transicion("0", CARACTERINTERMEDIO, DERECHA, q7);
        q11.getTransiciones().add(t31);
        q11.getTransiciones().add(t32);

        // Q12
        Transicion t33 = new Transicion(CARACTERINTERMEDIO, "0", IZQUIERDA, q13);
        Transicion t34 = new Transicion(CARACTERESPECIAL, "1", IZQUIERDA, q13);

        q12.getTransiciones().add(t33);
        q12.getTransiciones().add(t34);

        //Q13
        Transicion t35 = new Transicion(CARACTERINTERMEDIO, CARACTERESPECIAL, IZQUIERDA, q8);

        q13.getTransiciones().add(t35);

        //Q14
        Transicion t36 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, IZQUIERDA, q14);

        Transicion t37 = new Transicion("0", "0", DETENER, q2);
        Transicion t38 = new Transicion("1", "1", DETENER, q2);

        q14.getTransiciones().add(t36);
        q14.getTransiciones().add(t37);
        q14.getTransiciones().add(t38);

        // Q15
        Transicion t41 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, IZQUIERDA, q14);
        Transicion t39 = new Transicion("0", "0", IZQUIERDA, q15);
        Transicion t40 = new Transicion("1", "1", IZQUIERDA, q15);

        q15.getTransiciones().add(t39);
        q15.getTransiciones().add(t40);
        q15.getTransiciones().add(t41);

        // Q16
        Transicion t42 = new Transicion(CARACTERINTERMEDIO, CARACTERINTERMEDIO, DERECHA, q16);
        Transicion t43 = new Transicion(CARACTERESPECIAL, "1", DERECHA, q16);
        Transicion t44 = new Transicion("0", "0", DETENER, q17);
        Transicion t45 = new Transicion("1", "1", DETENER, q17);

        q16.getTransiciones().add(t42);
        q16.getTransiciones().add(t43);
        q16.getTransiciones().add(t44);
        q16.getTransiciones().add(t45);

        nodos.add(q0);
        nodos.add(q1);
        nodos.add(q2);
        nodos.add(q3);
        nodos.add(q4);
        nodos.add(q5);
        nodos.add(q6);
        nodos.add(q7);
        nodos.add(q8);
        nodos.add(q9);
        nodos.add(q10);
        nodos.add(q11);
        nodos.add(q12);
        nodos.add(q13);
        nodos.add(q14);
        nodos.add(q15);
        nodos.add(q16);
        nodos.add(q17);

    }

    private void mostrar() {
        cinta.forEach((string) -> {
            System.out.print(string);
        });
        System.out.println("");

    }

 

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public ArrayList<String> getCinta() {
        return cinta;
    }
    
    
    

    public ArrayList<String> toWork(Apuntador apuntar) {

        Nodo valor = nodos.get(0);


      
        while (valor.aceptacion() != true) {

            valor = valor.evaluar(cinta, apuntar);

        }
        
        System.out.println("Llegó al Estado q" + valor.getId());
        return cinta;

    }

}

