package application; 

import java.util.Scanner;
import java.util.Locale;
import bo.CurrencyConverter;

public class Main
{
	public static void main(String[] args) {
	    
        double dollar;
        double dollarBought;
        
        Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("What is the dollar price? ");
	    dollar = sc.nextDouble();
	    System.out.print("How many dollars will be bought? ");
	    dollarBought = sc.nextDouble();
	    
	    double totalPay = CurrencyConverter.amountToBePaid(dollar, dollarBought);
	    
	    System.out.printf("Amount to be paid in reais = %.2f", totalPay);
	    
	    sc.close();
	}
}
