import java.util.Scanner;
public class T2Q2 {
    public static void main(String[] args) {
        Scanner _scn = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = _scn.nextInt();

        System.out.println(year + " is" + (isLeapYear(year) ? " " : " not ") + "a leap year.");
    }
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

}