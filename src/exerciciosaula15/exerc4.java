package aula13.exercicios.exerciciosaula15;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com uma letra:");
		String letra = scan.next();
		
		switch(letra){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("vogal"); break;
			default: System.out.println("consoante");
			
		}


	}

}
