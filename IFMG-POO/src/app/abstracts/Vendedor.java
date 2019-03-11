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
public class Vendedor extends AbstractFuncionario{

    public Vendedor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public double getBonificacao() {
        return this.salario * 1.2;
    }

    @Override
    public String Tipo() {
        return "Vendedor";
    }
    
    
    
}
