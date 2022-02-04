package questao3;

public class Principal {
	public static void main(String[] args) {
		Forma losango = new Forma("losango");
		FormaGeometricaInterface forma = losango.getForma();
		forma.desenhar();
	}
}
