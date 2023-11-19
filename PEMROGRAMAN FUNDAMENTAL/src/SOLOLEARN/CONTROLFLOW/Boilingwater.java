package SOLOLEARN.CONTROLFLOW;

import  java.util.Scanner;

public class Boilingwater {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();

        if(sample >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
    }
}