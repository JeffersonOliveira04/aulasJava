package Aula022;

public class exerc02 {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
			
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque  efetuado com sucesso");
			conta.consultarSaldo();
			
		} else {
			System.out.println("N�o foi possivel realizar saque. Saldo insuficiente");
		}
		
		boolean saqueEfetuado1 = conta.realizarSaque(500); 
		
		if (saqueEfetuado1) {
			System.out.println("Saque  efetuado com sucesso");
			conta.consultarSaldo();
			
		} else {
			System.out.println("N�o foi possivel realizar saque. Saldo insuficiente");
		}
		System.out.println("Dep�sito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();
	}
}