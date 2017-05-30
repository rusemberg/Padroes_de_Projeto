package ifpb.pps.aluno.rusemberg;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
	private int rodadas = 0;
	private Jogador j1, j2;
	private Baralho baralho;
	private AlgoritmoDistribuicao distribuir;

	public Jogo(AlgoritmoDistribuicao distribuir, String nomeJogador1, String nomeJogador2) {
		this.j1 = new Jogador(nomeJogador1);
		this.j2 = new Jogador(nomeJogador2);
		this.baralho = new Baralho();
		this.distribuir = distribuir;
	}

	public Jogador getJ1() {
		return j1;
	}

	public void setJ1(Jogador j1) {
		this.j1 = j1;
	}

	public Jogador getJ2() {
		return j2;
	}

	public void setJ2(Jogador j2) {
		this.j2 = j2;
	}

	public Baralho getBaralho() {
		return baralho;
	}

	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}

	public AlgoritmoDistribuicao getDistribuir() {
		return distribuir;
	}

	public void setDistribuir(AlgoritmoDistribuicao distribuir) {
		this.distribuir = distribuir;
	}

	public int getRodadas() {
		return rodadas;
	}

	public void setRodadas(int rodadas) {
		this.rodadas = rodadas;
	}

	@Override
	public String toString() {
		return "Jogo [j1=" + j1 + ", j2=" + j2 + ", baralho=" + baralho + ", distribuir=" + distribuir + "]";
	}

}
