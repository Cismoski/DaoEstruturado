/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao {

    Statement stmt;

    //Quando contruir  a classe, conectar em um banco
    public PessoaDaoDerby() {
        String username = "cismoski";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MeuBancoDeDados";

        // depois mandar conectar
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();

        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
        System.out.println("Conexão estabelecida.");
    }

    @Override
    public void adicionar(Pessoa p) {
       String instrucao = "INSERT INTO PESSOA (NOME,SOBRENOME,IDADE) VALUES(" + "\'" + p.getNome() + "\'" + "," + "\'" + p.getSobrenome() + "\'" + ","+ p.getIdade() + ")";
       
        System.out.println(instrucao);
       try{
           stmt.executeUpdate(instrucao);
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
        System.out.println("Dado adicionado.");
    }

    @Override
    public void remover(Pessoa p) {
        //DELETE FROM CISMOSKI.PESSOA WHERE NOME = 'Joao' AND SOBRENOME = 'Silva' AND IDADE = 20;
        
        String instrucao = "DELETE FROM PESSOA WHERE NOME = " + "\'" + p.getNome() +"\'";
        
        System.out.println(instrucao);
        try{
           stmt.executeUpdate(instrucao);
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
        System.out.println("Dado removido.");
    }

    @Override
    public void listarTudo() {
        ArrayList dados;
        
        dados = new ArrayList<>();
        // Fazer array pra nome, idade e sobrenome.
        try{
           for(int i=0;i<5;i++){
            dados.add(stmt.executeUpdate("SELECT "+i+" FROM #"));
           }
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
        for (Object dado : dados) {
            System.out.println(dado);
        }
    }
 }


