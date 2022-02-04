package questao2;

public class Funcionario {
	private String nome;
	private String salario;
	private String cargo;
	
	public Funcionario(String nome, String salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nSalário: " + salario + "\nCargo: " + cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
