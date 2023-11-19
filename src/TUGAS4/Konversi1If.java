package TUGAS4;

import java.util.Scanner;

public class Konversi1If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai Huruf : ");
        String huruf = sc.nextLine();

        if (huruf.equals("A")) {
            System.out.println("Nilai index : 4.0");
        } else if (huruf.equals("B")) {
            System.out.println("Nilai index : 3.0");
        } else if (huruf.equals("C")) {
            System.out.println("Nilai index : 2.0");
        } else if (huruf.equals("D")) {
            System.out.println("Nilai index : 1.0");
        } else if (huruf.equals("E")) {
            System.out.println("Nilai index : 0");
        } else {
            System.out.println("Nilai tidak valid.");
        }

    }
}