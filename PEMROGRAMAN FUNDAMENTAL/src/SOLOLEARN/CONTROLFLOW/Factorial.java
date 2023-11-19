package SOLOLEARN.CONTROLFLOW;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for (int x = 1; x <= num; x++) {
            fact *= x;
        }
        System.out.println(fact );
    }
}