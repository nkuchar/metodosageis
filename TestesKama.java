package metodosAgeis;

import org.junit.Assert;
import org.junit.Test;

public class TestesKama {
	
	@Test
	public void fizz() {
		int numero = 3;
		Boolean retornoEsperado = Boolean.TRUE;
		Boolean teste = MiniKataFizzBuzz.jogando(numero);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	@Test
	public void buzz() {
		int numero = 5;
		Boolean retornoEsperado = Boolean.TRUE;
		Boolean teste = MiniKataFizzBuzz.jogando(numero);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	@Test
	public void fizzBuzz() {
		int numero = 30;
		Boolean retornoEsperado = Boolean.TRUE;
		Boolean teste = MiniKataFizzBuzz.jogando(numero);
		Assert.assertEquals(retornoEsperado, teste);
	}
	

}
