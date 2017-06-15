import java.util.Scanner;
class UnitConverter {
    public static double inchToCentimeter(double in) {
        return in * 2.54;
    }
    public static double centimeterToInch(double cm) {
        return cm / 2.54;
    }
}
public class P2Q1 {
    public static void main(String[] args) {
        System.out.println("Inches\t\tCentimeters\tCentimeters\tInches");
        for(int i = 1; i<= 10; i++) {
            System.out.format("%.1f\t\t%.2f\t\t%.1f\t\t%.2f\n", 
            (float)i, (float)UnitConverter.inchToCentimeter(i),
            (float)(i * 5), (float)UnitConverter.centimeterToInch(i*5));
        }
    }
}