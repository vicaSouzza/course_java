package exerciciosParte2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if  (A % B == 0 || B % A == 0) {
			     System.out.println("S�O MULTIPLOS");
		}
		else {
			    System.out.println("N�O S�O MULTIPLOS");
		}
		
		sc.close();
	}

}
