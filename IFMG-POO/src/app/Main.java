/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Main {
    
        //Criar as listas de cliente e produto
    static List<Cliente> clientes = new ArrayList<>();
    static List<Produto> produtos = new ArrayList<>();
    
    public static String input(String title){
        return JOptionPane.showInputDialog(title);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String op = "";
        while (!op.equals("0")){
            
            System.out.println("Sistema de vendas");
            System.out.println("Digite uma opção");
            System.out.println();
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar produto");
            //Caso o cliente exista, informe todos os dados dele, caso contrario, informe "Cliente n cadastrado"
            System.out.println("3 - Consultar cliente");
            System.out.println("4 - Listar produtos com valores >= x");
            System.out.println();
            System.out.print("-> ");
            
            op = input("Digite a opção ?");
            
            switch (op) {
                case "0":
                    break;
                case "1":
                    CadastrarCliente();
                    break;
                case "2":
                    CadastrarProduto();
                    break;
                default:
                    break;
            }
            
        }
        
    }

    private static void CadastrarCliente() {
        
        String nome = input("Digite o nome do cidadao");
        String cpf = input("Digite o cpf do cidadao");
        int idade = Integer.valueOf(input("Digite a idade do cidadao"));
        
        //Cerebro nivel 1
//        Cliente cli = new Cliente();
//        cli.setNome(nome);
//        cli.setCpf(cpf);
//        cli.setIdade(idade);
//        
//        clientes.add(cli);

        //Cerebro nivel 2
//        Cliente cli = new Cliente(nome, cpf, idade);
//        clientes.add(cli);

        //Cerebro nivel 3
        clientes.add(new Cliente(nome, cpf, idade));
        
        
    }
    
    private static void CadastrarProduto(){
        String descricao = input("Digite a descricao do produto");
        double valor = Double.valueOf(input("Digite o valor do produto"));
        produtos.add(new Produto(descricao, valor));
    }
    
}
