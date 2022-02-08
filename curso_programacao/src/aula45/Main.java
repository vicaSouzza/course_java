package aula45;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x = sc.nextInt();
		
		int soma = 0;
		
		while(x != 0) {
			soma = soma + x;
			System.out.println("Digite um numero: ");
			x = sc.nextInt();
		}
		
		System.out.println("A soma dos números é: " + soma);
		
		
		
		
		
		
		sc.close();

	}

}
