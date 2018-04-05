/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.resposta4;

import java.util.Scanner;

/**
 *
 * @author 20171144010023
 */
public class RespostaQuestão4 {
    public static void main(String[] args) {
        
    int a, b, c;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Valor de A: ");
    a = scanner.nextInt();
    System.out.print("Valor de B: ");
    b = scanner.nextInt();
    System.out.print("Valor de C: ");
    c = scanner.nextInt();
    
    double r = Math.pow((a + b),2);
    double s = Math.pow((b + c),2);
    double d = (r + s)/2.0;
}
}
