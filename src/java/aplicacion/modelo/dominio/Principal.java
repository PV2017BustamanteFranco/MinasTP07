/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import Factorial.FactorialN;

/**
 *
 * @author Alumno
 */
public class Principal {
    public static void main (String[] wee) {
        Principal.mostrarFactorial();
    }
    public static void mostrarFactorial () {
        FactorialN fac=new FactorialN();
        
        fac.asignarValor(5);
        int resultado=fac.obtenerFactorial();
        System.out.println("El factorial es: " + resultado);
    }
}

