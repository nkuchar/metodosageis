package metodosAgeis;

import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		
		Jogador jogador = new Jogador("Nelson");
		Jogador jogador2 = new Jogador("Faberson");
		
		Random rand = new Random();
		// 0 Pedra - 1 Tesoura - 2 Papel
		for (int i = 0; i < 10; i++) {
			jogador.setEscolha(rand.nextInt(3));
			jogador2.setEscolha(rand.nextInt(3));
			resultadoPo(jogador, jogador2);
		}		
	}
	
	public static Jogador resultadoPo(Jogador jogador, Jogador jogador2) {
		if(jogador.getEscolha() == jogador2.getEscolha()) {
			System.out.println("Empatou!");
			jogador.setResultado("Empate");
			return jogador;
		}else if(jogador.getEscolha() == 0 && jogador2.getEscolha() == 1) {
			System.out.println("Pedra ganha da Tesoura, Vitória do Jogador: " + jogador.getNome());
			jogador.setResultado("Vitória");
			return jogador;
		}else if(jogador.getEscolha() == 1 && jogador2.getEscolha() == 2) {
			System.out.println("Tesoura ganha do Papel, Vitória do Jogador: " + jogador.getNome());
			jogador.setResultado("Vitória");
			return jogador;
		}else if(jogador.getEscolha() == 2 && jogador2.getEscolha() == 0) {
			System.out.println("Papel ganha da Pedra, Vitória do Jogador: " + jogador.getNome());
			jogador.setResultado("Vitória");
			return jogador;
		}else if(jogador.getEscolha() == 1 && jogador2.getEscolha() == 0) {
			System.out.println("Pedra ganha da Tesoura, Vitória do Jogador: " + jogador2.getNome());
			jogador2.setResultado("Vitória");
			return jogador2;
		}else if(jogador.getEscolha() == 2 && jogador2.getEscolha() == 1) {
			System.out.println("Tesoura ganha do Papel, Vitória do Jogador: " + jogador2.getNome());
			jogador2.setResultado("Vitória");
			return jogador2;
		}else if(jogador.getEscolha() == 0 && jogador2.getEscolha() == 2) {
			System.out.println("Papel ganha da Pedra, Vitória do Jogador: " + jogador2.getNome());
			jogador2.setResultado("Vitória");
			return jogador2;
		}
		jogador.setResultado("Erro");
		return jogador;
	}

}
