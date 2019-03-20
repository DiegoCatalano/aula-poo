/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.listas;

import app.sistema1.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] v = {20,10,2,50,3000,1,200,200,0,-20};
        Arrays.sort(v, 0, v.length);
        
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("lapis", 30));
        produtos.add(new Produto("caneta", 20));
        produtos.add(new Produto("borracha", 50));
        
//        //Ordernar de forma padrao
//        Collections.sort(produtos);
//        
//        Collections.sort(produtos, new Comparator<>() {
//            @Override
//            public int compare(Produto o1, Produto o2) {
//                return o1.getDesc().compareTo(o2.getDesc());
//            }
//        });
    }
    
}
