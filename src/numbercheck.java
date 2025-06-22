import java.util.Scanner;

public class numbercheck {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int s1 = scaner.nextInt();
        if (s1==0){
            System.out.println("number is zero");
        } else if (s1<0) {
            System.out.println("Number is negative");


        }else {
            System.out.println("Mumber is positive");

        }
        }


    }

