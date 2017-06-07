public class PrimeiroNome {
	private String primeiroNome;
	
	public PrimeiroNome(String nome){
		this.primeiroNome = nome;
	}
	

	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	@Override
	public String toString() {
		return "PrimeiroNome [primeiroNome=" + primeiroNome + "]";
	}
	
}
