package exerciciosJava;

import java.util.Scanner;

public class exec03 {
	public static void main(String [] args) {
	
		Scanner scan = new Scanner(System.in);
	
		boolean infoValida = false;
	
		String nome;
		int idade;
	
	do {
		System.out.println("Entre com o nome:");
		
		nome = scan.next();
			
			if (nome.length() >= 3){
				infoValida = true;
				
		}else {
				System.out.println("O nome precisa de no mínomo 3 caracteres.");
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
			
	}

}
