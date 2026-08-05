import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student student = new Student();
		
		System.out.print("Digite o nome do aluno: ");
		student.name = sc.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		student.n1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		student.n2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		student.n3 = sc.nextDouble();
		
		double finalGrade = student.totalGrade();
		
		if(finalGrade >= 60){
		    System.out.printf("FINAL GRADE = %.2f\n", finalGrade);
		    System.out.print("PASS");
		}
		else{
		    System.out.printf("FINAL GRADE = %.2f\n", finalGrade);
		    System.out.println("FAILED");
		    System.out.printf("MISSING %.2f POINTS", 60.00 - finalGrade);
		}
		sc.close();
	}
}
