package questao3B;

public class Empregado {
	private String ID;
	private String nome;
	private double salario;
	private int data;
	
	public Empregado(String ID, String nome, double salario, int data) {
		this.ID = ID;
		this.nome = nome;
		this.salario = salario;
		this.data = data;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
