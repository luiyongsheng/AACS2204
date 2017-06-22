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
public class P4Q1 {
    public static void main(String[] args) {
        
    }
}