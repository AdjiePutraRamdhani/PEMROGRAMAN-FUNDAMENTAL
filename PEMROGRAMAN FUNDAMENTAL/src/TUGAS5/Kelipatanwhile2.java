package TUGAS5;

import java.util.Scanner;

public class Kelipatanwhile2 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Membuat Deret Angka Kelipatan  ##");
        System.out.println("==================================================");
        System.out.println();

        int kelipatan;
        int jumlahDeret;
        int i = 1;

        System.out.print("Angka kelipatan yang diinginkan: ");
        kelipatan = input.nextInt();
        System.out.print("Jumlah deret yang diinginkan: ");
        jumlahDeret = input.nextInt();
        System.out.println();

        while (i <= jumlahDeret) {
            System.out.print(i * kelipatan + " ");
            i++;
        }

        System.out.println();
    }
}