package metodosAgeis;

import java.util.Scanner;

public class MiniKataFizz {

	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);

		System.out.println("Informe um número: \n");
		numero = s.nextInt();

		if (numero % 3 == 0) {
			System.out.println("\n Fizz");
		} else {
			System.out.println("\n" + numero);
		}
	}

}
