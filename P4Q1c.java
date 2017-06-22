class EmployeeX {
    String name;
    double salary;
    EmployeeX(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    EmployeeX(String employeeName) {
        name = employeeName;
        salary = 0.00;
    }

    EmployeeX() {
        name = "";
        salary = 0.00;
    }
    void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }

}
public class P4Q1c {
    public static void main(String[] args) {
        EmployeeX[] exs = new EmployeeX[2];
        exs[0] = new EmployeeX("Lui Yong Sheng", 9000);
        exs[1] = new EmployeeX("James Gosling", 12583);
        double maxPoint = 0; int highIndex = 0; double totalSalary = 0;
        for(int i = 0; i < exs.length; i++) {
            totalSalary += exs[i].salary;
            double tmp = maxPoint;
            maxPoint = Math.max(maxPoint, exs[i].salary);
            if(maxPoint != tmp) {
                highIndex = i;
            }
        }
        System.out.format("%s has the highest salary which is $%.2f\n",
                         exs[highIndex].name, exs[highIndex].salary);
        System.out.format("The total salary is $%.2f\n", totalSalary);
    }
}