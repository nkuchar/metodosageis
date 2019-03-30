package metodosAgeis;

import java.util.Scanner;

public class MiniKataFizzBuzz {

	public static void main(String[] args) {
		int numero;
		KataFizzBuzz kata = new KataFizzBuzz();
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um número: \n");
		numero = s.nextInt();
		kata.setRetorno(jogando(numero));
	}

	public static String jogando(int numero) {
		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("FizzBuzz");
			return "FizzBuzz";
		} else if (numero % 3 == 0) {
			System.out.println("Fizz");
			return "Fizz";
		} else if (numero % 5 == 0) {
			System.out.println("Buzz");
			return "Buzz";
		} else
			return String.valueOf(numero);
	}
}
