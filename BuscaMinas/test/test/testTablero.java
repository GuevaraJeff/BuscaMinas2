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
    @Test
    public void contarUnaMina(){
        Tablero tablero=new Tablero(2);
        tablero.colocarCasillas();
        tablero.matriz[0][0].minar();
        int respuesta= tablero.contarMinas();
        assertEquals(1,respuesta);
    }
    @Test
    public void contarVariasMinas(){
        Tablero tablero=new Tablero(2);
        tablero.colocarCasillas();
        tablero.matriz[0][0].minar();
        tablero.matriz[0][1].minar();
        tablero.matriz[1][1].minar();
        int respuesta=tablero.contarMinas();
        assertEquals(3,respuesta);
    }
    
     @Test
     public void verificarPosicionValida(){
         Tablero tablero =new Tablero(3);
         boolean respuesta= tablero.posicionValida(0,0);
         assertTrue(respuesta);
     }
     @Test
     public void verificarPosicionValidaEficientemente(){
         Tablero tablero =new Tablero(3);
         boolean respuesta= tablero.posicionValida(0,0)&&tablero.posicionValida(1,0)&&tablero.posicionValida(2,2);
         assertTrue(respuesta);
     }@Test
     public void verificarPosicionNoValida(){
         Tablero tablero=new Tablero(3);
         boolean respuesta=tablero.posicionValida(4,0);
         assertFalse(respuesta);
     }
     public void contarUnaMinaAlrededorDeUnaCasilla(){
        Tablero tablero=new Tablero(3);
        tablero.colocarCasillas();
        tablero.matriz[0][0].minar();
        int respuesta=tablero.contarMinasAlrededor(1,1);
        assertEquals(1,respuesta);
    }
     
}

