package TUGAS3;

import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int angka = sc.nextInt();

        sc.close();

        if (angka < 0 || angka > 100) {
            System.out.println("Angka tidak valid");
        } else {
            double index = angka / 25.0;

            char huruf;
            if (index >= 3.5) {
                huruf = 'A';
            } else if (index >= 2.5) {
                huruf = 'B';
            } else if (index >= 1.5) {
                huruf = 'C';
            } else if (index >= 0.5) {
                huruf = 'D';
            } else {
                huruf = 'E';
            }

            System.out.println("Nilai index: " + index);
            System.out.println("Nilai huruf: " + huruf);
        }
    }
}