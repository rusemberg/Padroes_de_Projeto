
public class TesteIncremental {
	
	public static void main(String[] args){
		System.out.println(Incremental.getIncremental());
		for(int i = 0; i < 10; i++){
			Incremental inc = Incremental.getInstance();
			System.out.println((i+1)+" - "+inc);
		}
	}

}
