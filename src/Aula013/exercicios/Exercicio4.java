package aula13.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual sua nota do primeiro bimestre?:");
		double bim1 = scan.nextDouble();
		
		System.out.println("Qual sua nota do segundo bimestre?:");
		double bim2 = scan.nextDouble();
		
		System.out.println("Qual sua nota do terceiro bimestre?:");
		double bim3 = scan.nextDouble();
		
		System.out.println("Qual sua nota do quarto bimestre?:");
		double bim4 = scan.nextDouble();
		
		double resultado = (bim1 + bim2 + bim3 + bim4) / 4;
		
		
		System.out.println("Sua nota bimestral é: " + resultado);
		
		
		
	

	}

}
