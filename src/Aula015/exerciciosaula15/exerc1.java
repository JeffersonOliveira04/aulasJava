package Aula015.exerciciosaula15;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo  numero:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O n�mero 1 � maior que o n�mero 2 " + num1);
		
		}else { System.out.println("O n�mero 2 � maior que o n�mero 1 " + num2);

	}

}
}