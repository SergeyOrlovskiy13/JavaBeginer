package task_4;


import java.util.Scanner;

public class sumData {
    public static void main(String[] args) {
        System.out.println("Enter data in format day, month, year ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] res = str.toCharArray();
        System.out.println(res);
        int n = res.length;

        int[] res1 = new int[n];
        for (int i = 0; i < res.length; i++) {
            res1[i] = res[i] - 48;
        }
       int sum = res1[0] + res1[1]+res1[3]+res1[4]+res1[6]+res1[7]+res1[8]+res1[9];
        System.out.println("sum = " + sum);
            }
        }


