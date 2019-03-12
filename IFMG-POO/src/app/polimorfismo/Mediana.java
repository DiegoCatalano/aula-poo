/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.polimorfismo;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class Mediana implements IFuncao{

    @Override
    public double Calcular(double[] x) {
        
        Arrays.sort(x, 0, x.length);
        return x[x.length/2];
        
    }
    
}
