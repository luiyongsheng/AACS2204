class formulaMath {
    public static double sum(double... args) {
        return operation(1, args);
    }
    public static double difference(double... args) {
        return operation(2, args);
    }
    public static double product(double... args) {
        return operation(3, args);
    }
    public static double division(double... args) {
        return operation(4, args);
    }
    public static double operation(int method, double... args) {
        // method
        // 1 sum, 2 diff, 3 prod, 4 div
        double finalVal = 0;
        if(method < 1 || method > 4) method = 1;
        finalVal = args[0];
        for(int i= 1; i < args.length; i++) {
            switch(method) {
                case 1:
                finalVal += args[i];
                break;
                case 2:
                finalVal -= args[i];
                break;
                case 3:
                finalVal *= args[i];
                break;
                case 4:
                finalVal /= args[i];
                break;
            }
        }
        return finalVal;
    }
}


public class P2Q0 {
    public static void main(String[] args) {
        formulaMath m = new formulaMath();
        int x = 10, y = 10, z = 10;
        System.out.println("Sum : "+ m.sum(x,y,z));
        System.out.println("Diff : "+ m.difference(x,y,z));
        System.out.println("Product : "+ m.product(x,y,z));
        System.out.println("Division : "+ m.division(x,y,z));
    }
}