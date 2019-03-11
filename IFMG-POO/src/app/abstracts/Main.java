/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.abstracts;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractFuncionario fun = new Motorista("nome", 10);
        AbstractFuncionario vend = new Vendedor("nome", 10);
        
        int stop = 0;
        
//        Motorista motorista = new Motorista("cidadao", 10);
//        Vendedor vendedor = new Vendedor("nome", 10);
//        
//        double x = motorista.getBonificacao();
//        System.out.println(x);
        
        
        
    }
    
}
