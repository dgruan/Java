import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor; 
		
		System.out.print("Digite o valor: ");
		valor = sc.nextInt();
		
		if(valor > 0) {
			System.out.print("POSITIVO!");
		}else{
			System.out.print("NEGATIVO!");

		}
		sc.close();
	}
}
