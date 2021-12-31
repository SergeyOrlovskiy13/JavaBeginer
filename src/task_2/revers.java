package task_2;

import java.io.Console;
import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        System.out.println("Enter number without null " );
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int remainder;
        int num2 =0;

        do {
            remainder = num %10;
            num=num/10;
            num2= num2*10;
            num2= num2+remainder;

        }while (num>0);
        System.out.print( +num2);
     }
}
