package Aula013.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor hora de trabalho: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no m�s:");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		System.out.println("O salario � de: " + salario);
		
		
		

	}

}
