package TUGAS5;

import java.util.Scanner;

public class Kuadratfor3 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Membuat Deret Angka Kuadrat  ##");
        System.out.println("================================================");
        System.out.println();

        int jumlahDeret;
        int i;

        System.out.print("Jumlah deret yang diinginkan: ");
        jumlahDeret = input.nextInt();
        System.out.println();

        for (i=1; i<=jumlahDeret; i++) {
            System.out.print(i*i + " ");
        }

        System.out.println();
    }
}