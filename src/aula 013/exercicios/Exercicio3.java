package aula13.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out .println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out .println("Entre com o segundo n�mero:");
		int num2 = scan.nextInt();
		
		int resultado = num1 + num2;
		System.out .println("A soma dos numeros �: " + resultado);
		
	}

}
