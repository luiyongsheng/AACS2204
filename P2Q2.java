class Average {
    public static double calculateAverage(int x, int y) {
        return avg(x,y);
    }
    public static double calculateAverage(double x, double y) {
        return avg(x,y);
    }
    public static double calculateAverage(int x, int y, int z) {
        return avg(x,y,z);
    }
    public static double calculateAverage(double x, double y, double z) {
        return avg(x,y,z);
    }
    public static double avg(double... all) {
        double marker = 0;
        for(int i = 0; i < all.length; i++)
            marker += all[i];
        return (marker / all.length);
    }
}
public class P2Q2 {
    public static void main(String[] args) {
        double x = 72.3,y = 83,z = 94;
        int p = 62, q = 53, r = 40;

        System.out.format("Average of x,y,z (Double) : %.2f\n", Average.calculateAverage(x, y, z));
        System.out.format("Average of x,y (Double) : %.2f\n", Average.calculateAverage(x, y));
        System.out.format("Average of p,q,r (Int) : %.2f\n", Average.calculateAverage(p, q, r));
        System.out.format("Average of p,q (Int) : %.2f\n", Average.calculateAverage(p, q));
    }
}