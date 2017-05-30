package ifpb.pps.aluno.rusemberg;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Baralho baralho = new Baralho();
		Jogador jogador1, jogador2;
		jogador1 = new Jogador("Rusemberg");
		jogador2 = new Jogador("Tavares");

		System.out.println("********************************************");
		for (Carta carta : baralho.getCartas()) {
			System.out.println(carta);
		}
		System.out.println("********************************************");
		System.out.println("Numero de cartas do baralho: " + baralho.getCartas().size());

		System.out.println("\n\nEMBARALHAMENTO DAS CARTAS");
		List<Carta> cartas = null;
		cartas = baralho.embaralhamento(cartas);
		for (Carta carta : cartas) {
			System.out.println(carta);
		}
		System.out.println("************************************************\n\n");

		System.out.println("********************************************");
		System.out.println("Testando retirar apenas cima");

		System.out.println("Jogadores sem retirar cartas");
		System.out.println("Jogador1");
		System.out.println(jogador1.toString() + "\n");
		System.out.println("Jogador2");
		System.out.println(jogador2.toString() + "\n");

		RetirarApenasCima retirar = new RetirarApenasCima();
		baralho = retirar.retirarCartas(baralho, jogador1, jogador2);

		System.out.println("Jogadores após retirar cartas");
		System.out.println("Jogador1");
		System.out.println(jogador1.toString() + "\n");
		System.out.println("Jogador2");
		System.out.println(jogador2.toString() + "\n");
		System.out.println("Tamanho baralho: " + baralho.getCartas().size());

		System.out.println("Jogadores sem retirar cartas 2");
		System.out.println("Jogador1");
		System.out.println(jogador1.toString() + "\n");
		System.out.println("Jogador2");
		System.out.println(jogador2.toString() + "\n");

		baralho = retirar.retirarCartas(baralho, jogador1, jogador2);

		System.out.println("Jogadores após retirar cartas 2");
		System.out.println("Jogador1");
		System.out.println(jogador1.toString() + "\n");
		System.out.println("Jogador2");
		System.out.println(jogador2.toString() + "\n");
		System.out.println("Tamanho baralho: " + baralho.getCartas().size());

		System.out.println("********************************************\n\n");

		System.out.println("Testando Retirar Baixo e Cima");
		RetirarBaixoCima retirar2 = new RetirarBaixoCima();
		baralho = retirar2.retirarCartas(baralho, jogador1, jogador2);
		System.out.println("Tamanho do baralho: " + baralho.getCartas().size());
		System.out.println("Jogador1\n" + jogador1.toString());
		System.out.println("Jogador2\n" + jogador2.toString());

		System.out.println("********************************************\n\n");

		System.out.println("Testando Retirar aleatorio");
		RetirarAleatorio retirar3 = new RetirarAleatorio();
		baralho = retirar3.retirarCartas(baralho, jogador1, jogador2);
		System.out.println("Tamanho do baralho: " + baralho.getCartas().size());

		System.out.println("Jogador1\n" + jogador1);
		System.out.println("Jogador2\n" + jogador2);

	}

}
