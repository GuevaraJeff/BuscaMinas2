/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import buscaminas.Casilla;
import buscaminas.Tablero;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maurisio
 */
public class testTablero {
    
  @Test 
  public void verificarTamanho1(){
      Tablero tablero = new Tablero(1);
      int tamanho = tablero.matriz.length;
      
      assertEquals(1,tamanho);
  }
  @Test
   public void verificartamanhonovalido(){
     Tablero tablero=new Tablero(1);
     boolean respuesta = tablero.valido();
  
     assertTrue(respuesta);
    }
   @Test 
   public void verificarTamanhoNoValido(){
   
     Tablero tablero=new Tablero(0);
     boolean respuesta = tablero.valido();
  
     assertFalse(respuesta);
    }
   @Test
   public void verificarUnaCasillaCreadas(){
     Tablero tablero=new Tablero(2);
     tablero.colocarCasillas();
     
     assertNotNull(tablero.matriz[0][0]);
   }
     @Test
    public void verificarVariasCasillasCreadas(){
     Tablero tablero=new Tablero(2);
     tablero.colocarCasillas();
     
     assertNotNull(tablero.matriz[0][0]);
     assertNotNull(tablero.matriz[1][0]);
     assertNotNull(tablero.matriz[1][1]);
     assertNotNull(tablero.matriz[0][1]);
   }
}
