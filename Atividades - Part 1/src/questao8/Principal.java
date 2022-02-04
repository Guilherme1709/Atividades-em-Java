package questao8;
import java.io.*;

public class Principal {
	public static void main(String[] args) {
		Metodos teste = new Metodos();
		
		try {
			teste.metodo1(50, 0);
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fim");
		}
	}
}

