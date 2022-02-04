package questao3;

public class Forma {
	private FormaGeometricaInterface forma;
	
	public Forma(String forma) {
		this.forma = FormaGeometricaFactory.CriaForma(forma);
	}
	
	public FormaGeometricaInterface getForma() {
		return this.forma;
	}
}
