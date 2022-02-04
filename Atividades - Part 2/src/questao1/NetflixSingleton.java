package questao1;

public class NetflixSingleton {
	private static NetflixSingleton instancia;
	
	private String filme;
	private String genero;
	
	private NetflixSingleton() {
		
	}
	
	public static NetflixSingleton GetInstance() {
		if(instancia == null)
			instancia = new NetflixSingleton();
		return instancia;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Netflix" + "\nFilme: " + filme + "\nGênero: " + genero;
	}
	
	
	
}
