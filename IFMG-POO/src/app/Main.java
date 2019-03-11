/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Main {
    
    public static String input(String title){
        return JOptionPane.showInputDialog(title);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criar as listas de cliente e produto
        List<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        
        numeros.remove(1);
        
        
        
        
//        String op = "";
//        while (!op.equals("0")){
//            
//            System.out.println("Sistema de vendas");
//            System.out.println("Digite uma opção");
//            System.out.println();
//            System.out.println("0 - Sair");
//            System.out.println("1 - Cadastrar cliente");
//            System.out.println("2 - Cadastrar produto");
//            System.out.println();
//            System.out.print("-> ");
//            
//            op = input("Digite a opção ?");
//            
//            
//        }
        
        
    }
    
//    public void mudarIntensidade(Lampada lamp){
//        lamp.setIntensidade(1);
//    }
    
}
