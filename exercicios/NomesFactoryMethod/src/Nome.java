public class Nome{
	private PrimeiroNome nome;
	private SegundoNome sobrenome;
	
	public PrimeiroNome getNome() {
		return nome;
	}
	public void setNome(PrimeiroNome nome) {
		this.nome = nome;
	}
	public SegundoNome getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(SegundoNome sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		return "Nome [nome = "+nome.getPrimeiroNome()+", sobrenome= "+sobrenome.getSegundoNome()+"]";
	}
	
}

