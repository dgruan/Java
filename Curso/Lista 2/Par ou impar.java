import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor; 
		
		System.out.print("Digite o valor: ");
		valor = sc.nextInt();
		
		if(valor%2 == 0) {
			System.out.print("PAR!");
		}else{
			System.out.print("IMPAR!");
		}
		sc.close();
	}
}
