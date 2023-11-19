package TUGAS3;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Suhu (satuan celcius): ");
        int celcius = sc.nextInt();
        System.out.println("-------------------------------------");
        double farenheit = 1.8 * celcius + 32;
        double reamur = 0.8 * celcius;

        System.out.println("Suhu dalam Farenheit: "+ farenheit);
        System.out.println("Suhu dalam Reamur: "+ reamur);
        System.out.println("-------------------------------------");
    }


}