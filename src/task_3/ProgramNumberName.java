package task_3;

import java.util.Scanner;

public class ProgramNumberName {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char [] res = abc.toCharArray();
        System.out.println(" Enter the name ");
        Scanner scanner = new Scanner(System.in);
        String str1 =scanner.next();
        char [] res2 = str1.toCharArray();
        int sum =0;
        for (int i = 0; i <res.length ; i++) {

            int a = res[i];
            for (char value : res2) {
                if (a == value) {
                    System.out.print("[" + i + "]");
                    break;
                }
            }
            for (char c : res2) {
                if (a == c) {
                    sum = i + sum;
                }
            }
        }System.out.print( "sum = "+sum);
    }
}




