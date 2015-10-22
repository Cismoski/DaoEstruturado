/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import java.util.ArrayList;
import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoArrayList implements Dao{

    private ArrayList<Pessoa> lista;
    
    public PessoaDaoArrayList(){
        lista = new ArrayList<>();
    }
    
    @Override
    public void adicionar(Pessoa p) {
        lista.add(p);
        System.out.println("A pessoa \"" + p.getNome() + "\" foi adicionada");
    }

    @Override
    public void remover(Pessoa p) {
        lista.remove(p);
        System.out.println("A pessoa \"" + p.getNome() + "\" foi removida");
    }   

    public void listarTudo(Pessoa p){
        //Temos que percorrer o Arraylist
        //de sua posição inicial até a final... mas qual final??
        //temos um topo?
        //vamos usar um for-each para resolver
        System.out.println("Inicio da relação: ");
        for (Pessoa elementoDaLista : lista){
            System.out.println();
        }
        System.out.println("Fim da relação");
    }

    @Override
    public void listarTudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
