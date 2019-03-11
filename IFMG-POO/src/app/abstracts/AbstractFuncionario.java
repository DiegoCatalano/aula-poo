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
public abstract class AbstractFuncionario {
    
    protected String nome;
    protected int idade;
    protected double salario;
    
    public abstract String Tipo();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificacao(){
        return this.salario * 1.1;
    }
    
}
