class EmployeeExtra {
    private String name;
    private double salary;
    EmployeeExtra(String employeeName, double currentSalary) {
        this.name = employeeName;
        this.salary = currentSalary;
    }
    public void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }
    public String getName() {
        return this.name;
    }
    public void setName(String val) {
        this.name = val;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double val) {
        this.salary = val;
    }

}
public class P4Q1b {
    public static void main(String[] args) {
        EmployeeExtra emp = new EmployeeExtra("Lui Yong Sheng", 97803.30);
        System.out.format("%s's salary before 8%% salary raise : RM %.2f\n",
                         emp.getName(), emp.getSalary());
        emp.raiseSalary(8);
        
        System.out.format("%s's salary after 8%% salary raise : RM %.2f\n",
                         emp.getName(), emp.getSalary());
    }

}