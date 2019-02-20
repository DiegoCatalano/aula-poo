/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Representação de uma lampada
 * @author Diego
 */
public class Lampada {
    
    private boolean ligado = false;
    private float intensidade = 0;
    private String cor = "amarelo";
    
    public boolean EstaLigado(){
        if(ligado)
            return true;
        else
            return false;
    }
    
    /**
     * Recebe a intensidade da Lampada
     * @return Retorna um valor de [0..1]
     */
    public float getIntensidade(){
        return intensidade;
    }
    
    public void setIntensidade(float valor){
        this.intensidade = valor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    /**
     * 
     */
    public Lampada(){
        this(false);
    }
    
    public Lampada(boolean ligado){
        this(ligado, 0.7f);
    }
    
    public Lampada(boolean ligado, float intensidade){
        this(ligado, intensidade, "amarelo");
    }
    
    public Lampada(boolean ligado, float intensidade, String cor){
        this.ligado = ligado;
        this.intensidade = intensidade;
        this.cor = cor;
    }
    
    public void Ligar(){
        ligado = true;
    }
    
    public void Desligar(){
        ligado = false;
    }
    
}
