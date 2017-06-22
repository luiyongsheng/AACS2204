class Employee{ 
   String name;
   double salary;

   Employee(String employeeName, double currentSalary)   {  
      name = employeeName;
      salary = currentSalary;
   }
   
   void raiseSalary(double percent){
      salary = salary + (salary * percent / 100.0);
   }
}
public class P4Q1a {
    public static void main(String[] args) {
        Employee emp = new Employee("Lui Yong Sheng", 97803.30);
        System.out.format("%s's salary before 8%% salary raise : RM %.2f\n",
                         emp.name, emp.salary);
        emp.raiseSalary(8);
        
        System.out.format("%s's salary after 8%% salary raise : RM %.2f\n",
                         emp.name, emp.salary);
    }
}