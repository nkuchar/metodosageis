package metodosAgeis;

import org.junit.Assert;
import org.junit.Test;

public class TestesPo {

	@Test
	public void empate() {
		Jogador j = new Jogador(0, "Nelson");
		Jogador j2 = new Jogador(0, "Faberson", "Empate");
		String retornoEsperado = j2.getResultado();
		Jogador teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste.getResultado());
	}
	
	@Test
	public void pedra() {
		Jogador j = new Jogador(1, "Nelson");
		Jogador j2 = new Jogador(0, "Faberson", "Vitória");
		String retornoEsperado = j2.getResultado();
		Jogador teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste.getResultado());
	}
	
	@Test
	public void tesoura() {
		Jogador j = new Jogador(2, "Nelson");
		Jogador j2 = new Jogador(1, "Faberson", "Vitória");
		String retornoEsperado = j2.getResultado();
		Jogador teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste.getResultado());
	}
	
	@Test
	public void Papel() {
		Jogador j = new Jogador(0, "Nelson");
		Jogador j2 = new Jogador(2, "Faberson", "Vitória");
		String retornoEsperado = j2.getResultado();
		Jogador teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste.getResultado());
	}
	
	
}
