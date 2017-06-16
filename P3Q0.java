import java.util.Scanner;
public class P3Q0 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many numbers to calculate: ");
        int num = scn.nextInt();

        int[] input_nums = new int[num];
        int total = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            input_nums[i] = scn.nextInt();
            total += input_nums[i];
        }
        System.out.println("Total of " + num + " numbers is " + total);
    }
}
