package metodosAgeis;

import java.util.Scanner;

public class MiniKataBuzz {

	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);

		System.out.println("Informe um número: \n");
		numero = s.nextInt();

		if (numero % 5 == 0) {
			System.out.println("\n Buzz");
		} else {
			System.out.println("\n" + numero);
		}
	}

}
