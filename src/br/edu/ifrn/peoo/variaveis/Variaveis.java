/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.variaveis;

/**
 *
 * @author 20171144010023
 */
public class Variaveis {
    public static void main(String[] args) {
        //Tipo + nome + [ =valor] + ;
        byte varByte = 12;
        int varInt = 1278;
        long varLong = 1234L;
        short varShort = 123;
        long somaLong = varInt + varLong;
        
        // Tipos reais
        float varFloat = 13.78F;
        double varDouble = 1234.78;
        double valorNotacaoCientifica = 5e3;
        
        // Operação de cast (converção explícita)
        //var = (tipo) variável/operação
        varInt = (int) varFloat;
        
        //Tipo caractere
        char varChar = 'g';
        char varCharUnicode = '\u0061';
        varInt = varCharUnicode; 
        System.out.println(varInt);
        
        // Caracteres especiais 
        System.out.println("caracteres de tabulaçãs\tno Java");
        System.out.println("caracteres quebra de linha\nJava");
    }
}
