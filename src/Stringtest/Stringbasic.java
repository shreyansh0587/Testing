package Stringtest;

import java.util.Scanner;

public class Stringbasic {
    public static void main(String[] args) {
        //Scanner scanner=new Scanner(System.in);
        //String a=scanner.next();
        String a="hello world";
        System.out.println("Length:"+a.length());
        System.out.println("Length:"+a.charAt(0));
       // String str = "hello world";
        // Extract "worl" using substring
        String result = a.substring(6, 11); // Start index is inclusive, end index is exclusive
        System.out.println(result); // Output: worl
    }
}
