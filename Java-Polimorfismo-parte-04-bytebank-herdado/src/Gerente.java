// Gerente eh um Funcion�rio, Gerente herda da class Funcion�rio, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcion�rio implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
