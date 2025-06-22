import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        char operator=scanner.next().charAt(0);

        int b=scanner.nextInt();
        System.out.println("Enter an operator (+, -, *, /): ");
        int result;
switch (operator){
    case '+' :
         result=a+b;
        System.out.println(result);
        break;

    case '-':
        result=a-b;
        System.out.println(result);
        break;
    case '*':
        result =a*b;
        System.out.println(result);
        break;

    case '/':
        result =a/b;
        System.out.println(result);
        break;
    case '%':
        result =a%b;
        System.out.println(result);
        break;
}
    }
}
