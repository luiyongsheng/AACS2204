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
    public int cakeTypeIndex;
    public int cakeWeight;
    public int quantity;

    OrderNode() {
        this.cakeTypeIndex = -1;
        this.cakeWeight = -1;
        this.quantity = 0;
    }
}
public class P4Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList < Cake > cakesAvailable = new ArrayList < Cake > ();
        String[] flavors = new String[] {
            "Chocolate Moist",
            "Strawberry",
            "Blueberry",
            "American Chocolate",
            "Tiramisu"
        };
        double[] basePrices = new double[] {
            40,
            50,
            45,
            55,
            30
        };
        for (int i = 0; i < flavors.length; i++) {
            cakesAvailable.add(new Cake(flavors[i], basePrices[i]));
        }
        System.out.println("Mickey Cake House");
        System.out.println();
        System.out.print("How many types of cake you would like to order: ");
        int orderNo = input.nextInt();
        System.out.println("\tNo Flavours\t\t\t   1kg\t\t   2kg\t\t   3kg");
        int index = 1;
        for (Cake c: cakesAvailable) {
            System.out.format("\t%d. %-20s\t\t", index, c.flavor);
            double[] prices = c.getPrices();
            for (double price: prices) {
                System.out.format("RM %.2f\t", price);
            }
            System.out.println();
            index++;
        }
        System.out.println();
        orderNo = Math.min(orderNo, 10);
        OrderNode[] orders = new OrderNode[orderNo];
        for(int i = 0; i < orderNo; i++) {
            orders[i] = new OrderNode();
            System.out.println("Cake item " + (i + 1));
            System.out.println("--------------");
            System.out.print("Enter your choice of cake flavour (1 - 5): ");
            orders[i].cakeTypeIndex = Math.min(input.nextInt() - 1, 4); // shift to left
            System.out.print("Enter the weight of the cake (1 - 1kg, 2 - 2kg and 3 - 3kg): ");
            orders[i].cakeWeight = Math.min(input.nextInt(), 3);
            
        }
    }
}
