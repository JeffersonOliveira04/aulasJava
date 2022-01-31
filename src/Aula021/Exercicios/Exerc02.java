package Aula021.Exercicios;

public class Exerc02 {
	public static void main(String[] args) {
		
		Campeao campeao = new Campeao();
		campeao.nome = "Vayne";
		campeao.funcão = "Atirador";
		campeao.anoLancamento = 2011;
		campeao.passiva = "Caçadora noturna";
		campeao.primeiraHabilidade = "Rolamento";
		campeao.segundaHabilidade = "Dardos de prata";
		campeao.segundaHabilidade = "Condenar";
		campeao.ultimate = "Hora final";
		
		
		System.out.println("O Campeão " + campeao.nome + " tem a função " + campeao.funcão + " Foi lançada em " + campeao.anoLancamento);
		
	}
}
