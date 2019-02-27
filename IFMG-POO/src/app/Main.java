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
        
        //Criei 2 clientes
        List<Cliente> clientes = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            
            String nome = input("Digite o nome");
            String cpf = input("Digite o cpf");
            int idade = Integer.valueOf(input("Digite a idade"));
            String telefone = input("Digite o telefone");
            
            clientes.add(new Cliente(nome, cpf, idade, telefone));
            
        }
        
        
        int stop = 0;
        
        
    }
    
//    public void mudarIntensidade(Lampada lamp){
//        lamp.setIntensidade(1);
//    }
    
}
