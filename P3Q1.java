import java.util.Scanner;
public class P3Q1 {
    public static void main(String[] args) {
        
        Scanner _scn = new Scanner(System.in);
        int total = 0;
        do {
            if(total == -1) System.out.println("Index out of bound.");
            System.out.print("Enter number of quiz scores to process: ");
            total = _scn.nextInt();

            if(total > 1000) total = -1;
        } while(total < 1);
        int[] arr = new int[total]; int sum = 0;

        for(int i = 0; i< total; i++) {
            System.out.format("Score %d : ", i + 1);
            arr[i] = _scn.nextInt();
            sum += arr[i];

        }
        double avg = (double)sum / total;
        System.out.println();
        System.out.println("Results");
        System.out.println("=======");
        System.out.format("Average is %.2f\n", (avg));
        int aboveOrEqual = 0, below = 0;
        for(int j = 0; j <total;j++) {
            if((double)arr[j] >= avg) aboveOrEqual++;
            else below++;
        }
        System.out.format("Number of scores above or equal to the average is %d.\n", aboveOrEqual);
        
        System.out.format("Number of scores below the average is %d.\n", below);
    }
}