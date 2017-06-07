public class SegundoNome {
	private String segundoNome;
	
	public SegundoNome(String sobrenome){
		this.segundoNome = sobrenome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	@Override
	public String toString() {
		return "SegundoNome [segundoNome=" + segundoNome + "]";
	}
}
