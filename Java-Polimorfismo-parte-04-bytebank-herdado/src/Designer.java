// Gerente eh um Funcionário, Gerente herda da class Funcionário
public class Designer extends Funcionário {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
		
	}

}
