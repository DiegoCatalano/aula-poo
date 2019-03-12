/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.encapsulamento;

/**
 *
 * @author Diego
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private int idade;
    private boolean depressivo;
    
    //<editor-fold defaultstate="collapsed" desc="Get;Set">
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        //muitas coisas legais eu posso fazer aki
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public boolean isDepressivo() {
        return depressivo;
    }
    
    public void setDepressivo(boolean depressivo) {
        this.depressivo = depressivo;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    //</editor-fold>
    
}
