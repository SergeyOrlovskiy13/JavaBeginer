package task_1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum =0;
        int remainder;
        do {
            remainder= num % 10;
            sum = sum+ remainder;
            num = num/10;
        } while (num >0);

        System.out.println("sum = " + sum);
    }
}
