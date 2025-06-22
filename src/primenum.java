import java.util.Scanner;
import java.util.SortedMap;

public class primenum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int i=1;
        for (i=1;i<=a;i++){
            if (i%2!=0){
                System.out.println(i);

            }
        }
    };
}
