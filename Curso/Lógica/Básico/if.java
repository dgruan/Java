import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: ");
		double nota = sc.nextDouble();
		
		if(nota >= 6.0){
		    System.out.println("Aluno aprovado!");
		    System.out.printf("Nota: %.1f",nota);
		}else{
		    System.out.println("Aluno reprovado!");
		    System.out.printf("Nota: %.1f", nota);
		}
	sc.close();	
	}
}
