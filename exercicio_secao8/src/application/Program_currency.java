package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;


public class Program_currency {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Cotação do dollar?");
	    Double precoDolar = sc.nextDouble();
		
		System.out.println("Quantos dolares irá comprar? ");
		double quantidade = sc.nextDouble();
		
        System.out.printf("O valor a ser pago é R$: %.2f%n", CurrencyConverter.ConverterMoeda(precoDolar, quantidade));
	}

}
