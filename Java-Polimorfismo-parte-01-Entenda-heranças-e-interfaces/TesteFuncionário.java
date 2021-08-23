
public class TesteFuncionário {

	public static void main(String[] args) {
		
		Funcionário nico = new Funcionário();
		nico.setNome("Nico steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		// nico.salario = 300.0;
	}
}
