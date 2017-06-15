/*
    Bad Credit
    Cr: CS50

    @author Lui Yong Sheng
    @website    www.datasenz.com
*/
import java.util.Scanner;
import java.io.*;
public class P1Q3 {
    public static void main(String[] args) {
        Scanner _scn = new Scanner(System.in);
        String creditCardNumber ="";
        do {
            System.out.print("Enter credit card number : ");
            creditCardNumber = _scn.nextLine();
            creditCardNumber = creditCardNumber.replaceAll("\\s+","");
        } while(creditCardNumber.length() > 8);

        char[] chs = new char[creditCardNumber.length()];
        for(int i = 0; i<creditCardNumber.length();i++) {
            chs[i] = creditCardNumber.charAt(i);
        }
        int stepOne = 0, stepTwo = 0;
        
        for(int j = creditCardNumber.length() - 1; j >= 0 ; j--) {
            if(j % 2 != 0) {
                // odd index
                stepOne += Integer.parseInt(chs[j]+"");
            }
            else {
                int s2num = Integer.parseInt(chs[j]+"");
                s2num *= 2;
                int front = s2num / 10;
                int remainder = s2num % 10;
                stepTwo += (front + remainder);
            }
        }
        int stepThree = stepOne + stepTwo;
        String msg = " card number";
        int mods = stepThree % 10;
        if(mods == 0) 
            msg = "Valid" + msg;
        else {
            msg = "Invalid" + msg;
            int validNo = Math.abs(Integer.parseInt(chs[creditCardNumber.length()-1]+"") - mods);
            System.out.println("The last digit of your credit card may should be : " + validNo
            +"");
        }
        System.out.println(msg);
    }
}