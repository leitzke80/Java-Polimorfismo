
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcion�rio f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
