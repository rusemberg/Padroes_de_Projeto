import java.lang.reflect.Array;

public abstract class NomeFactory {
	public abstract PrimeiroNome criarPrimeiroNome(String nome);

	public abstract SegundoNome criarSegundoNome(String nome);
}
