package Aula022;

public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String tipoluz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if (ligada) {
			
			System.out.println("Lâmpada está ligada ");
			
		} else {
			System.out.println("Lâmpada está desligada ");
		
		}
	}
}
