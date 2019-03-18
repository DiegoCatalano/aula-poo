/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.comparacao;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Comparacao de tipos primitivos usa "==", para não primitivos, utiliza o método .equals()
        
        //Exemplo 1
        int x = 10;
        int y = 15;
        
        boolean t1 = x == y;
        
        //Strings
        String texto1 = "oi";
        String texto2 = "oi";
        
        boolean t2 = texto1.equals(texto2);
        
    }
    
}
