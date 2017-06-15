import java.util.Scanner;
public class P3Q3 {
    public static void main(String[] args) {
        int[] dens = new int[]{100,50,20,10,5,1};
        int[] input = new int[dens.length];
        Scanner scn = new Scanner(System.in);
        System.out.println("Denomination (RM)\tQuantity");
        for(int i=0;i<input.length;i++) {
            System.out.format("%12d\t\t   ", dens[i]);
            input[i] = scn.nextInt();
        }
        System.out.println("Denomination (RM)\tQuantity\tValue (RM)");
        int total = 0;
        for(int i=0;i<input.length;i++) {
            int sum = (dens[i]*input[i]);
            if(sum > 0) System.out.format("%12d\t\t%5d\t\t%5d\n", dens[i], input[i], sum);
            total += sum;
        }
        System.out.println("Total = RM " + total);
    }
}