import javax.swing.JOptionPane;

public class Teste {

	private static Nome montarNome(String nome, String forma){
		NomeFactory nf = null;
		if(forma.equals("linear")){
			nf = new NomeSobrenomeFactory();
		}
		else if(forma.equals("invertido")){
			nf = new SobrenomeNomeFactory();
		}
		else{
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			System.exit(0);
		}
		
		Nome nomePronto = new Nome();
		nomePronto.setNome(nf.criarPrimeiroNome(nome));
		nomePronto.setSobrenome(nf.criarSegundoNome(nome));
		
		return nomePronto;
	}

	public static void main(String[] args) {
		Nome nome = montarNome("Rusemberg Tavares", "linear");
		System.out.println(nome);
		System.out.println(nome.getClass());
	}

}
