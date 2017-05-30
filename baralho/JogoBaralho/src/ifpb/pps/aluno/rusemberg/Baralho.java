package ifpb.pps.aluno.rusemberg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	private ArrayList<Carta> baralho = new ArrayList<Carta>(52);

	public Baralho() {
		ArrayList<String> naipes = this.iniciandoNaipes();
		ArrayList<String> numeros = this.inicandoNumeros();
		baralho = inicializandoBaralho(naipes, numeros);
		baralho = (ArrayList<Carta>) this.embaralhamento(baralho);
	}

	public List<Carta> getCartas() {
		return baralho;
	}

	public void setCartas(ArrayList<Carta> baralho) {
		this.baralho = baralho;
	}

	@Override
	public String toString() {
		return "Baralho [baralho=" + baralho + "]";
	}

	public ArrayList<String> iniciandoNaipes() {
		ArrayList<String> naipes = new ArrayList<String>();
		naipes.add("espadas");
		naipes.add("paus");
		naipes.add("copas");
		naipes.add("ouro");
		return naipes;
	}

	public ArrayList<String> inicandoNumeros() {
		ArrayList<String> numeros = new ArrayList<String>();
		numeros.add("A");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
		numeros.add("5");
		numeros.add("6");
		numeros.add("7");
		numeros.add("8");
		numeros.add("9");
		numeros.add("10");
		numeros.add("J");
		numeros.add("Q");
		numeros.add("K");
		return numeros;
	}

	public ArrayList<Carta> inicializandoBaralho(ArrayList<String> naipes, ArrayList<String> numeros) {
		for (String naipe : naipes) {
			for (String numero : numeros) {
				Carta carta = new Carta(numero, naipe);
				baralho.add(carta);
			}
		}
		return baralho;
	}

	public List<Carta> embaralhamento(List<Carta> cartas) {
		Collections.shuffle(cartas);
		return cartas;
	}

}
