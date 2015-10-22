/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.modelo;

/**
 *
 * @author UTFPR
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;
            
    
    public Pessoa(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    
}
