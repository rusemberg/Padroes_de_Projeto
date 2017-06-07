package locadora;

import java.util.*;

public class Cliente {

	private String nome;
	private Collection<Aluguel> alugueis = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		alugueis.add(aluguel);
	}
	
	public Collection<Aluguel> getAlugueis(){
		return this.alugueis;
	}

}