import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números que você deseja: ");
		int N = sc.nextInt();
		int cont=0, in = 0, out = 0;
		
		do{
		  System.out.print("Digite o número: ");
		  int X = sc.nextInt();
		  
		  if(X >= 10 && X <= 20){
		      in++;
		  }else{
		      out++;
		  }
		  cont++;  
		}while(cont < N);
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out", out);
		sc.close();
	}
}
