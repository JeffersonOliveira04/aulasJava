package Aula021.Exercicios;

public class Exerc02 {
	public static void main(String[] args) {
		
		Campeao campeao = new Campeao();
		campeao.nome = "Vayne";
		campeao.func�o = "Atirador";
		campeao.anoLancamento = 2011;
		campeao.passiva = "Ca�adora noturna";
		campeao.primeiraHabilidade = "Rolamento";
		campeao.segundaHabilidade = "Dardos de prata";
		campeao.segundaHabilidade = "Condenar";
		campeao.ultimate = "Hora final";
		
		
		System.out.println("O Campe�o " + campeao.nome + " tem a fun��o " + campeao.func�o + " Foi lan�ada em " + campeao.anoLancamento);
		
	}
}
