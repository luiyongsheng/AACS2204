
class altMath {
    public static double epsilon = 1e-15;
    public static double sqrt(double x) {
        if(x == 0) return 0;
        else if (x < 0) { return -1; } // negative value as error indicator as java does not contain nullable type
        double low, high, mid = 0;
        low = Math.min(1,x);
        high = Math.max(1,x);
        // precision
        while(!((high - low) / low <= epsilon)) {
            mid = (low + high) / 2;
            if((mid * mid) <= x) {
                low = mid;
            }
            else high = mid;
        }
        return low;
    }
}

public class P2Q4 {
    public static void main(String[] args) {
        System.out.println(altMath.sqrt(2));
    }
}