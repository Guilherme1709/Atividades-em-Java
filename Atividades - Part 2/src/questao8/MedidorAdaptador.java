package questao8;

public class MedidorAdaptador implements MedidorCelciusInterface{
	private MedidorFarenheit adaptador;
	@Override
	public double medirTemperatura(double celcinho) {
		double far = adaptador.getTemperaturaFarenheit() ;
		celcinho = (far - 32) / 1.8;
		System.out.println("Temperatura convertida!");
		return celcinho;
	}
}
