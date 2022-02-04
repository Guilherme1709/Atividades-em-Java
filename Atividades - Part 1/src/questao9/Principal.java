package questao9;

public class Principal {
	public static void main(String[] args) {
		Metodos metodosObj = new Metodos();
		
		try {
			metodosObj.someMethod();
			
		} catch(ArithmeticException excecao) {
			excecao.printStackTrace();
		}
	}
}
