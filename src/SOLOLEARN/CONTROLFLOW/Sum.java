package SOLOLEARN.CONTROLFLOW;

import  java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();

        int sum = 0;
        int num = 0;

        while(num <= sample) {
            sum += num;
            num++;
        }
        System.out.println(sum);

    }

}