package questao1;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		NetflixSingleton cadastrarFilme = NetflixSingleton.GetInstance();
		System.out.println("Primeiro cadastro: ");
		cadastrarFilme.setFilme("As Tran�as do Rei Careca");
		cadastrarFilme.setGenero("Ficc�o Cient�fica");
		System.out.println(cadastrarFilme);
		
		NetflixSingleton novoCadastro = NetflixSingleton.GetInstance();
		System.out.println("\nNovo cadastro: ");
		System.out.println(novoCadastro);
		
		if(cadastrarFilme == novoCadastro) {
			System.out.println("\nUma �nica inst�ncia da classe NetflixSingleton foi criada para toda a aplica��o!");
		}
		
	}
}
