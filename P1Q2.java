
import java.util.Scanner;

public class P1Q2 {
    public static void main(String[] args) {
        Scanner _scn = new Scanner(System.in);

        final int daysInAYear = 365;
        final int secondsInAYear = daysInAYear * 24 * 60 * 60;
        System.out.print("Enter your age (years) : ");
        int y = _scn.nextInt();
        System.out.println("Age in years : " + y + " years");
        System.out.println("Age in days : " + (y * daysInAYear) + " days");
        System.out.println("Age in seconds : "+ (y*secondsInAYear) + " seconds");
    }
}