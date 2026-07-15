import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		
		double salMes;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
	    String nome = sc.nextLine();
	    System.out.print("Digite seu salário por hora: ");
	    double salHora = sc.nextDouble();
	    System.out.print("Digite a quantidade de horas trabalhadas por mês: ");
	    int horas = sc.nextInt();
	    
	    salMes = salHora * horas;
	    
	    System.out.println("\n==== FOLHA DE PAGAMENTO ====");
	    System.out.printf("Funcionário: %s\n", nome);
	    System.out.printf("Horas trabalhadas: %d\n", horas);
	    System.out.printf("Valor da hora: R$%.2f\n", salHora);
	    System.out.printf("Salário: R$%.2f\n", salMes);
	    System.out.print("============================");
	sc.close();	
	}
}
