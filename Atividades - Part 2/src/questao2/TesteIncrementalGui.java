package questao2;

public class TesteIncrementalGui {
	public static void main(String[] args) throws Exception {
		
		for(int i = 0; i < 10; i++) {
			IncrementalGui inc = IncrementalGui.GetInstance();
			System.out.println(inc);
		}
	}
}
