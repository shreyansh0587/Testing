import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();

        switch (day){
            case 1:
            System.out.println("Mon");
            break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sund");
        }
        System.out.println("Not week days");

    }
}
