package TUGAS3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nilai minimum: ");
        int min = sc.nextInt();

        System.out.print("Nilai maksimum: ");
        int max = sc.nextInt();

        System.out.print("Interval: ");
        int interval = sc.nextInt();

        if ((max - min) % interval == 0) {
            int n = (max - min) / interval;
            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum =  sum + min;
                min = min + interval;
                i = i + 1;
            }

            System.out.println("Total Sum: " + sum);
        } else {
            System.out.println("Sum tidak bisa dihitung");
        }

    }
}