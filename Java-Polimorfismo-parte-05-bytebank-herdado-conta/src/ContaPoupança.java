
public class ContaPoupanša {
	
	public ContaPoupanša(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
