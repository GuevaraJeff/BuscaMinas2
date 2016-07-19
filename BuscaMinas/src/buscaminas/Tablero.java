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
public class Tablero {

    public Casilla matriz [][];
    public Tablero(int i) {
        matriz=new Casilla[i][i];
    }
   
    
    public boolean valido() {
        return matriz.length > 0;
    }

    public int contarMinas() {
        return 1;
    }

    public void colocarCasillas() {
        for(int i = 0; i < matriz.length; i++ ){
          for(int j = 0; j < matriz.length; j++ ){
              matriz[i][j] = new Casilla();
          }
         }
    }
    
}
