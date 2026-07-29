public class Employee {
    String name;
    double grossSalary, tax, percentage;
    
    double netSalary() {
        return grossSalary - tax;
    }
}
