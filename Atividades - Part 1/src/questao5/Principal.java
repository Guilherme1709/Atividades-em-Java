package questao5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eu sei dividir!");
		
		while(true) {
			try {
				System.out.println("Informe o primeiro valor: ");
				int x = teclado.nextInt();
				System.out.println("Informe o segundo valor: ");
				int y = teclado.nextInt();
				double r = (x/y);
				System.out.println("O resultado da soma é: " + r);
				break;
			} catch(InputMismatchException e) {
				System.out.println("O valor não é inteiro!");
				teclado.next();
				continue;
			} catch(ArithmeticException e) {
				System.out.println("Não existe divisão por zero!");
				continue;
			}
		}
		
		teclado.close();
	}
}
