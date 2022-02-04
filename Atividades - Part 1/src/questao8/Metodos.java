package questao8;
import java.io.*;

public class Metodos extends Exception{
	
	 public int metodo1(int x, int y) throws ArithmeticException, IOException {
		 
		 FileInputStream arquivo = new FileInputStream("JavaMelhorQueC");
		 
		 arquivo.close();
		 
		 return x/y;	 
	 }
}
