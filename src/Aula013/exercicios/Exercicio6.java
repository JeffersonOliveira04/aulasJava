package Aula013.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do c?rculo");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow (raio, 2);
		
		 System.out.println("A ?rea do c?rculo ?: " + area);
		 

	}

}
