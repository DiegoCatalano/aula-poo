/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.sistema1;

/**
 *
 * @author Diego
 */
public class Produto implements Comparable{
    private String desc;
    private double preco;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String desc, double preco) {
        this.desc = desc;
        this.preco = preco;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(preco, ((Produto)o).getPreco());
    }
    
    
}
