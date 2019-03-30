package metodosAgeis;

import java.util.Scanner;

public class MiniKataFizzBuzz {

	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um número: \n");
		numero = s.nextInt();
		jogando(numero);
	}
	
	public static Boolean jogando(int numero) {
		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("\nFizzBuzz");
			return true;
		} else if (numero % 3 == 0) {
			System.out.println("\nFizz");
			return true;
		} else if (numero % 5 == 0) {
			System.out.println("\nBuzz");
			return true;
		} else {
			System.out.println("\n" + numero);
			return true;
		}
	}

}
