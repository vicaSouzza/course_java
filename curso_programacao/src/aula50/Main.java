package aula50;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
	    System.out.println("Quantos n�meros vo�� vai digitar? ");
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um n�mero: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		
		sc.close();

	}

}
