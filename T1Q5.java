import java.util.Scanner;

public class T1Q5 {
    public static void main(String[] args) {
        Scanner _scn = new Scanner(System.in);
        System.out.print("Enter minimum number : ");
        int min = _scn.nextInt();
        
        System.out.print("Enter maximum number : ");
        int max = _scn.nextInt();

        System.out.println("List of odd numbers between "+ min+" and "+max + " are");
        int totalOdd = 0;
        for(int i = min; i<=max;i++) {
            if(i % 2 != 0) { 
                System.out.print(i);
                totalOdd+=i;
                System.out.print(", ");
            }
        }
        System.out.println("\nTotal odd number between "+ min + " and " + max + " is ");
        System.out.println(totalOdd);
    }
}