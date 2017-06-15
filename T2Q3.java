import java.lang.Math;
class NetPayer {
    
    public double hourlyPayRate = 8.5f;
    public double taxReduxRate = 15.00f;
    public static double k = 625;
    public NetPayer() {

    }
    public double computeNetPay(double hoursWorked, double hourlyPayRate, double taxReduxRate) {
        return ((hoursWorked * hourlyPayRate) * ((100-taxReduxRate) / 100));
    }
    public double computeNetPay(double hoursWorked, double hourlyPayRate) {
        return computeNetPay(hoursWorked, hourlyPayRate, taxReduxRate);
    }
    public double computeNetPay(double hoursWorked) {
        return computeNetPay(hoursWorked, hourlyPayRate, taxReduxRate);
    }
}
public class T2Q3 {

    public static void main(String[] args) {
        double x=10,y=20,z=30;
        System.out.println(Math.sqrt(Math.pow(x,(1/y))));
        for(int i=0;i<100;i++) System.out.println((int)(Math.random() * 100));
        NetPayer np = new NetPayer();
        NetPayer np2 = new NetPayer();
        System.out.println("RM " + np.computeNetPay(8) + " paid");
        System.out.println("RM " + np.k + " paid");
        np.k = 1000;
        System.out.println("RM " + np2.k + " paid");
    
    }
}