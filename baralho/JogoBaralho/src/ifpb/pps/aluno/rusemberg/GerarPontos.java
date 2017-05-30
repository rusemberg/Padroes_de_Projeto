package ifpb.pps.aluno.rusemberg;

public class GerarPontos {
	private static int valorJogador1;
	private static int valorJogador2;
	private static int valorNaipe1;
	private static int valorNaipe2;
	
	
	public static void setPontosJogadores(Jogador j1, Jogador j2){
		
		if(j1.getUltimaCartaRetirada().getNumero().equals("A")){
			valorJogador1 = 1;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("2")){
			valorJogador1 = 2;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("3")){
			valorJogador1 = 3;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("4")){
			valorJogador1 = 4;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("5")){
			valorJogador1 = 5;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("6")){
			valorJogador1 = 6;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("7")){
			valorJogador1 = 7;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("8")){
			valorJogador1 = 8;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("9")){
			valorJogador1 = 9;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("10")){
			valorJogador1 = 10;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("J")){
			valorJogador1 = 11;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("Q")){
			valorJogador1 = 12;
		}
		else if(j1.getUltimaCartaRetirada().getNumero().equals("K")){
			valorJogador1 = 13;
		}
		
		
		if(j2.getUltimaCartaRetirada().getNumero().equals("A")){
			valorJogador2 = 1;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("2")){
			valorJogador2 = 2;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("3")){
			valorJogador2 = 3;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("4")){
			valorJogador2 = 4;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("5")){
			valorJogador2 = 5;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("6")){
			valorJogador2 = 6;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("7")){
			valorJogador2 = 7;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("8")){
			valorJogador2 = 8;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("9")){
			valorJogador2 = 9;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("10")){
			valorJogador2 = 10;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("J")){
			valorJogador2 = 11;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("Q")){
			valorJogador2 = 12;
		}
		else if(j2.getUltimaCartaRetirada().getNumero().equals("K")){
			valorJogador2 = 13;
		}
		
		
		if(j1.getUltimaCartaRetirada().getNaipe().equals("espada")){
			valorNaipe1 = 1;
		}
		else if(j1.getUltimaCartaRetirada().getNaipe().equals("paus")){
			valorNaipe1 = 2;
		}
		else if(j1.getUltimaCartaRetirada().getNaipe().equals("ouro")){
			valorNaipe1 = 3;
		}
		else if(j1.getUltimaCartaRetirada().getNaipe().equals("copas")){
			valorNaipe1 = 4;
		}
		
		if(j2.getUltimaCartaRetirada().getNaipe().equals("espada")){
			valorNaipe1 = 1;
		}
		else if(j2.getUltimaCartaRetirada().getNaipe().equals("paus")){
			valorNaipe1 = 2;
		}
		else if(j2.getUltimaCartaRetirada().getNaipe().equals("ouro")){
			valorNaipe1 = 3;
		}
		else if(j2.getUltimaCartaRetirada().getNaipe().equals("copas")){
			valorNaipe1 = 4;
		}
		
		if(valorJogador1 > valorJogador2){
			j1.addPontos(1);
		}
		else if(valorJogador1 < valorJogador2){
			j2.addPontos(1);
		}
		else{
			if(valorNaipe1 > valorNaipe2){
				j1.addPontos(1);
			}
			else{
				j2.addPontos(1);
			}
		}
		
	}
}
