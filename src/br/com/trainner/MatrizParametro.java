package br.com.trainner;

public class MatrizParametro {

	public static void main(String[] args) {
		String [][] time = new String [2][2];
		time [0][0] = "Palmeras";
		time [0][1] = "Santos";
		time [1][0] = "America";
		time [1][1] = "Paranaense" ;
		
		matriz(time);
	}
	static void matriz (String[][]time){
		for (int i = 0; i < time.length; i++) {
			for (int j = 0; j < time.length; j++) {
				System.out.println(time[i][j]);
			}
		}
	}

}
