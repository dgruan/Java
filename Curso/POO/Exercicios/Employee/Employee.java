public class Employee {
    String name;
    double grossSalary, tax;
    
    double netSalary() {
        return grossSalary - tax;
    }
    
    void increaseSalary(double percentage) {
        grossSalary += (grossSalary * percentage) / 100;
    }
}
