/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Maurisio
 */
public class  Casilla {
    char estado;
    public Casilla()
    {
        this.estado =' ';
    }
    public boolean casillaVacia() {
        return estado == ' ';
    }

    public void minar() {
        estado = '*';
    }
   
}
