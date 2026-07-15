import java.util.Locale;
import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, hrsTrab;
		double valHora;
		
		System.out.print("Digite o seu número de funcionário: ");
		num = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		hrsTrab = sc.nextInt();
		System.out.print("Digite quanto você recebe por hora: ");
		valHora = sc.nextDouble();
		
		double salario = valHora * hrsTrab;
		
		Locale.setDefault(Locale.US);
		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f", salario);
		sc.close();
	}
}
