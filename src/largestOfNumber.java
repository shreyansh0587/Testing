import java.util.Scanner;

public class largestOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a>b && a>c){
            System.out.println("Number a is gratest"+ a);

        } else if (b>a && b>c) {
            System.out.println("Number b is grater"+b);

        }else
            System.out.println("Number c is grater"+c);

    }
}
