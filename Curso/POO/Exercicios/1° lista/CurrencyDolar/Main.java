package application; 

import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    
        double dollar;
        double dollarBought;
	    
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    System.out.print("What is the dollar price? ");
	    dollar = sc.nextDouble();
	    System.out.print("How many dollars will be bought? ");
	    dollarBought = sc.nextDouble();
	    System.out.print("Amount to be paid in reais = ");
	    
	    sc.close();
	}
}
