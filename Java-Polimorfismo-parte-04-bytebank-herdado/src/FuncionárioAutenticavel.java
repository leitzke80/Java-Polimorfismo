// contatro Autenticavel
	// quem assinar esse contrato, precisa implementar
		// método setSenha
		// método autentica
public class Autenticavel {
	
	private int senha;
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha);
	if(this.senha == senha) {
		return true;
	} else {
		return false;
		}
	}
}

