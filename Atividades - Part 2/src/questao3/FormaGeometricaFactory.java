package questao3;

public class FormaGeometricaFactory {

	public static FormaGeometricaInterface CriaForma(String forma) {
		if(forma == null)
			return null;
		
		if (forma.equals("losango")) {
			return new Losango();
		}
		
		else if (forma.equals("Paralelogramo")) {
			return new Paralelogramo();
		}
		
		else if (forma.equals("Pentágono")) {
			return new Pentagono();
		}
		
		return null;
	}
}
