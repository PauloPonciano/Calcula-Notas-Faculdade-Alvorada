package br.com.trainner;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class NotaAluno {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 double primeiro;
		 double segundo;
		 double resultado = 0;
		 double soma = 0;
		 double exame = 10;
		 String ola = "a";
		
		System.out.println("Digite Sua nota do Primeiro Bimestre : ");
		primeiro = sc.nextDouble();
		if (primeiro != 0 ){
			System.out.println("Somente numeros, digite novamente");
			primeiro =sc.nextInt();
		}
		System.out.println("Digite Sua nota do Segundo Bimestre  :  ");
		segundo = sc.nextDouble();
		
		nota(exame,primeiro,segundo,resultado,soma);
		
	}
	public static Integer nota (double exame, double primeiro, double segundo, double resultado,double soma){
		if ((primeiro+segundo)/2.0 >= 7.0  ){
			System.out.println("Você esta APROVADO ");
			
		} else if ((primeiro+segundo)/2.0 < 4.0){
			System.out.println("Voce esta REPROVADO ");	
			
		} else if ((primeiro+segundo)/2.0 >= 4.0){
			
			soma = (primeiro+segundo) /2.0;
			resultado = exame - soma;
		
			System.out.println("Você esta de Exame, E sua nota na prova de  exame deve ser "+resultado + " para que você seja APROVADO");
		
			
		}
		
		
		
		return 0;
	}
	
}

