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
 public class Tablero {
    public Casilla[][] matriz;
    public Tablero(int tamanho){
        matriz=new Casilla[tamanho][tamanho];
    }

    public boolean valido() {
        return matriz.length>0;
    }

    
    public void colocarCasillas() {
        for(int i = 0; i < matriz.length; i++ ){
          for(int j = 0; j < matriz.length; j++ ){
              matriz[i][j] = new Casilla();
          }
         }
    }

    public int contarMinas() {
        int respuesta=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j].minada==true){
                    respuesta+=1;
                }
            }
        }
        return respuesta;
    }
}
