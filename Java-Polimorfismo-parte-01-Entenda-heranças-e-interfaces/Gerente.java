// Gerente eh um Funcion�rio, Gerente herda do class Funcion�rio
public class Gerente extends Funcion�rio {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

		public double getBonificacao() {
		 	return (this.salario * 0.1) + super.salario;
		 }
}
		
