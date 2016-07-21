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
        int respuesta=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j].estado=='*'){
                    respuesta+=1;
                }
            }
        }
        return respuesta;
    }

    public void colocarCasillas() {
        for(int i = 0; i < matriz.length; i++ ){
          for(int j = 0; j < matriz.length; j++ ){
              matriz[i][j] = new Casilla();
          }
         }
    }

    

    public boolean posicionValida(int x, int y) {
        return x<matriz.length && y<matriz[0].length;
    }
    
    public int contarMinasAlrededor(int x, int y) {
       return 1;
    }
}
