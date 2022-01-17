package Aula017.exerciciosJava;

import java.util.Scanner;

public class exec02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			System.out.println("Entre com o nome de usu�rio:");
			nomeUser = scan.next();
			
			System.out.println("Entre com a senha:");
			senha = scan.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual ao usu�rio, digite novamente:");
			}else {
				infoValidas = true;
				System.out.println("Senha e usu�rio v�lidos.");
				
			}
		}while (!infoValidas);

	}

}
