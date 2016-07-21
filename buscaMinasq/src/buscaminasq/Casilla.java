/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasq;

/**
 *
 * @author Maurisio
 */
public class Casilla {
    public char estado;
    public boolean minada;
    
    public Casilla(){
        estado='T';
        minada=false;
    }

    

    public boolean casillaTapada() {
        return estado=='T';
    }

    public void destapar() {
       estado='D';
    }

    public void minar() {
        minada=true;
    }
    

    

}
