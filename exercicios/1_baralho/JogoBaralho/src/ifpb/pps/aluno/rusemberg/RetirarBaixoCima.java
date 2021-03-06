package ifpb.pps.aluno.rusemberg;

public class RetirarBaixoCima implements AlgoritmoDistribuicao {
	Carta carta1, carta2;

	public RetirarBaixoCima() {

	}

	public Baralho retirarCartas(Baralho baralho, Jogador jogador1, Jogador jogador2) {
		if (baralho.getCartas().size() < 2) {
			return null;
		}
		carta1 = baralho.getCartas().get(0);
		carta2 = baralho.getCartas().get(baralho.getCartas().size() - 1);
		baralho.getCartas().remove(0);
		baralho.getCartas().remove(baralho.getCartas().size() - 1);
		jogador1.setUltimaCartaRetirada(carta1);
		jogador1.getCartas().add(carta1);
		jogador2.setUltimaCartaRetirada(carta2);
		jogador2.getCartas().add(carta2);

		GerarPontos.setPontosJogadores(jogador1, jogador2);

		return baralho;
	}
}
