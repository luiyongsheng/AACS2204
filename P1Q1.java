import java.util.Scanner;

public class P1Q1 {
    public static void main(String[] args) {
        Scanner _scn = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = _scn.nextLine();
        System.out.println();

        System.out.print("Enter your year of study : ");
        int year = _scn.nextInt();
        System.out.println();

        System.out.print("What is your target GPA for this semester? ");
        double gpa = _scn.nextDouble();
        System.out.println();

        System.out.println("Welcome " + name);
        System.out.println("Work hard to achieve your target GPA of "+ gpa +" this semester of your Year "+year+" ya.");
    }
}