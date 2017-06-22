class EmployeeX {
    String name;
    double salary;
    void EmployeeX(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    EmployeeX(String employeeName) {
        this.EmployeeX(employeeName, 0.00);
    }

    EmployeeX() {
        this.EmployeeX("", 0.00);
    }
    void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }

}
public class P4Q1c {
    public static void main(String[] args) {

    }
}