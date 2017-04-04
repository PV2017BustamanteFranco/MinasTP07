/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumatoria;

/**
 *
 * @author Alumno
 */
public class SumatoriaN {
    private int n;

    public SumatoriaN() {
    }

    public SumatoriaN(int n) {
        this.n = n;
    }
    public void asignarValor (int num) {
        setN(num);
   } 
    
    public int obtenerSumatoria (){
        int valorSumatoria=0;
        int aux=1;
        do{
            valorSumatoria=(2*aux-4)+valorSumatoria;
            aux=aux+1;
        } while (aux<=n);
        
        return valorSumatoria;         
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
