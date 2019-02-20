/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Diego
 */
public class Lampada {
    
    private boolean ligado = false;
    private int intensidade = 0;
    private String cor = "amarelo";
    
    public boolean EstaLigado(){
        if(ligado)
            return true;
        else
            return false;
    }
    
    public int getIntensidade(){
        return intensidade;
    }
    
    public void setIntensidade(int valor){
        this.intensidade = valor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public Lampada(){}
    
    public Lampada(boolean ligado){
        this.ligado = ligado;
    }
    
    public void Ligar(){
        ligado = true;
    }
    
    public void Desligar(){
        ligado = false;
    }
    
}
