package com.muhamadtafrihanamanuloh.PBO.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    private JTextField textNama;
    private JTextField textNim;
    private JComboBox comboProdi;
    private JTextField textTelepon;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JTextArea textAlamat;
    private JButton buttonSave;
    private JButton buttonClear;
    private JLabel Textnama;
    private JPanel mainPanel;
    private JLabel TextAlamat;
    private JLabel namaLabel;
    private JLabel nimLabel;

    public Registration (){
        super( "Formulir Registrasi Pendaftaran Kuliah");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize( 800,600);
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNama.setText("");
                textNim.setText("");
                textTelepon.setText("");
                textAlamat.setText("");
                comboProdi.setSelectedIndex(0);
                lakiLakiRadioButton.setSelected(false);
                perempuanRadioButton.setSelected(false);
            }
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String NIM = textNim.getText();
                String prodi = (String) comboProdi.getSelectedItem();
                String telp = textTelepon.getText();
                String alamat = textAlamat.getText();
                String JK;
                if(lakiLakiRadioButton.isSelected()){
                    JK = "Laki-laki";
                } else if (perempuanRadioButton.isSelected()){
                    JK = "Perempuan";
                } else {
                    JK = "Tidak diketahui";
                }
                // menampilkan respon
                JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }

}
