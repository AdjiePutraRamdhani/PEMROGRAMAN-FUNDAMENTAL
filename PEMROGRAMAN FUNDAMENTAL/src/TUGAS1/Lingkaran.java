package TUGAS1;

public class Lingkaran{
    public static void main(String[] abc){
        int jariJari = 13;
        final double phi = 3.14;
        double keliling = 2 * phi * jariJari;
        double luas = phi * jariJari * jariJari;

        System.out.println("r = "+jariJari);
        System.out.println("Keliling = "+keliling);
        System.out.println("Luas = "+luas);
    }
}