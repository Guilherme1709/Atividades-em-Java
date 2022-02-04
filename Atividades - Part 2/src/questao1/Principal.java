package questao1;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		NetflixSingleton cadastrarFilme = NetflixSingleton.GetInstance();
		System.out.println("Primeiro cadastro: ");
		cadastrarFilme.setFilme("As Tranças do Rei Careca");
		cadastrarFilme.setGenero("Ficcão Científica");
		System.out.println(cadastrarFilme);
		
		NetflixSingleton novoCadastro = NetflixSingleton.GetInstance();
		System.out.println("\nNovo cadastro: ");
		System.out.println(novoCadastro);
		
		if(cadastrarFilme == novoCadastro) {
			System.out.println("\nUma única instância da classe NetflixSingleton foi criada para toda a aplicação!");
		}
		
	}
}
