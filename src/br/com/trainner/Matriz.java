package br.com.trainner;

public class Matriz {
	public static void main(String[] args) {
		Integer[][] matriz = new Integer [10][10];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i==j) {
					System.out.print(" 0");
				}else if (i<j){
					System.out.print(" 1");
				}else{
					System.out.print("-1");
				}
			}
			System.out.println();
		}
		
	}

}
