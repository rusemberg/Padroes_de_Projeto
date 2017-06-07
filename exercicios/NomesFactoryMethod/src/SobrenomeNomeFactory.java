
public class SobrenomeNomeFactory extends NomeFactory {

	@Override
	public PrimeiroNome criarPrimeiroNome(String nome) {
		String[] nomes = new String[2];
		nomes = nome.split(",");
		return new PrimeiroNome(nomes[1]);
	}

	@Override
	public SegundoNome criarSegundoNome(String nome) {
		String[] nomes = new String[2];
		nomes = nome.split(",");
		return new SegundoNome(nomes[0]);
	}

}
