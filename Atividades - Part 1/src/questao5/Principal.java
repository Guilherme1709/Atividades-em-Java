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
				System.out.println("O resultado da soma �: " + r);
				break;
			} catch(InputMismatchException e) {
				System.out.println("O valor n�o � inteiro!");
				teclado.next();
				continue;
			} catch(ArithmeticException e) {
				System.out.println("N�o existe divis�o por zero!");
				continue;
			}
		}
		
		teclado.close();
	}
}
