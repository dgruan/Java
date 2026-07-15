import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, pi = 3.14159;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A= %.4f", area);
		
		sc.close();
	}
}
