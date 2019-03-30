package metodosAgeis;

import org.junit.Assert;
import org.junit.Test;

public class TestesKama {
	
	@Test
	public void fizz() {
		int numero = 3;
		String retornoEsperado = "Fizz";
		String teste = MiniKataFizzBuzz.jogando(numero);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	@Test
	public void buzz() {
		int numero = 5;
		String retornoEsperado = "Buzz";
		String teste = MiniKataFizzBuzz.jogando(numero);
		Assert.assertEquals(retornoEsperado, teste);
	}
	
	@Test
	public void fizzBuzz() {
		int numero = 30;
		String retornoEsperado = "FizzBuzz";
		String teste = MiniKataFizzBuzz.jogando(numero);
		Assert.assertEquals(retornoEsperado, teste);
	}
	

}
