import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);

	    double n1, n2, n3, media; 
	    
	    System.out.print("Quantidade de casos de teste: ");
	    int x = sc.nextInt();
	    
	    for(int i=1;i<=x;i++){
	        System.out.print("Nota 1: ");
	        n1 = sc.nextDouble();
	        System.out.print("Nota 2: ");
	        n2 = sc.nextDouble();
	        System.out.printf("Nota 3: ");
	        n3 = sc.nextDouble();
	        
	        media = (n1*2) + (n2*3) + (n3*5) / (2+3+5);
	        System.out.printf("Media ponderada: %.1f\n",media);
	    }
	}
}
