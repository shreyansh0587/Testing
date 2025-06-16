import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String s1 = scaner.next();
        System.out.println("string eneterd");
        String mainstring = s1.replace(" ", "").toLowerCase();
        System.out.println("mainstring string eneterd---" + mainstring);
        String reversestring = new StringBuilder(mainstring).reverse().toString();
        System.out.println("reversestring string eneterd--" + reversestring);
        if (mainstring.equals(reversestring)) {
            System.out.println("Palindrom");

        } else
            System.out.println("Not pelindrom");
    }
}
