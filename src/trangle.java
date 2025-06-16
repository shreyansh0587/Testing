import java.util.Scanner;

public class trangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("equilateral trangle");

        } else if (a == b|| a==c||c==b) {
            System.out.println("Isosceles trangle");

        } else
            System.out.println("Scalen trangle");
    }
}

