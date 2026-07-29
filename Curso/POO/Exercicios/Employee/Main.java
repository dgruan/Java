import java.util.Scanner;
import java.util.Locale;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    Employee employee = new Employee();
        
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.print(employee.name + ", $ " + employee.netSalary());
	}
}
