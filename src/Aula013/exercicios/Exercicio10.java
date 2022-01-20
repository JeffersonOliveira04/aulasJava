package Aula013.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura Celsius:");
		double c = scan.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A temperatura " + c + "C é igual a " + f + "F" );
	}

}
