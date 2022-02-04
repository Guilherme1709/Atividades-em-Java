package questao4;

public class Principal {
	public static void main(String[] args) {
		try {
			System.out.println("inicio do main");
			metodo1();
			System.out.println("fim do main");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("A quantidade de números é inválida!");
		}
	}
	
	static void metodo1() {
		System.out.println("inicio metodo 1");
		metodo2();
		System.out.println("fim metodo1");
	}
	
	static void metodo2() {
		System.out.println("inicio metodo2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim metodo2");
	}
}
