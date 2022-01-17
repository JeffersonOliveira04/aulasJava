package Aula017.exerciciosJava;

import java.util.Scanner;

public class exec03 {
	public static void main(String [] args) {
	
		Scanner scan = new Scanner(System.in);
	
		boolean infoValida = false;
	
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
	
	do {
		System.out.println("Entre com o nome:");
		
		nome = scan.next();
			
			if (nome.length() >= 3){
				infoValida = true;
				
		}else {
				System.out.println("O nome precisa de no m�nimo 3 caracteres.");
				}
	   }while(!infoValida);
	
		infoValida = false;
		
		do {
			System.out.println("Entre com sua idade");
			
			idade = scan.nextInt();
				
				if (idade >= 0  && idade <= 150) {
					infoValida = true;
					
			}else {
					System.out.println("A idade precisa ser entre 0 e 150:");
					}
		   }while(!infoValida);
		
		
			infoValida = false;
			
			do {
				
			System.out.println("Entre com sal�rio:");
			
			salario = scan.nextDouble();
				
				if (salario > 0 ) {
					infoValida = true;
					
			}else {
					System.out.println("O sal�rio precisa ser maior que 0:");
					}
		   }while(!infoValida);
			
			infoValida = false;
			
			do {
				System.out.println("Entre com  sexo");
				
				sexo = scan.next();
					
					if (sexo.equalsIgnoreCase("f") ||
							sexo.equalsIgnoreCase("m")) {
						infoValida = true;
						
				}else {
						System.out.println("O sexo precisa ser 'f' ou 'm':");
						}
			   }while(!infoValida);
			
			infoValida = false;
			
			do {
				System.out.println("Entre estado civil");
				
				estadoCivil = scan.next(); 
					
					if (estadoCivil.equalsIgnoreCase("s") ||
							estadoCivil.equalsIgnoreCase("c") ||
							estadoCivil.equalsIgnoreCase("v") ||
							estadoCivil.equalsIgnoreCase("d")) {
						infoValida = true;
						
				}else {
						System.out.println("O estado civil precisa ser 's', 'c', 'v' ou 'd':");
						}
			   }while(!infoValida);
			
				System.out.println("As seguintes informa��es foram coletadas:");
				System.out.println("Nome: " + nome); 
				System.out.println("Idade: " + idade);
				System.out.println("Sal�rio: " + salario);
				System.out.println("Estado Civil: " + estadoCivil);
	}

}
