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
public class Media implements IFuncao{

    public double Calcular2(double[] x){
        return 0;
    }
    
    @Override
    public double Calcular(double[] x) {
        
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        
        return sum / x.length;
        
    }
    
}
