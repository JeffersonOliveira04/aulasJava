package Aula013.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com metros:");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + " m � igual a " + cm + " cm");

	}

}
