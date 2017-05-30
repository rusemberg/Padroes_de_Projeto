package ifpb.pps.aluno.rusemberg;

import java.util.Scanner;

public class TesteInterface {

	public static void main(String[] args) {
		int x = 1, cod = 1;
		String texto;
		Scanner teclado = new Scanner(System.in);
		String nomeJogador1 = "Rusemberg";
		String nomeJogador2 = "Tavares";
		Jogo jogo;
		AlgoritmoDistribuicao distribuir = null;

		if (x == 1) {
			distribuir = new RetirarApenasCima();
		} else if (x == 2) {
			distribuir = new RetirarBaixoCima();
		} else if (x == 3) {
			distribuir = new RetirarAleatorio();
		} else {
			System.out.println("Informe um valor válido para o Algoritmo de Sistribuição!");
			System.exit(0);
		}

		jogo = new Jogo(distribuir, nomeJogador1, nomeJogador2);

		System.out.println("Iniciar a partida?");
		System.out.println("0 - NÃO ");
		System.out.println("1 - SIM ");
		texto = teclado.nextLine();
		cod = Integer.parseInt(texto);

		while (jogo.getRodadas() < 10 && cod != 0) {
			jogo.setRodadas(jogo.getRodadas() + 1);
			System.out.println("***** RODADA " + jogo.getRodadas() + " *****");
			jogo.getDistribuir().retirarCartas(jogo.getBaralho(), jogo.getJ1(), jogo.getJ2());
			System.out.println("Jogador1: " + jogo.getJ1().getNome() + " - " + jogo.getJ1().getUltimaCartaRetirada()
					+ " - " + jogo.getJ1().getPontos() + " pontos");
			System.out.println("Jogador2: " + jogo.getJ2().getNome() + " - " + jogo.getJ2().getUltimaCartaRetirada()
					+ " - " + jogo.getJ2().getPontos() + " pontos");
			System.out.println("Baralho: restando " + jogo.getBaralho().getCartas().size());
			System.out.println("****************************");

			System.out.println("Deseja uma nova rodada?");
			System.out.println("0 - NÃO ");
			System.out.println("1 - SIM ");
			texto = teclado.nextLine();
			cod = Integer.parseInt(texto);
		}

		if (jogo.getJ1().getPontos() == jogo.getJ2().getPontos() && jogo.getRodadas() != 0) {
			System.out.println("***** RODADA EXTRA *****");
			jogo.getDistribuir().retirarCartas(jogo.getBaralho(), jogo.getJ1(), jogo.getJ2());
			System.out.println("Jogador1: " + jogo.getJ1());
			System.out.println("Jogador2: " + jogo.getJ2());
			System.out.println("Baralho: restando " + jogo.getBaralho().getCartas().size());
			System.out.println("****************************\n\n");
		}
		if (jogo.getJ1().getPontos() > jogo.getJ2().getPontos()) {
			System.out.println("********* RESULTADO FINAL ***********");
			System.out.println(jogo.getJ1());
			System.out.println(jogo.getJ2());
			System.out.println("Jogador " + jogo.getJ1().getNome() + " é o vencedor!");
		} else if (jogo.getJ1().getPontos() < jogo.getJ2().getPontos()) {
			System.out.println("********* RESULTADO FINAL ***********");
			System.out.println(jogo.getJ1());
			System.out.println(jogo.getJ2());
			System.out.println("Jogador " + jogo.getJ1().getNome() + " é o vencedor!");
		} else {
			System.out.println("Inicio de partida cancelado!");
		}
	}

}
