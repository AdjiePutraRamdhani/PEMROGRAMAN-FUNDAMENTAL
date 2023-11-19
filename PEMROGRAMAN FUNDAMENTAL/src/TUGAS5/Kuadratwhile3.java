package TUGAS5;

import java.util.Scanner;

public class Kuadratwhile3 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Membuat Deret Angka Kuadrat  ##");
        System.out.println("================================================");
        System.out.println();

        int jumlahDeret;
        int i = 1;

        System.out.print("Jumlah deret yang diinginkan: ");
        jumlahDeret = input.nextInt();
        System.out.println();

        while (i <= jumlahDeret) {
            System.out.print(i*i + " ");
            i++;
        }
        System.out.println();
    }
}