/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Productoria.ProductoriaN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class ProductoriaFormBean {

    /**
     * Creates a new instance of ProductoriaFormBena
     */
    public ProductoriaFormBean() {
    }
 private int n;   
 
 public int calcularProductoria(){
     ProductoriaN unProductoria=new ProductoriaN();
     unProductoria.asignarValor(n);
     return unProductoria.obtenerProductoria();
     
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
