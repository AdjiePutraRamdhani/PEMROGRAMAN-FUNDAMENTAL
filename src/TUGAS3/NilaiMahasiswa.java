package TUGAS3;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nama:" );
        String nama = sc.nextLine();

        System.out.println("Masukkan Nilai: ");
        int nilai = sc.nextInt();
        System.out.println("----------------------------------");

        if (nilai >= 70 || nilai <= 100) {
            System.out.println("Nama Mahasiswa: "+ nama);
            System.out.println("Nilai: "+ nilai);
            System.out.println("Keterangan: LULUS");
            System.out.println("----------------------------------");
        } else {
            System.out.println("Nama Mahasiswa: "+ nama);
            System.out.println("Nilai: "+ nilai);
            System.out.println("Keterangan: TIDAK LULUS");
            System.out.println("----------------------------------");
        }

    }
}