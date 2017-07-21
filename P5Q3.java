import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P5Q3 {
    public static void main(String[] args) {
        System.out.print("Enter password : ");
        Scanner scn = new Scanner(System.in);
        String pwd = scn.nextLine();
        Pattern rules = Pattern.compile("(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]{7,})");
        Matcher matcher = rules.matcher(pwd);
        if(matcher.matches()) {
            System.out.println("Valid Password");
        }
        else System.out.println("Invalid Password");
    }
}