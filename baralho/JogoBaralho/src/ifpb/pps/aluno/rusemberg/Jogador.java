package ifpb.pps.aluno.rusemberg;

import java.util.ArrayList;

public class Jogador {
	private String nome;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private Carta ultimaCartaRetirada;
	private int pontos;
	
	public Jogador(String nome){
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	public Carta getUltimaCartaRetirada() {
		return ultimaCartaRetirada;
	}
	public void setUltimaCartaRetirada(Carta ultimaCartaRetirada) {
		this.ultimaCartaRetirada = ultimaCartaRetirada;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void addPontos(int pontos){
		this.pontos += pontos;
	}
	
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", cartas=" + cartas + ", ultimaCartaRetirada=" + ultimaCartaRetirada
				+ ", pontos=" + pontos + "]";
	}
	
}
