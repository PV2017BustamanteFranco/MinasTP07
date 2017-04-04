/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

/**
 *
 * @author Alumno
 */

public class FactorialN {

    public FactorialN() {
    }

    public FactorialN(int n) {
        this.n = n;
    }
    
    private int n;
   public void asignarValor (int num) {
        setN(num);
   } 
   public int obtenerFactorial () {
      int valorFactorial=1;
      int aux=getN();
      while (getN()>=1) {
          valorFactorial=valorFactorial*getN();
            setN(getN() - 1);
      }
        setN(aux);
      return valorFactorial;
   }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
}
