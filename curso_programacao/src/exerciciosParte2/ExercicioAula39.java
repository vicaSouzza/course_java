package exerciciosParte2;

import java.util.Scanner;

public class ExercicioAula39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "DOMINGO";
			break;
		case 2:
			dia = "SEGUNDA";
			break;
		case 3:
			dia = "TER�A";
			break;
		case 4:
			dia = "QUARTA";
			break;
		case 5:
			dia = "QUINTA";
			break;
		case 6:
			dia = "SEXTA";
			break;
		case 7:
			dia = "S�BADO";
			break;
		default:
			dia = "VALOR INVALIDO";
			break;
			
			
		}
		
			System.out.println("Dia da semana: " + dia);
			
			sc.close();

	}

}
