package TUGAS7;

import java.util.Scanner;
public class SimpelArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah data : ");
        int a;
        a = sc.nextInt();

        System.out.println();
        System.out.println("Inputkan data berikut : ");

        int[] angka = new int[a];
        int x;
        for(x=0; x<angka.length; x++) {
            System.out.print("Data ke-"+x+": ");
            angka[x] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Menampilkan data : ");

        for(int b=0; b<angka.length; b++) {
            int y = angka[b] % 2;
            if (y == 0) {
                System.out.println(angka[b]+" -> GENAP");
            } else {
                System.out.println(angka[b]+" -> GANJIL");
            }
        }
        System.out.println();

        int sum = 0;
        for(int i: angka) {
            sum += i; }
        System.out.println("TOTAL PENJUMLAHAN : "+sum);
        double rataRata = sum;
        System.out.println("RATA-RATA : "+rataRata/a);
    }
}