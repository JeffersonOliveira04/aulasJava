package Aula013.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado:");
		double lado = scan.nextDouble();
		
		double area = Math.pow (lado, 2);
		
		System.out.println("A ?rea do quadrado ?: " + area);
		System.out.println("O dobro da ?rea do quadrado ?: "  + (area * 2));
		
		
	

	}

}
