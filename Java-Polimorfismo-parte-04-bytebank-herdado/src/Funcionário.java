// n�o pode instanciar dessa classe, porque � abstrata
public abstract class Funcion�rio {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// metodo sem corpo, n�o h� implementa��o
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
