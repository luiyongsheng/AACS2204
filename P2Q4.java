
class altMath {
    public static double epsilon = 1e-15;
    public static double sqrt(double x) {
        if(x == 0) return 0;
        else if (x < 0) { return -1; } // negative value as error indicator as java does not contain nullable type
        x = Math.abs(x);
        double low, high, mid = 0;
        low = Math.min(1,x);
        high = Math.max(1,x);
        // precision
        while(!(((high - low) / low) <= epsilon)) {
            mid = (low + high) / 2;
            if((mid * mid) <= x) {
                low = mid;
            }
            else high = mid;
        }
        return low;
    }
    public static double newtonSqrt(double x) {
        if(x < 0) return Double.NaN;
        double t = x;

        while(Math.abs(t - x/t) > epsilon * t) 
            t = (x/t + t) / 2.0;
        
        return t;
    }
}

public class P2Q4 {
    public static void main(String[] args) {
        for(double i = 0; i < 20; i += 0.5) {
            System.out.println("sqrt("+ i +") = " + altMath.newtonSqrt(i));
        }
    }
}
