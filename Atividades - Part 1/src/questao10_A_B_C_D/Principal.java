package questao10_A_B_C_D;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Scanner leNums = new Scanner(System.in);
		int opcao = 0;
		Calculator teste = new Calculator();
		
		while(true) {
			System.out.println("Digite a operação que deseja realizar\n1 - Divisão\n2 - Logaritmo\n");
			opcao = leNums.nextInt();
			
			if(opcao == 1)
				try {
					teste.div(0, 0);
				} catch (InvalidOperationException e) {
					e.printStackTrace();
				}
			
			if(opcao == 2)
				try {
					teste.log10(0);
				} catch (InvalidOperationException e) {
					e.printStackTrace();
				}
			
			if(opcao == 0)
				System.out.println("Calculadora encerrada!");
				break;
		}
		
		leNums.close();
	}
}
