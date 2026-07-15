import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v1, v2, soma;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextInt();
		
		soma = v1 + v2;
		
		System.out.printf("SOMA: %d", soma);
		
		sc.close();
	}
}
