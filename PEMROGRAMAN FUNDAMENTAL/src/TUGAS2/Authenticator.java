package TUGAS2;

import javax.swing.JOptionPane;

public class Authenticator {
    public static void main(String args[]) {
        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");

        if (username != null && password != null
                &&(
                (username.equals("adjie") && password.equals("adjie123")) ||
                        (username.equals("adjiermdhn") && password.equals("adjie456"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "Selamat Datang.");

        } else {
            JOptionPane.showMessageDialog(null,"Username atau password salah.");
        }
    }
}