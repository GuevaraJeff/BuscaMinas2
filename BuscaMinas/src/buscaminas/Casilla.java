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
    public char estado;
    public char estadoSecundario;//falta implemtentar los metodos necesarios para que esto funcione
    public Casilla()
    {
        this.estado =' ';
        this.estadoSecundario='t'; 
   }
    public boolean casillaVacia() {
        return estado == ' ';
    }

    public void minar() {
        estado = '*';
    }

    public void Tapar() {
        estado='t';
    }

    public boolean casillaTapada() {
        return estado=='t';
    }

    public void Destapar() {
        estado='d';
    }
   
}
