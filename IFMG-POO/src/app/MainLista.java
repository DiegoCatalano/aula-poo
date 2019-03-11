/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class MainLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criar as listas de cliente e produto
        List<Cliente> clientes = new ArrayList<>();
        
        String nome = "fulano";
        String cpf = "12312312300";
        int idade = 20;
        
        //1o: Forma
//        Cliente cli = new Cliente();
//        cli.setNome(nome);
//        cli.setCpf(cpf);
//        cli.setIdade(idade);
//        
//        clientes.add(cli);

        //2o: Forma
        clientes.add(new Cliente(nome, cpf, idade));
        
        
    }
    
}
