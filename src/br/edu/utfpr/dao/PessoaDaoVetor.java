/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoVetor implements Dao{

    private Pessoa lista[];
    private int i;
    

    public PessoaDaoVetor(int i) {
       lista = new Pessoa[5];
       this.i = i;
    }
    
    @Override
    public void adicionar(Pessoa p) {
          if(i <= 5){
             lista[i] = p; 
             i++;
              System.out.println("Adicionando " + p.getNome());
        }
    }

    @Override
    public void remover(Pessoa p) {
      // arrumar o remover
        
        if(i > 0){
            for(int cont=0;cont<i;cont++){
                if(lista[cont] == p){
                    System.out.println("Removendo " + p.getNome());
                    i--;
                }else if(lista[cont] == null){
                    
                }
            }            
        }
        
        
    }

    @Override
    public void listarTudo() {
            for(int cont=0;cont<i;cont++){
                if(lista[cont] != null){
                     System.out.println(lista[cont]);
                }
            }
    
    }
}