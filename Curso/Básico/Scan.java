import java.util.Scanner;

public class scan {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		
		System.out.print("Digite a palavra desejada: ");
		x = sc.next();
		System.out.print("Digite o número desejado: ");
		y = sc.nextInt();
		
		System.out.printf("Você digitou palavra: %s\n", x);
		System.out.printf("Você digitou o numero: %d", y);
		
		sc.close();
	}
}
