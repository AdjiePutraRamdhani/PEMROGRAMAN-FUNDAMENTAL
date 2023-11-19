package TUGAS3;

import java.util.Scanner;

public class HitungUmur {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tahun Sekarang : ");
        int TS = sc.nextInt();

        System.out.println("Tahun Lahir : ");
        int TL = sc.nextInt();
        System.out.println("-------");

        int umur = TS - TL;

        System.out.println("Umur Anda Sekarang : "+umur+" Tahun");

    }
}