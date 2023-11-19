package SOLOLEARN.METHODS;

import java.util.Scanner;

public class Convert {
    //your code goes here
    static void convert(double num) {
        System.out.println(num*12);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }
}