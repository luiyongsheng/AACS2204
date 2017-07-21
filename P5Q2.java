import java.util.Scanner;

public class P5Q2 {
    public <T> boolean contains(final T[] array, final T v) { for (final T e : array) { if (e == v || v != null && v.equals(e)) { return true; } } return false; }

    public static void main(String[] args) {
        System.out.print("Enter String : ");
        Scanner scn = new Scanner(System.in);
        String data = scn.nextLine();
        data = data.toUpperCase();
        // The shortest, quickest and most efficient way
        data = data.replaceAll("\\B[AEIOU]\\B", "X");
        System.out.println(data);
    }
   
   
}