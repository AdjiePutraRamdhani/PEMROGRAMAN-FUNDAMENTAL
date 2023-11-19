package TUGAS2;

import static java.lang.System.out;
import java.util.Scanner;

public class Authenticator2 {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("adjie")) {
            out.print("Password: ");
            String password = keyboard.next();

            if (password.equals("adjie123")) {
                out.print("Berhasil login!");
            } else {
                out.print("Password salah");
            }
        } else {
            out.print("Anda siapa?");
        }
        keyboard.close();
    }

}