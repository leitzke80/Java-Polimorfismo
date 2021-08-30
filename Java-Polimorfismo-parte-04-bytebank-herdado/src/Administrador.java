
public class Administrador extends Funcionário implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override 
	public double getBonificaco() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		 this..autenticador.setSenha(senha);
		}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
