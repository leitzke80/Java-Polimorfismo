
public class AutenticaçãoUtil {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticou(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
