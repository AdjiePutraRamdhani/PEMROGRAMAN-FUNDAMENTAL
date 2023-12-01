package TUGAS9;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mahasiswa extends JFrame {
    private JPanel panelMain;
    private JTextField textFieldNama;
    private JComboBox cbTahun;
    private JComboBox cbBulan;
    private JComboBox cbTgl;
    private JTextField textFieldAlamat;
    private JButton ButtonProses;
    private JTextArea textAreaNama;
    private JTextArea textAreaTanggalLahir;
    private JTextArea textAreaUsia;
    private JTextArea textAreaAlamat;


    public Mahasiswa() {
        setTitle("Data Mahasiswa");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        ButtonProses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nama = textFieldNama.getText();
                int tlTanggal = Integer.parseInt((String) cbTgl.getSelectedItem());
                int tlBulan = cbBulan.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt((String) cbTahun.getSelectedItem());
                String alamat = textFieldAlamat.getText();

                LocalDate tanggalSekarang = LocalDate.now ();
                LocalDate tanggalLahirPengguna = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                Period p = Period.between(tanggalLahirPengguna, tanggalSekarang);

                int tahun = p.getYears();
                int bulan = p.getMonths();
                int tanggal = p.getDays();

                textAreaNama.setText("Nama              :" + " " + nama);
                textAreaTanggalLahir.setText("Tanggal Lahir           :" + " " + tlTanggal + " " + cbBulan.getSelectedItem() + " " + tlTahun);
                textAreaAlamat.setText("Alamat              :" + " " + alamat);
                textAreaUsia.setText("Usia          :" + " " + tahun + " Tahun " + bulan + " Bulan " + tanggal + " Hari ");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswa dataMahasiswa = new Mahasiswa();
        dataMahasiswa.setVisible(true);
    }

}
