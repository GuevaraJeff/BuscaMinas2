/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import buscaminas.Casilla;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Maurisio
 */
public class testCasilla {
    
    @Test
    public void testVerificarCasillaVacia(){
        Casilla cas = new Casilla();
        boolean respuesta = cas.casillaVacia();
        
        assertTrue(respuesta);
    }
    @Test
    public void testCasillaLlena(){
        Casilla casilla = new Casilla();
        casilla.minar();
        boolean respuesta = casilla.casillaVacia();
        
        assertFalse(respuesta);
    }
    @Test
    public void testCasillaTapada(){
        Casilla casilla=new Casilla();
        casilla.Tapar();
        boolean respuesta=casilla.casillaTapada();
        assertTrue(respuesta);
                
    }
    @Test
    public void testCasillaDestapada(){
        Casilla casilla=new Casilla();
        casilla.Destapar();
        boolean respuesta=casilla.casillaTapada();
        assertFalse(respuesta);
    }
}
