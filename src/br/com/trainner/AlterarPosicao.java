package br.com.trainner;

import java.util.Scanner;

public class AlterarPosicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer [] vetor = new Integer [4];
		Integer numA;
		Integer numB;
		String condicao = "sim";
		
		vetor [0] = 10 ;
		vetor [1] = 20 ;
		vetor [2] = 30 ;
		vetor [3] = 40 ;
		do {
			System.out.println("Digite a Posi��o do seu vetor");
			numA = sc.nextInt();
			System.out.println ("Digite o valor a ser inserido na pos��o  " +numA);
			numB = sc.nextInt();
			vetor[numA] = numB;
			System.out.println("Digite Sim Para continuar altera��es ou N�o Para parar.");
			condicao = sc.next();
			System.out.println("O valor Foi Alterado para : " + vetor[numA] );
			
		} while (condicao.equals("sim"));
		
		     }
}

