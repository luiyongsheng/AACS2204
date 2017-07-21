import java.util.*;
public class P5Q1 {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        System.out.print("Enter the letter you want to count: ");
        String ch = scn.nextLine();
        System.out.format("'%s' contains %d %c\n", word, countLetter(word, ch.charAt(0)), ch.charAt(0));
    }
    public static int countLetter(String str, char ch) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) count++;
        }
        return count;
    }
}
