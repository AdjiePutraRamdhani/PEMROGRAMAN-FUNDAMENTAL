package TUGAS5;

import java.util.Scanner;

public class Deretfor1 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Membuat Deret Angka  ##");
        System.out.println("========================================");
        System.out.println();

        int jumlahDeret;
        int i;

        System.out.print("Jumlah deret yang diinginkan: ");
        jumlahDeret = input.nextInt();
        System.out.println();

        for (i=1; i<=jumlahDeret; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}