/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoVetor implements Dao {

    private Pessoa lista[];
    
    public PessoaDaoVetor(){
        lista = new Pessoa[5];
    }
    
    @Override
    public void adicionar(Pessoa p) {
    
    }

    @Override
    public void remover(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarTudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
