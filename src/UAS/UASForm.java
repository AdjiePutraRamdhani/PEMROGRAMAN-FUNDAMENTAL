package UAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UASForm {
    private JButton button;
    private JTextArea textArea1;
    private JPanel main;
    private JTextArea textArea2;
    private JLabel label;

    public JPanel getMain(){
        return main;
    }

    public UASForm() {

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataForm data = new DataForm();
                textArea1.setText(String.valueOf(data.getBilanganGanjil()));
                textArea2.setText(data.getTotal());

                System.out.printf("Total : " + data.getBilanganGanjil());
            }
        });
    }
    }
