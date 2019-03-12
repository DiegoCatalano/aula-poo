/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.polimorfismo;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] x = {0,0,20,0,0};
        
        IFuncao f1 = new Media();
        IFuncao f2 = new Mediana();
        
        double r1 = f1.Calcular(x);
        double r2 = f2.Calcular(x);
        
        
    }
    
}
