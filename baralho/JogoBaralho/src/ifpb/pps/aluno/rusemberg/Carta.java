package ifpb.pps.aluno.rusemberg;

public class Carta {
	private String numero;
	private String naipe;
	
	public Carta(String numero, String naipe){
		super();
		this.numero = numero;
		this.naipe = naipe;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", naipe=" + naipe + "]";
	}
	
}
