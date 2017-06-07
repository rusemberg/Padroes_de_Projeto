
public class Incremental {
	private static int count = 0;
	private static Incremental incremental;
	private static int numero;
	
	public static Incremental getInstance(){
		if(count == 0){
			numero = ++count;
			incremental = new Incremental();
			return incremental;
		}
		else{
			numero = count;
			return incremental;
		}
	}
	
	public String toString(){
		return "Incremental "+numero;
	}
	
	public static Incremental getIncremental(){
		return incremental;
	}
}
