
public class ContaPoupan�a {
	
	public ContaPoupan�a(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
