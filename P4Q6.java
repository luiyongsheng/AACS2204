
import java.util.*;
class Cake {
    public String flavor;
    public double basePrice;

    Cake(String flavorName, double pricePerKg) {
        this.flavor = flavorName;
        this.basePrice = pricePerKg;
    }

    public double[] getPrices() {
        double[] prices = {
            basePrice,
            (basePrice * 2) - 5.00,
            (basePrice * 3) - 15.00
        };
        return prices;
    }

    public double getPriceByKg(int kg) {
        kg = Math.min(kg, 3);
        double[] prices = this.getPrices();
        return prices[kg - 1];
    }
}
class OrderNode {
    public Cake cakeType;
    public int cakeWeight;
    public int quantity;
}
public class P4Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Cake> cakesAvailable = new ArrayList<Cake>();
        String[] flavors = new String[]
        {
            "Chocolate Moist", "Strawberry", "Blueberry", "American Chocolate", "Tiramisu"
        };
        double[] basePrices = new double[]
        {
            40, 50, 45, 55, 30
        };
        for(int i=0; i < 5; i++) {
            cakesAvailable.add(new Cake(flavors[i], basePrices[i]));
        }
        System.out.println("Mickey Cake House");
        System.out.println();
        System.out.print("How many types of cake you would like to order: ");
        int orderNo = input.nextInt();
        System.out.println("No Flavours\t\t\t   1kg\t\t   2kg\t\t   3kg"); int index = 1;
        for(Cake c:cakesAvailable) {
            System.out.format("%d. %-20s\t\t", index, c.flavor);
            double[] prices = c.getPrices();
            for(double price : prices) {
                System.out.format("RM %.2f\t", price);
            }
            System.out.println();
            index++;
        }
    }
}
