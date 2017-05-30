package ifpb.pps.aluno.rusemberg;

import java.util.Random;

public class RetirarAleatorio implements AlgoritmoDistribuicao {
	private Carta carta1, carta2;
	private int sorteado;

	public RetirarAleatorio() {

	}

	public Baralho retirarCartas(Baralho baralho, Jogador jogador1, Jogador jogador2) {
		Random gerador = new Random();
		sorteado = gerador.nextInt(baralho.getCartas().size());
		carta1 = baralho.getCartas().get(sorteado);
		baralho.getCartas().remove(sorteado);
		jogador1.setUltimaCartaRetirada(carta1);
		jogador1.getCartas().add(carta1);

		sorteado = gerador.nextInt(baralho.getCartas().size());
		carta2 = baralho.getCartas().get(sorteado);
		baralho.getCartas().remove(sorteado);
		jogador2.setUltimaCartaRetirada(carta2);
		jogador2.getCartas().add(carta2);

		GerarPontos.setPontosJogadores(jogador1, jogador2);

		return baralho;
	}
}
