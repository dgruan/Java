import java.util.Scanner; 

public class Main

{
	public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o nome: ");
    String nome = sc.nextLine();
    System.out.println("Digite a idade: ");
    int idade = sc.nextInt();
    System.out.println("Digite a altura: ");
    double altura = sc.nextDouble();
    
    System.out.println("==== Dados da pessoa: ====");
    System.out.printf("Nome: %s\n", nome);
    System.out.printf("Idade: %d anos\n", idade);
    System.out.printf("Altura: %.2f metros\n",altura);
    System.out.println("==========================");
    
    sc.close();
	}
}
