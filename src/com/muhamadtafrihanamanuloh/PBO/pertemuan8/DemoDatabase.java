package com.muhamadtafrihanamanuloh.PBO.pertemuan8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DemoDatabase extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JTextField textNama;
    private JTextField textNim;
    private JSpinner spinnernilai;
    private JButton buttonClear;
    private JButton buttonSubmit;

    private DefaultTableModel model;
    public DemoDatabase(){
        super("Demo Database");

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 300);
    }

    public static void main(String[] args) {
        JFrame mainFrame = new DemoDatabase();
        mainFrame.setVisible(true);
    }
}
