package bo;

public class CurrencyConverter {
    
    public static double amountToBePaid(double dollar, double dollarBought) {
        double total = (dollar * dollarBought);
        
        return total + (total*6) / 100;
    }
}
