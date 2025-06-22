import java.util.Scanner;

public class factorialwhileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       // scanner.close();
        int number = scanner.nextInt();
        int factorial = 1;
        int i = 1;
         while (i<=number) {
             System.out.println("print i--"+i);
             factorial=factorial*i;
             System.out.println("print factorial--"+i);

             i++;
         }
        System.out.println("Factorial of "+number+" is: "+factorial);
        scanner.close();
        }


    }

