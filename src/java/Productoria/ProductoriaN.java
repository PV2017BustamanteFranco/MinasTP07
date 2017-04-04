/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productoria;

/**
 *
 * @author Alumno
 */
public class ProductoriaN {
    private int n;

    public ProductoriaN() {
    }

    public ProductoriaN(int n) {
        this.n = n;
    }
    
    public void asignarValor(int num){
        setN(num);
    }
    public int obtenerProductoria(){
        int valorProductoria=1;
        int aux=1;
        
           
        while (aux<=(getN())){
             valorProductoria=aux*valorProductoria;
            aux=aux+1;
        }
        return valorProductoria;
    }
 
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
