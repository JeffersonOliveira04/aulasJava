package exercicios.exerciciosaula15;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo  numero:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O número 1 é maior que o número 2 " + num1);
		
		}else { System.out.println("O número 2 é maior que o número 1 " + num2);

	}

}
}