package UAS;


import javax.swing.*;

public class RunUASForm {
    public static void main(String[] args) {
        JFrame data = new JFrame("FORM BILANGAN GANJIL");
        data.setContentPane(new UASForm().getMain());
        data.setSize(512, 480);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);
    }
}
