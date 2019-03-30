package metodosAgeis;

import org.junit.Assert;
import org.junit.Test;

public class TestesPo {

	@Test
	public void empate() {
		Jogador j = new Jogador(0, "Nelson");
		Jogador j2 = new Jogador(0, "Faberson");
		Boolean retornoEsperado = Boolean.TRUE;
		Boolean teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	@Test
	public void pedra() {
		Jogador j = new Jogador(1, "Nelson");
		Jogador j2 = new Jogador(0, "Faberson");
		Boolean retornoEsperado = Boolean.TRUE;
		Boolean teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	@Test
	public void tesoura() {
		Jogador j = new Jogador(2, "Nelson");
		Jogador j2 = new Jogador(1, "Faberson");
		Boolean retornoEsperado = Boolean.TRUE;
		Boolean teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	@Test
	public void Papel() {
		Jogador j = new Jogador(0, "Nelson");
		Jogador j2 = new Jogador(2, "Faberson");
		Boolean retornoEsperado = Boolean.TRUE;
		Boolean teste = Jokenpo.resultadoPo(j, j2);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	
}
