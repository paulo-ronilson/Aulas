/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.controles;

/**
 *
 * @author 20171144010023
 */
public class ExemploFor {
    public static void main(String[] args) {
        //for (inicialização;teste;incremento)
        //Exemplo de for infinito
        /*
        for (;;){
             System.out.println("Paulo");
        }     
        */
        
        //1 - 100
        for (int i=1; i<=100 ; i++){
            System.out.println(i);
        }
        
        //1 - 99; Passo 2
        for (int i=1; i<=100 ; i = i + 2){
            System.out.println(i);
            
        Carro [] carros = new Carro [3];
        carros[0] = new Carro();
        carros[0].setCor("branco");
        for (Carro carro : carros){
            System.out.println(carro);
        }
        }
        }
}
