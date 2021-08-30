// não pode instanciar dessa classe, porque é abstrata
public abstract class Funcionário {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// metodo sem corpo, não há implementação
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
