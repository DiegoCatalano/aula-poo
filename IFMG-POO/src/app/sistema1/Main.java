/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.sistema1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Diego
 */
public class Main {
    
    //Declarei a lista de clientes fora do escopo da main
    static List<Cliente> clientes = new ArrayList<>();
    static List<Produto> produtos = new ArrayList<>();
    
    public static String input(String titulo){
        return JOptionPane.showInputDialog(titulo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        clientes.add(new Cliente("diego", "123", 20));
        
        //Exemplo de conversao
        int x = 10;
        String val = String.valueOf(x);
        int y = Integer.valueOf(val);
        
        String op = "";
        while(!op.equals("0")){
            System.out.println("Sistema de vendas");
            System.out.println();
            System.out.println("Opções");
            System.out.println("0 - Sair do sistema");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar produto");
            //Caso existir o cliente com o cpf informado, retorne o nome do cliente, caso contrario, retorne "Cliente não cadastrado"
            System.out.println("3 - Consultar cliente por cpf");
            //Listar as descricoes de todos os produtos em que o valor informado seja maior do que x
            System.out.println("4 - Listar produtos >= x");
            
            op = input("Digite uma opção ?");
            switch(op){
                case "1":
                    CadastrarCliente();
                break;
                case "2":
                    CadastrarProduto();
                break;
                case "3":
                    ConsultarCpf();
                break;
                case "4":
                    ListarProdutos();
                break;
            }
            
            
        }
        
    }

    private static void CadastrarCliente() {
        
        String nome = input("Digite o nome do cidadao");
        String cpf = input("Digite o cpf do cidadao");
        int idade = Integer.valueOf(input("Digite a idade do cidadao"));
        
        clientes.add(new Cliente(nome, cpf, idade));
        System.out.println("Clientes cadastrados: " + clientes.size());
        
    }

    private static String ConsultarCpf() {
        
        String cpf = input("Digite o cpf do cidadao");
        
        for (Cliente cliente : clientes) {
            if(cliente.getCpf().equals(cpf)){
                return cliente.getNome();
            }
        }
        
        return "Cliente n cad.";
        
    }

    private static void CadastrarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ListarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
