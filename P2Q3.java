import java.math.*;
public class P2Q3 {
    public static void main(String[] args) {
        System.out.println("Number\t\tSquareRoot");
        for(int i = 0; i <= 20; i+=2) 
            System.out.format("%d\t\t%.4f\n", i, Math.sqrt(i));
    }
}