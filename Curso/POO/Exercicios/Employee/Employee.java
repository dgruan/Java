public class Employee {
    String name;
    double grossSalary, tax;
    
    double netSalary() {
        return grossSalary - tax;
    }
    
    void percentage(double percentage) {
        
    }
}
