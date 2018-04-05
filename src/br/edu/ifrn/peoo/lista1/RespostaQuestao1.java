package br.edu.ifrn.peoo.lista1;

import java.util.Scanner;

/**
 *
 * @author 20171144010023
 */
public class RespostaQuestao1 {
    public static void main(String[] args) {
        double base, altura, areaTriangulo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor da base: ");
        base = scanner.nextDouble();
        System.out.print("Digite um valor da altura: ");
        altura = scanner.nextDouble();
        areaTriangulo = base * altura/2;
        System.out.println("A area do triangulo é: " + areaTriangulo);
    }
    
} 
