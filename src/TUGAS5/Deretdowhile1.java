package TUGAS5;

import java.util.Scanner;

public class Deretdowhile1 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Membuat Deret Angka  ##");
        System.out.println("========================================");
        System.out.println();

        int jumlahDeret;
        int i = 1;

        System.out.print("Jumlah deret yang diinginkan: ");
        jumlahDeret = input.nextInt();
        System.out.println();

        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= jumlahDeret);
        System.out.println(" ");
    }
}