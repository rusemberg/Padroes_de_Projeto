package locadora;

public class Aluguel {
	private Fita fita;
	private int diasAlugada;
	private int codPrecoFita;

	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}

	public Fita getFita() {
		return fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}
	
	public int getCodigoPrecoFita(){
		int cod;
		cod = fita.getCódigoDePreço();
		return cod;
	}
	
	public String getTituloFita(){
		String titulo = "";
		return titulo+=fita.getTítulo();
	}
}
